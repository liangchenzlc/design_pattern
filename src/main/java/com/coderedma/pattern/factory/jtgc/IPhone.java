package com.coderedma.pattern.factory.jtgc;

/**
 * @Author coderedma
 * @Desc 苹果手机
 * @createTime 2024/7/25 9:27
 * @since 1.0.0
 */
public class IPhone implements Phone{
    @Override
    public void call() {
        System.out.println("苹果手机打电话~");
    }
}
