package com.coderedma.pattern.factory.jtgc;

/**
 * @Author coderedma
 * @Desc 华为手机
 * @createTime 2024/7/25 9:26
 * @since 1.0.0
 */
public class HuaweiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("用华为手机打电话~");
    }
}
