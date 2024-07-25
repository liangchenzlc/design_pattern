package com.coderedma.pattern.factory.cxgc;

/**
 * @Author coderedma
 * @Desc 小米工厂
 * @createTime 2024/7/25 9:36
 * @since 1.0.0
 * 小米抽象工厂方法
 */
public class XiaomiFactory extends AbstractXiaomiFactory{
    @Override
    Phone createPhone() {
        return new XiaomiPhone();
    }

    @Override
    Watch createWatch() {
        return new XiaomiWatch();
    }

    @Override
    Car createCar() {
        return new XiaomiCar();
    }
}
