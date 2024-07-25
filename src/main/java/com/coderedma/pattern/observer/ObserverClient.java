package com.coderedma.pattern.observer;

/**
 * @Author coderedma
 * @Desc 观察者客户端
 * @createTime 2024/7/25 14:55
 * @since 1.0.0
 * 观察者模式
 */
public class ObserverClient {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        chatServer.registerObserver(new UserAObserver());
        chatServer.registerObserver(new UserBObserver());
        chatServer.setMessage("hello");
    }
}
