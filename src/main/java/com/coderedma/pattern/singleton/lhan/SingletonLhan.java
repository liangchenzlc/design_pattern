package com.coderedma.pattern.singleton.lhan;

/**
 * @Author coderedma
 * @Desc 懒汉式的单例
 * @createTime 2024/7/25 9:10
 * @since 1.0.0
 */
public class SingletonLhan {

    private static SingletonLhan instance;

    private SingletonLhan() {
    }

    public static SingletonLhan getInstance() {
        if (instance == null) {
            instance = new SingletonLhan(); // 这里是线程不安全的
        }
        return instance;
    }


    private static SingletonLhan instance2;

    // 双重锁检测法
    public static SingletonLhan getInstance2() {
        if (instance2 == null) {
            synchronized (SingletonLhan.class) {
                if (instance2 == null) {
                    instance2 = new SingletonLhan();
                }
            }
        }
        return instance2;
    }
}
