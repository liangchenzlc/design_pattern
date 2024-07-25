package com.coderedma.pattern.decorator;

/**
 * @Author coderedma
 * @Desc 被装饰的抽象类
 * @createTime 2024/7/25 10:53
 * @since 1.0.0
 */
public abstract class Drink {
    private float price;
    private String description;

    public float getPrice()
    {
        return price;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public abstract float cost();
}
