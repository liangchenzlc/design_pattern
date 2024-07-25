package com.coderedma.pattern.iterator;



/**
 * @Author coderedma
 * @Desc 书架列表
 * @createTime 2024/7/25 15:01
 * @since 1.0.0
 */
public class BookList implements Iterable{

    private final int INIT_SIZE = 10;

    // 书架列表
    private String[] books = new String[INIT_SIZE];

    private int length;

    public void addBook(String book) {
        books[length++] = book;
    }

    @Override
    public Iterator iterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator{

        private int index = 0;

        @Override
        public boolean hasNext() {
            return length > index;
        }

        @Override
        public Object next() {
            return books[index++];
        }
    }
}
