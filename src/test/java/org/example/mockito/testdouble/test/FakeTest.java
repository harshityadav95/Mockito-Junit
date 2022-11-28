package org.example.mockito.testdouble.test;

import org.example.mockito.testdouble.fake.Book;
import org.example.mockito.testdouble.fake.BookRepository;
import org.example.mockito.testdouble.fake.BookService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class FakeTest {


    @Test
    public void testfake(){

        BookRepository bookRepository=new FakeBookRepository();
        // Step 1: Create book Serice Class
        BookService bookService= new BookService(bookRepository);

        bookService.addBook(new Book("1234","Mockito in Action",250, LocalDate.now()));

        bookService.addBook(new Book("4566","Junit5 in Action",650, LocalDate.now()));

        //Check if the books added are actually added or not
        assertEquals( )



    }



}
