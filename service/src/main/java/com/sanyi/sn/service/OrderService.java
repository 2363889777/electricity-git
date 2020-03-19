package com.sanyi.sn.service;

import com.sanyi.sn.vo.order.SimpleOrderMessageVo;

import java.util.List;

/**
 * @author 十年
 * @function 订单页面服务接口
 * @date 2020/3/19 0019
 * @place 公司
 * @ver 1.0.0
 * @copy 老九学堂
 */
public interface OrderService {
    /**
     * 取全部状态 订单信息
     * @param startNum 开始行数
     * @param endNum 结束行数
     * @return  订单信息
     */
    List<SimpleOrderMessageVo> getOrderSimpleMessage(int startNum, int endNum);

    /**
     * 根据订单状态名称 筛选 订单信息
     * @param startNum 开始行数
     * @param endNum 结束行数
     * @param orderState 订单状态名称
     * @return 订单信息
     */
    List<SimpleOrderMessageVo> getOrderSimpleMessage(int startNum, int endNum, String orderState);
}
