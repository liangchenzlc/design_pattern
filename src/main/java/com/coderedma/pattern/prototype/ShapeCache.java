package com.coderedma.pattern.prototype;

import com.coderedma.pattern.prototype.impl.Circle;
import com.coderedma.pattern.prototype.impl.Rectangle;
import com.coderedma.pattern.prototype.impl.Square;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author coderedma
 * @Desc
 * @createTime 2024/7/25 10:05
 * @since 1.0.0
 */
public class ShapeCache {
    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId)
    {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache()
    {
        shapeMap.put("1", new Circle());
        shapeMap.put("2", new Square());
        shapeMap.put("3", new Rectangle());
    }
}
