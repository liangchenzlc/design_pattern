package com.coderedma.pattern.prototype.impl;

import com.coderedma.pattern.prototype.Shape;

/**
 * @Author coderedma
 * @Desc 圆形
 * @createTime 2024/7/25 10:01
 * @since 1.0.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆形~");
    }

    @Override
    public Shape clone() {
        return new Circle();
    }
}
