package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

/**
 * @author guoqiang
 * @create 2020/5/29 - 15:36
 */
public interface OrderService {

    // 方案1：通过前端url传来的秒杀活动id，然后下单接口内检验对应id是否属于对应商品且活动已开始(使用这种方案)
    // 方案2：直接在下单接口内判断对应的商品是否存在秒杀活动，若存在进行中的秒杀则以秒杀价格下单
    OrderModel createOrder(Integer userId, Integer itemId, Integer promoId, Integer amount, String stockLogId) throws BusinessException;

}
