package Lesson7.BookTask;

import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestBookLombok {
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
    public void tearDown() {
        book = null;
    }

    @Test
    public void firstTest() {
        SoftAssertions softy = new SoftAssertions();
        softy.assertThat(book.getAuthor()).isEqualTo("Jack London");
        softy.assertThat(book.getName()).isEqualTo("White Fang");
        softy.assertThat(book.getGenre()).isEqualTo("Adventure");
        softy.assertThat(book.getYear()).isEqualTo(1906);
        softy.assertThat(book.getISBN()).isEqualTo("Something-1234567890");
        softy.assertAll();

    }

}
