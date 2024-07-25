package com.coderedma.pattern.decorator;

/**
 * @Author coderedma
 * @Desc 加了牛奶的咖啡 装饰者实现类
 * @createTime 2024/7/25 10:57
 * @since 1.0.0
 */
public class MilkCoffee extends Decorator{

    public MilkCoffee(Drink drink) {
        super(drink);
        setPrice(2.0f); // 设置牛奶的价格
        setDescription("加了牛奶"); // 设置牛奶的描述
    }
}
