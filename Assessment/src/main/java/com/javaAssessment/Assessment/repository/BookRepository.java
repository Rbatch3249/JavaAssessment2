package com.javaAssessment.Assessment.repository;

import com.javaAssessment.Assessment.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    @Query("SELECT b FROM Book b WHERE b.name LIKE %?1%")
    public List<Book> search(String keyword);



}
