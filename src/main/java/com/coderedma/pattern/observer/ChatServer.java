package com.coderedma.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author coderedma
 * @Desc 聊天室
 * @createTime 2024/7/25 14:49
 * @since 1.0.0
 */
public class ChatServer implements Subject{

    private String message;

    private List<Observer> observers = new ArrayList<>();

    public void setMessage(String message) {
        this.message = message;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!this.observers.isEmpty()) {
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        // 通知所有观察者
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
