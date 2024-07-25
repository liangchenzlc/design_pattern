package com.coderedma.pattern.decorator;

/**
 * @Author coderedma
 * @Desc 装饰者客户端
 * @createTime 2024/7/25 10:59
 * @since 1.0.0
 */
public class DecoratorClient {
    public static void main(String[] args) {
        Drink drink = new MilkCoffee(new Coffee(10.0f, "咖啡"));
        System.out.println("花费了" + drink.cost());
        System.out.println(drink.getDescription());
    }
}
