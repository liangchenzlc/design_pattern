package com.coderedma.pattern.decorator;

/**
 * @Author coderedma
 * @Desc 被装饰的具体类 咖啡
 * @createTime 2024/7/25 10:54
 * @since 1.0.0
 */
public class Coffee extends Drink{
    public Coffee(float price, String description) {
        setPrice(price);
        setDescription(description);
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
