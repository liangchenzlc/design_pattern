package com.coderedma.pattern.mediator;

/**
 * @Author coderedma
 * @Desc 参与者接口
 * @createTime 2024/7/25 16:35
 * @since 1.0.0
 */
public interface Participant {
    void sendMessage(String message);
    void receiveMessage(String message);
    String getName();
}
