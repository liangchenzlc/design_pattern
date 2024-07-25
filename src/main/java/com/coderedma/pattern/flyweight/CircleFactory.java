package com.coderedma.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author coderedma
 * @Desc 圆形工厂
 * @createTime 2024/7/25 16:18
 * @since 1.0.0
 */
public class CircleFactory {

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color)
    {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null)
        {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
