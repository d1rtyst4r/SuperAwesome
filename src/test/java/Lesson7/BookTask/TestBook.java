package Lesson7.BookTask;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestBook {
    Book book = new Book();

    @Before
    public void setUp() {

        book.setAuthor("Jack London");
        book.setName("White Fang");
        book.setGenre("Adventure");
        book.setYear(1906);
        book.setISBN("Something-1234567890");
    }

    @After
    public void tearDown(){
        book = null;
    }

    @Test
    public void firstTest() {

        assertThat(book.getName()).isEqualTo("White Fang");
    }
}
