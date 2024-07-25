package com.coderedma.pattern.observer;

/**
 * @Author coderedma
 * @Desc 观察者接口
 * @createTime 2024/7/25 14:48
 * @since 1.0.0
 */
public interface Observer {
    /**
     * 更新
     *
     * @param message
     */
    void update(String message);
}
