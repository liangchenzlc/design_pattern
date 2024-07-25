package com.coderedma.pattern.singleton.inclass;

/**
 * @Author coderedma
 * @Desc 静态内部类的方法实现单例
 * @createTime 2024/7/25 9:05
 * @since 1.0.0
 * 优点： 线程安全，延迟加载，效率高，避免了 synchronized 带来的性能开销
 */
public class SingletonInClass {
    private static class SingletonHolder {
        private static final SingletonInClass INSTANCE = new SingletonInClass();
    }

    private SingletonInClass() {
    }

    public static SingletonInClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
