package com.coderedma.pattern.factory.jtgc;

/**
 * @Author coderedma
 * @Desc 小米手机
 * @createTime 2024/7/25 9:26
 * @since 1.0.0
 */
public class XiaomiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("小米手机打电话~");
    }
}
