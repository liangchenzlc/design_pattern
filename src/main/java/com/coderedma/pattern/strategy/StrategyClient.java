package com.coderedma.pattern.strategy;

/**
 * @Author coderedma
 * @Desc 策略者模式的客户端
 * @createTime 2024/7/25 14:29
 * @since 1.0.0
 * 策略者模式
 */
public class StrategyClient {
    public static void main(String[] args) {
        ShopCar shopCar = new ShopCar(100);
        shopCar.calculatePrice(new OrdinaryMember());
        shopCar.calculatePrice(new SilverMember());
        shopCar.calculatePrice(new GoldMember());
    }
}
