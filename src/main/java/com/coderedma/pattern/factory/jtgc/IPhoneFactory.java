package com.coderedma.pattern.factory.jtgc;

/**
 * @Author coderedma
 * @Desc 苹果手机工厂
 * @createTime 2024/7/25 9:29
 * @since 1.0.0
 */
public class IPhoneFactory implements PhoneFactory{
    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}
