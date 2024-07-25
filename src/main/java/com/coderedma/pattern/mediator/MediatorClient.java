package com.coderedma.pattern.mediator;

/**
 * @Author coderedma
 * @Desc 中介者模式的客户端
 * @createTime 2024/7/25 16:37
 * @since 1.0.0
 * 中介者模式
 */
public class MediatorClient {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User("user1", chatRoom);
        User user2 = new User("user2", chatRoom);
        user1.sendMessage("hello user2");
        user2.sendMessage("hello user1");
    }
}
