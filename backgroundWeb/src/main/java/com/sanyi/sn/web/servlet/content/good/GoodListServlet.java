package com.sanyi.sn.web.servlet.content.good;

import com.sanyi.sn.service.GoodService;
import com.sanyi.sn.service.impl.GoodServiceImpl;
import com.sanyi.sn.util.RequestUtils;
import com.sanyi.sn.vo.good.GoodVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 十年
 * @function 商品展示列表servlet
 * @date 2020/3/20 0020
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
@WebServlet("/pageContent/good/goodList")
public class GoodListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取商品数据
        GoodService goodService = GoodServiceImpl.newObj();
        //获取当前页数
        int page = Integer.parseInt(RequestUtils.getParameter(req,"pageIndex","0"));
        int pageContent = 5;
        int startNum = page*pageContent;
        List<GoodVo> goodVoList = goodService.getGoods(startNum,pageContent);
        //获取所有的搜索条数
        double allGoodCount = goodService.getGoodCount();
        //计算一共的页数
        double pageCount = Math.ceil(allGoodCount/pageContent);
        //设置进req
        req.setAttribute("activePage",page);
        req.setAttribute("goods",goodVoList);
        req.setAttribute("pageCount",pageCount);
        req.getRequestDispatcher("/WEB-INF/views/sn/content/good/goodList.jsp").forward(req, resp);
    }
}
