import { Component, OnInit } from '@angular/core';
import { BookService } from '../services/book.service';
import { CategoryService } from '../services/category.service';
import { Book } from '../model/book';
import { Category } from '../model/category';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-viewbooks',
  templateUrl: './viewbooks.component.html',
  styleUrls: ['./viewbooks.component.css']
})
export class ViewbooksComponent implements OnInit {
categories: Category;
  books: Book[];

  constructor(private bookService: BookService,private categoryService: CategoryService, private activatedRoute: ActivatedRoute, private router: Router) { 
  }



  ngOnInit(): void {
    this.getAllCategories();
    this.getAllBooks();
    
    
  }
getAllCategories(){
 this.categoryService.getAllCategories().subscribe(
   data => {
     console.log(data);
     this.categories = data;
   }
 )
}
getAllBooks(){
  this.bookService.getAllBooks().subscribe(
    data => {
      console.log(data);
      this.books = data;
      
    }
  )
}
getBookDetails(){
  const id = this.activatedRoute.snapshot.params[`id`];
  this.bookService.getBookById(id).subscribe(
    data => {
      this.books = data;
      console.log(data)
    }
  );
}

}
