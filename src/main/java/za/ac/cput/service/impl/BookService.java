<<<<<<< HEAD
package za.ac.cput.service.impl;

import za.ac.cput.entity.Book;
import za.ac.cput.repository.BookRepository;

import java.util.*;

public class BookService implements IBookService{
    private static BookService service = null;
    private BookRepository repository = null;

    private BookService(){ this.repository = BookRepository.getRepository();}

    public static BookService getService() {
        if (service == null) {
            service = new BookService();
        }
        return service;
    }

    @Override
    public Book create(Book book) {
        return this.repository.create(book);
    }

    @Override
    public Book read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Book update(Book book) {
        return this.repository.update(book);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }

    @Override
    public Set<Book> getAll() {
        return this.repository.getAll();
    }
}
=======
package za.ac.cput.service.impl;

import za.ac.cput.entity.Book;
import za.ac.cput.repository.BookRepository;

import java.util.*;

public class BookService implements IBookService{
    private static BookService service = null;
    private BookRepository repository = null;

    private BookService(){ this.repository = BookRepository.getRepository();}

    public static BookService getService() {
        if (service == null) {
            service = new BookService();
        }
        return service;
    }

    @Override
    public Book create(Book book) {
        return this.repository.create(book);
    }

    @Override
    public Book read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Book update(Book book) {
        return this.repository.update(book);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }

    @Override
    public Set<Book> getAll() {
        return this.repository.getAll();
    }
}
>>>>>>> 5f71e25dfbc24a5a533788550a294bb02db12b1c
