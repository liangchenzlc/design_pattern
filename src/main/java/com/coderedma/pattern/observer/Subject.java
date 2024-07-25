package com.coderedma.pattern.observer;


/**
 * @Author coderedma
 * @Desc 专题接口，所有的主题需要被观察的都要实现该接口
 * @createTime 2024/7/25 14:47
 * @since 1.0.0
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
