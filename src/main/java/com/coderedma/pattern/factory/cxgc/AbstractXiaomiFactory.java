package com.coderedma.pattern.factory.cxgc;

/**
 * @Author coderedma
 * @Desc 小米工厂抽象接口
 * @createTime 2024/7/25 9:34
 * @since 1.0.0
 */
public abstract class AbstractXiaomiFactory {
    abstract Phone createPhone();
    abstract Watch createWatch();
    abstract Car createCar();
}
