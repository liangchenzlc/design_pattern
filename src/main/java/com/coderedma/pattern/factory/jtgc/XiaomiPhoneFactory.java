package com.coderedma.pattern.factory.jtgc;

/**
 * @Author coderedma
 * @Desc 小米手机工厂
 * @createTime 2024/7/25 9:29
 * @since 1.0.0
 */
public class XiaomiPhoneFactory implements PhoneFactory{
    @Override
    public Phone createPhone() {
        return new XiaomiPhone();
    }
}
