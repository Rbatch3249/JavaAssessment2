package com.javaAssessment.Assessment.repository;

import com.javaAssessment.Assessment.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {


    default Iterable<Category> findAllCategories(String type) {
        return null;
    }
}
