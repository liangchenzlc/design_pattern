package com.coderedma.pattern.proxy.jdkproxy;

/**
 * @Author coderedma
 * @Desc 买房实现类（需要被代理的类）
 * @createTime 2024/7/25 11:12
 * @since 1.0.0
 */
public class BuyHouseImpl implements BuyHouse{
    @Override
    public void buyHouse() {
        System.out.println("买房========");
    }

    @Override
    public void calculateHouse() {
        System.out.println("计算房价=======");
    }
}
