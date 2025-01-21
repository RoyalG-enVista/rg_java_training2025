package com.bookapp.repository;

import java.util.List;

public interface BookDao {


    public List<Book> getAllBooks();
    public Book addBook(Book book);
    public void deleteBook(int id);
    public void updateBook(int id, Book book);
    public List<Book> getBookById(int id);

    /*
    List<Book> findAllBookList();
    Book findBookById(int id);
    public Book save(Book book);
    public void deleteBookById(int id);
    public void updateBookById(int id, Book book);
     */
}
