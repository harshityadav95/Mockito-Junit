package org.example.mockito.testdouble.fake;

import java.util.Collection;

public interface BookRepository {

    void save(Book book);
    Collection<Book> findall();
}
