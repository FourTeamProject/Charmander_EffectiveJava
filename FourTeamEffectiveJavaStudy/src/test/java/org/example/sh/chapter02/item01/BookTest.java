package org.example.sh.chapter02.item01;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class BookTest {
    /**
     * Name: createBookSetNameTest
     * Date: 2020/07/18
     * Info:
     *  장점1. 명확한 이름을 갖는 메서드를 통해 생성자를 대신할 수 있다.
     */
    @Test
    public void createBookSetNameTest() {
        // given
        String bookName = "Effective Java";
        String expectedBookName = "Effective Java";
        String expectedAuthor = "";

        // when
        Book bookSetName = Book.createBookSetName(bookName);

        // then
        assertThat(bookSetName.getBookName(), is(equalTo(expectedBookName)));
        assertThat(bookSetName.getAuthor(), is(equalTo(expectedAuthor)));
    }

    /**
     * Name: createBookSetAuthorTest
     * Date: 2020/07/18
     * Info:
     *  장점1. 명확한 이름을 갖는 메서드를 통해 생성자를 대신할 수 있다.
     */
    @Test
    public void createBookSetAuthorTest() {
        // given
        String author = "Joshua Bloch";
        String expectedAuthor = "Joshua Bloch";
        String expectedBookName = "";

        // when
        Book bookSetAuthor = Book.createBookSetAuthor(author);

        // then
        assertThat(bookSetAuthor.getAuthor(), is(equalTo(expectedAuthor)));
        assertThat(bookSetAuthor.getBookName(), is(equalTo(expectedBookName)));
    }

    /**
     * Name: createDefaultBookTest
     * Date: 2020/07/18
     * Info:
     *  장점2. 매번 새로운 객체를 생성할 필요가 없다.
     */
    @Test
    public void createDefaultBookTest() {
        // given
        Book defaultBook1 = Book.createDefaultBook();
        Book defaultBook2 = Book.createDefaultBook();

        // when

        // then
        assertThat(defaultBook1, is(sameInstance(defaultBook2)));
    }
}
