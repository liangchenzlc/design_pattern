package com.coderedma.pattern.iterator;

/**
 * @Author coderedma
 * @Desc 迭代器客户端
 * @createTime 2024/7/25 15:06
 * @since 1.0.0
 * 迭代器模式
 */
public class IteratorClient {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        bookList.addBook("java");
        bookList.addBook("python");
        bookList.addBook("c++");
        bookList.addBook("javaScript");
        bookList.addBook("php");

        // 利用迭代器模式取值
        Iterator iterator = bookList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
