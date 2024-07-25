package com.coderedma.pattern.flyweight;

/**
 * @Author coderedma
 * @Desc 享元模式的客户端
 * @createTime 2024/7/25 16:20
 * @since 1.0.0
 * 享元模式
 */
public class FlyWeightClient {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "green", "black", "white"};

        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) CircleFactory.getCircle(colors[i % colors.length]);
            circle.setX(getRandom(100));
            circle.setY(getRandom(100));
            circle.setRadius(getRandom(100));
            circle.draw();
        }
    }
    private static int getRandom(int num) {
        return (int) (Math.random() * num);
    }
}
