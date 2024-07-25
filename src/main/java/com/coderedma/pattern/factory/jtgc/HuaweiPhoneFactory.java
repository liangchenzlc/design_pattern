package com.coderedma.pattern.factory.jtgc;

/**
 * @Author coderedma
 * @Desc 华为手机工厂
 * @createTime 2024/7/25 9:28
 * @since 1.0.0
 */
public class HuaweiPhoneFactory implements PhoneFactory{
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }
}
