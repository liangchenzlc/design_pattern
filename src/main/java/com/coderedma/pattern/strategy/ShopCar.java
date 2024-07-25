package com.coderedma.pattern.strategy;

/**
 * @Author coderedma
 * @Desc 购物车
 * @createTime 2024/7/25 14:25
 * @since 1.0.0
 */
public class ShopCar {

    // 购物车维护一个购物商品的总价
    private float shopPrice;

    public ShopCar(float shopPrice) {
        this.shopPrice = shopPrice;
    }

    public void calculatePrice(Member member)
    {
        System.out.println("购买商品应该支付: " + member.discount(shopPrice));
    }


    public void setShopPrice(float shopPrice)
    {
        this.shopPrice = shopPrice;
    }

}
