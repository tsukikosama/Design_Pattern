package org.ccsama.Iterator_Pattern;

public class BookShelfIterator  implements Iterator{
    public BookShelf bookShelf;

    public Integer index;

    //初始化迭代器


    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 判断是否还有下一个
     * @return
     */
    @Override
    public Boolean hasNext() {

        if (index < bookShelf.getLength()){
            return true;
        }
        return false;
    }

    /**
     * 返回当前的 并且指向下一个
     * @return
     */
    @Override
    public Object next() {
        Book b = bookShelf.getBookAt(index);
        index++;
        return b;
    }
}
