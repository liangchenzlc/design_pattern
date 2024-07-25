package com.coderedma.pattern.observer;

/**
 * @Author coderedma
 * @Desc 用户A观察者
 * @createTime 2024/7/25 14:53
 * @since 1.0.0
 */
public class UserAObserver implements Observer{
    @Override
    public void update(String message) {
        System.out.println("用户A收到消息：" + message);
    }

}
