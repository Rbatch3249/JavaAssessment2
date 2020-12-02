import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Book } from '../model/book';

import { BookService } from '../services/book.service';

@Component({
  selector: 'app-bookdetails',
  templateUrl: './bookdetails.component.html',
  styleUrls: ['./bookdetails.component.css']
})
export class BookdetailsComponent implements OnInit {
books = new Book();
  constructor(private bookService: BookService, private router: Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.getBookDetails();
  }
  getBookDetails(){
    const id = this.activatedRoute.snapshot.params[`id`];
    this.bookService.getBookById(id).subscribe(
      response => {
        this.books = response.data;
        console.log(response.data)
      }
    );
  }

}
