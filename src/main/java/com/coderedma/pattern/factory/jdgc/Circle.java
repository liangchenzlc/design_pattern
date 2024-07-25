package com.coderedma.pattern.factory.jdgc;

/**
 * @Author coderedma
 * @Desc 圆形
 * @createTime 2024/7/25 9:18
 * @since 1.0.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle is drowing~");
    }
}
