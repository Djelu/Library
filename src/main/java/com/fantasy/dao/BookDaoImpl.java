package com.fantasy.dao;

import com.fantasy.entity.Book;
import com.fantasy.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    public JdbcTemplate jdbcTemplate;


    public void save(Book book) {
        String sql = "INSERT INTO books (name, description, year, author) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, book.getName(), book.getDescription(), book.getYear(), book.getAuthor());

    }

    public Book getById(int id) {
        String sql = "SELECT * FROM books WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new BookMapper(), id);
    }

    public List<Book> findAll() {
        String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, new BookMapper());
    }

    public void update(Book book) {
        String sql = "UPDATE books SET name=?, description=?, year=?, author=? WHERE id=?";
        jdbcTemplate.update(sql, book.getName(), book.getDescription(), book.getYear(), book.getAuthor(), book.getId());
    }

    public void delete(int id) {
        String sql = "DELETE FROM books WHERE id=?";
        jdbcTemplate.update(sql, id);

    }
}
