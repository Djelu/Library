package com.fantasy.mapper;

import com.fantasy.entity.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BookMapper implements RowMapper<Book> {

    public Book mapRow(ResultSet resultSet, int i) throws SQLException {
        Book book = new Book();
        book.setId(resultSet.getInt("id"));
        book.setName(resultSet.getString("name"));
        book.setDescription(resultSet.getString("description"));
        book.setYear(resultSet.getInt("year"));
        book.setAuthor(resultSet.getString("author"));

        return book;
    }
}
