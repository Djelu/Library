package com.fantasy.service;

import com.fantasy.dao.BookDao;
import com.fantasy.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    public BookDao bookDao;

    public void save(Book book) {
        bookDao.save(book);
    }

    public Book getById(int id) {
        return bookDao.getById(id);
    }

    public List<Book> findAll() {
        List<Book> allBooks = bookDao.findAll();

        return allBooks;
    }

    public void update(Book book) {
        bookDao.update(book);
    }

    public void delete(int id) {
        bookDao.delete(id);
    }
}
