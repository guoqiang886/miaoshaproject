package com.miaoshaproject.service.model;

import java.math.BigDecimal;

/**
 * @author guoqiang
 * @create 2020/5/29 - 14:13
 */
public class OrderModel {

    // 订单号
    private String id;

    // 购买的用户id
    private Integer userId;

    // 购买的商品id
    private Integer itemId;

    // 若非空，则表示是以秒杀商品方式下单
    private Integer promoId;

    // 购买商品的单价，若promoId非空，则表示秒杀商品价格
    private BigDecimal itemPrice;

    // 购买的数量
    private Integer amount;

    // 购买的金额，若promoId非空，则表示秒杀商品价格
    private BigDecimal orderPrice;

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

}