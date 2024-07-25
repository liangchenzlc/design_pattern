package com.coderedma.pattern.factory.jdgc;

/**
 * @Author coderedma
 * @Desc 正方形
 * @createTime 2024/7/25 9:20
 * @since 1.0.0
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("square is drawing~");
    }
}
