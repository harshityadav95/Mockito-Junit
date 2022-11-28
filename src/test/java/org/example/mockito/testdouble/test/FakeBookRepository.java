package org.example.mockito.testdouble.test;

import org.example.mockito.testdouble.fake.Book;
import org.example.mockito.testdouble.fake.BookRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository {

    // In Memory database , Hashmap or list

    Map<String, Book> bookStore =new HashMap<>();

    @Override
    public void save(Book book) {


        bookStore.put(book.getBookId(),book);

    }

    @Override
    public Collection<Book> findall() {

        // return all the values of book stored in book store
        return bookStore.values();
    }
}
