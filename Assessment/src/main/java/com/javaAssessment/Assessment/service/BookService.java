package com.javaAssessment.Assessment.service;


import com.javaAssessment.Assessment.model.Book;
import com.javaAssessment.Assessment.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> listAll(String keyword) {
        if (keyword != null) {
            return bookRepository.search(keyword);
        }
        return (List<Book>) bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }

    public List<Book> getAllBooks(){
        List<Book> bookList = new ArrayList<>();
        bookRepository.findAll().forEach(bookList::add);
        return bookList;
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book book){
        book.setId(id);
        return bookRepository.save(book);
    }
    public void deleteBook(Long id){
        bookRepository.deleteById(id);

    }






}


