package org.ccsama.Iterator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
//    //使用数组实现
//    private Book[] books;
//    private Integer last = 0;
//
//    //初始化书架
//    public BookShelf(int maxSize) {
//        this.books = new Book[maxSize];
//    }
//
//    public Book getBookAt(int index) {
//        return books[index];
//    }
//
//    public void appendBook(Book book) {
//        books[last] = book;
//        last++;
//    }
//
//    public Integer getLength(){
//        return last;
//    }
//
//
//
//    @Override
//    public Iterator iterator() {
//        return new BookShelfIterator(this);
//    }

    //使用集合实现
    private List<Book> books = new ArrayList<Book>();
//    private Integer last = 0;

    public Book getBookAt(Integer index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public Integer getLength() {
        return books.size();
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
