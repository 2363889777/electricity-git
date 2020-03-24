package com.sanyi.sn.web.servlet.content.good;

import com.sanyi.sn.service.GoodService;
import com.sanyi.sn.service.impl.GoodServiceImpl;
import com.sanyi.sn.vo.good.GoodClassifyVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 十年
 * @function 商品分类 处理
 * @date 2020/3/20 0020
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
@WebServlet("/pageContent/good/GoodClassifyList")
public class GoodClassifyListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取分类信息
        GoodService goodService = GoodServiceImpl.newObj();
        //
        List<GoodClassifyVo> goodClassifyVoList = goodService.getGoodClassifies(0,10);
        req.setAttribute("goodClassifies",goodClassifyVoList);
        req.getRequestDispatcher("/WEB-INF/views/sn/content/good/goodClassifyList.jsp").forward(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
