package com.coderedma.pattern.factory.jdgc;

/**
 * @Author coderedma
 * @Desc 给出形状的工厂
 * @createTime 2024/7/25 9:21
 * @since 1.0.0
 * 简单工厂模式
 */
public class ShapeFactory {

    // 根据不同形状获取对象
    public Shape getShape(String shape) {
        switch (shape) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
