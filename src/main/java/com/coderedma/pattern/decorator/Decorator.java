package com.coderedma.pattern.decorator;

/**
 * @Author coderedma
 * @Desc 装饰者的抽象类
 * @createTime 2024/7/25 10:55
 * @since 1.0.0
 */
public abstract class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink)
    {
        this.drink = drink;
    }

    public float cost()
    {
        return super.getPrice() + drink.cost();
    }

    public String getDescription()
    {
        return super.getDescription() + " " + drink.getDescription();
    }
}
