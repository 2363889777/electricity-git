package com.sanyi.sn.web.servlet.content.good;

import com.sanyi.sn.service.GoodService;
import com.sanyi.sn.service.impl.GoodServiceImpl;
import com.sanyi.sn.util.RequestUtils;
import com.xuetang9.jdbc.frame.factory.SqlSessionFactoryUits;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 十年
 * @function 商品页面功能处理servlet类
 * @date 2020/3/21 0021
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
@WebServlet("/pageContent/good/goodList/function")
public class GoodListFunctionServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 获取请求处理的内容
        String goodMarketing = RequestUtils.getParameter(req, "type");
        int goodId = Integer.parseInt(RequestUtils.getParameterNumber(req, "goodId"));
        String isChecked = RequestUtils.getParameter(req, "checkedState");
        //1.1 判断请求的内容是否正确
        if (goodMarketing == "" || goodId == -1 || isChecked == "") {
            resp.getWriter().write("请求格式错误");
            return;
        }
        GoodService goodService = GoodServiceImpl.newObj();
        //2. 判断是处理什么，上架，推荐，热销，应季
        switch (goodMarketing) {
            case "上架":
                putAway(goodService,isChecked, goodId, resp);
                break;
            case "推荐":
                goodRecommend(goodService,isChecked,goodId,resp);
                break;
            case "热销":
                goodHot(goodService,isChecked,goodId,resp);
                break;
            case "应季":
                goodSeasonal(goodService,isChecked,goodId,resp);
                break;
            default:
                //3. 返回处理结果
                resp.getWriter().write("不符合要求的处理！");
                break;
        }
    }
    /**
     * 商品上下架操作
     * @param isChecked 商品当前状态
     * @param goodId 商品Id
     * @param resp 返回对象
     * @throws ServletException
     * @throws IOException
     */
    private void putAway(GoodService goodService,String isChecked,int goodId,HttpServletResponse resp)throws ServletException, IOException{
        //商品上架，想设置为下架
        if(isChecked.equals("true")){
            System.out.println("执行下架");
            if(goodService.setGoodNotPutAway(goodId)){
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",下架成功!" );
                SqlSessionFactoryUits.commit();
            }else {
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",下架失败!" );
                SqlSessionFactoryUits.rollback();
            }
        }else {
            System.out.println("执行上架");
            if(goodService.setGoodPutAway(goodId)){
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",上架成功!" );
                SqlSessionFactoryUits.commit();
            }else {
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",上架失败!" );
                SqlSessionFactoryUits.rollback();
            }
        }
    }


    /**
     * 商品热销操作
     * @param goodService 商品服务类
     * @param isChecked 商品状态
     * @param goodId 商品Id
     * @param resp 返回请求
     * @throws ServletException
     * @throws IOException
     */
    private void goodHot(GoodService goodService,String isChecked,int goodId,HttpServletResponse resp)throws ServletException, IOException{
        //商品热销，想取消热销
        if(isChecked.equals("true")){
            System.out.println("取消热销");
            if(goodService.setGoodNotHot(goodId)){
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",取消热销成功!" );
                SqlSessionFactoryUits.commit();
            }else {
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",取消热销失败!" );
                SqlSessionFactoryUits.rollback();
            }

        }else {
            System.out.println("设置热销");
            if(goodService.setGoodHot(goodId)){
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",设置热销成功!" );
                SqlSessionFactoryUits.commit();
            }else {
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",设置热销失败!" );
                SqlSessionFactoryUits.rollback();
            }
        }
    }

    /**
     * 商品推荐操作
     * @param goodService 商品服务类
     * @param isChecked 商品状态
     * @param goodId 商品Id
     * @param resp 返回请求
     * @throws ServletException
     * @throws IOException
     */
    private void goodRecommend(GoodService goodService,String isChecked,int goodId,HttpServletResponse resp)throws ServletException, IOException{
        //商品推荐，想取消推荐
        if(isChecked.equals("true")){
            System.out.println("取消热销");
            if(goodService.setGoodNotRecommend(goodId)){
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",取消推荐成功!" );
                SqlSessionFactoryUits.commit();
            }else {
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",取消推荐失败!" );
                SqlSessionFactoryUits.rollback();
            }

        }else {
            System.out.println("设置推荐");
            if(goodService.setGoodRecommend(goodId)){
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",设置推荐成功!" );
                SqlSessionFactoryUits.commit();
            }else {
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",设置推荐失败!" );
                SqlSessionFactoryUits.rollback();
            }
        }
    }

    /**
     * 商品应季操作
     * @param goodService 商品服务类
     * @param isChecked 商品状态
     * @param goodId 商品Id
     * @param resp 返回请求
     * @throws ServletException
     * @throws IOException
     */
    private void goodSeasonal(GoodService goodService,String isChecked,int goodId,HttpServletResponse resp)throws ServletException, IOException{
        //商品应季，想取消应季
        if(isChecked.equals("true")){
            System.out.println("取消应季");
            if(goodService.setGoodNotSeasonal(goodId)){
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",取消应季成功!" );
                SqlSessionFactoryUits.commit();
            }else {
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",取消应季失败!" );
                SqlSessionFactoryUits.rollback();
            }

        }else {
            System.out.println("设置应季推荐");
            if(goodService.setGoodSeasonal(goodId)){
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",设置应季成功!" );
                SqlSessionFactoryUits.commit();
            }else {
                //3. 返回处理结果
                resp.getWriter().write("商品编号:"+ goodId+",设置应季失败!" );
                SqlSessionFactoryUits.rollback();
            }
        }
    }











}
