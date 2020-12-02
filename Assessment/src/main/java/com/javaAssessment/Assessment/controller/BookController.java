package com.javaAssessment.Assessment.controller;


import com.javaAssessment.Assessment.model.Book;
import com.javaAssessment.Assessment.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BookController {

    @Autowired
    BookService bookService;


        @RequestMapping("/")
        public String viewHomePage(Model model, @Param("keyword") String keyword) {
            List<Book> listBooks = bookService.listAll(keyword);
            model.addAttribute("listBooks", listBooks);
            model.addAttribute("keyword", keyword);

            return "index";
        }


    @RequestMapping(method = RequestMethod.GET, value = "/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/books/{id}")
    public Optional<Book> getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book newBook){
        bookService.createBook(newBook);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
    public void updateBook(@PathVariable Long id, @RequestBody Book book){
        bookService.updateBook(id,book);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{id}")
    public void deleteBookbyId(@PathVariable Long id){
        bookService.deleteBook(id);
    }




}
