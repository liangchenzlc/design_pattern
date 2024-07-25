package com.coderedma.pattern.observer;

/**
 * @Author coderedma
 * @Desc 用户B观察者
 * @createTime 2024/7/25 14:54
 * @since 1.0.0
 */
public class UserBObserver implements Observer{
    @Override
    public void update(String message) {
        System.out.println("用户B收到消息：" + message);
    }
}
