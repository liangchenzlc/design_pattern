package com.coderedma.pattern.prototype.impl;

import com.coderedma.pattern.prototype.Shape;

/**
 * @Author coderedma
 * @Desc 正方形
 * @createTime 2024/7/25 10:02
 * @since 1.0.0
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }

    @Override
    public Shape clone() {
        return new Square();
    }
}
