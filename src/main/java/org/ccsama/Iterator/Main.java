package org.ccsama.Iterator;

public class Main {
    public static void main(String[] args) {
        //创建四本书
        Book book1 = new Book("Java");
        Book book2 = new Book("C++");
        Book book3 = new Book("Python");
        Book book4 = new Book("PHP");
        Book book5 = new Book("PHP");
        //获取书架
        BookShelf book = new BookShelf();
        //放入四本书
        book.appendBook(book1);
        book.appendBook(book2);
        book.appendBook(book3);
        book.appendBook(book5);
        book.appendBook(book5);
        book.appendBook(book5);
        book.appendBook(book5);
        //使用迭代器迭代书
        Iterator it = book.iterator();

        while (it.hasNext()) {
            Book b = (Book) it.next();
            System.out.println(b.getName());
        }

    }
}
