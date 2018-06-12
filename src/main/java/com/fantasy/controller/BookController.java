package com.fantasy.controller;

import com.fantasy.entity.Book;
import com.fantasy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class BookController {

    @Autowired
    public BookService BookService;

    @GetMapping("/")
    public String getAllBooks(Model model) {
        model.addAttribute("books", BookService.findAll());
        return "booksList";
    }

    @GetMapping("/addBook")
    public String createBookPage() {
        return "createBook";
    }


    @PostMapping("/addBook")
    public String addBook(@ModelAttribute("book") Book book) throws Exception {
        BookService.save(book);
        return "redirect:/";
    }

    @PostMapping("/updateBook")
    public String updateBook(@ModelAttribute("book") Book book) {
        BookService.update(book);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        model.addAttribute("book", BookService.getById(id));
        return "editBook";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        BookService.delete(id);
        return "redirect:/";
    }
}
