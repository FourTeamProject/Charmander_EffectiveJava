package org.example.sh.chapter02.item01;

public class Book {
    private String bookName;
    private String author;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    /*  [ERROR] 생성자 시그니쳐가 동일해 bookName과 author를 개별로 받는 생성자를 만들 수 없다.    */
//    public Book(String author) {
//        this.author = author;
//    }

    /*  [Solution] private constructor & static factory method를 이용해 극복.    */
    private Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public static Book createBookSetName(String bookName) {
        return new Book(bookName, "");
    }
    public static Book createBookSetAuthor(String author) {
        return new Book("", author);
    }
}
