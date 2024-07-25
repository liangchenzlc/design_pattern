package com.coderedma.pattern.singleton.ehan;

/**
 * @Author coderedma
 * @Desc 饿汉式的单例
 * @createTime 2024/7/25 9:08
 * @since 1.0.0
 */
public class SingletonEhan {

    // 饿汉式静态成员法
    private static SingletonEhan instance = new SingletonEhan();

    private SingletonEhan() {
    }

    public static SingletonEhan getInstance() {
        return instance;
    }

    // 静态代码块
    public static SingletonEhan instance2;

    static {
        instance2 = new SingletonEhan();
    }

    public static SingletonEhan getInstance2() {
        return instance2;
    }

}
