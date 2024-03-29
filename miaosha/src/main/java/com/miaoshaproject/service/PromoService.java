package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

/**
 * @author guoqiang
 * @create 2020/5/31 - 13:45
 */
public interface PromoService {

    // 获取即将进行的或者正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);

    // 活动发布
    void publishPromo(Integer promoId);

    // 生成秒杀用的令牌
    String generateSecondKillToken(Integer promoId, Integer itemId, Integer userId);

}
