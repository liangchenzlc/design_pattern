package com.coderedma.pattern.prototype.impl;

import com.coderedma.pattern.prototype.Shape;

/**
 * @Author coderedma
 * @Desc 矩形
 * @createTime 2024/7/25 10:03
 * @since 1.0.0
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }

    @Override
    public Shape clone() {
        return new Rectangle();
    }
}
