import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';
import { Book } from '../model/book';


@Injectable({
  providedIn: 'root'
})
export class BookService {

 
  constructor(private http: HttpClient) { }

getAllBooks(): Observable<any>{
  return this.http.get<any>(`http://localhost:8080/books`);
}

getBookById(id: number): Observable<any>{
  return this.http.get<any>(`http://localhost:8080/books/${id}`);
} 

addBook(book: Book): Observable<any>{
  return this.http.post<any>(`http://localhost:8080/books`,book);
}

updateBook(id:number, book: Book): Observable<any>{
  return this.http.put<any>(`http://localhost:8080/books/${id}`, book );
}

deleteBook(id:number): Observable<any>{
  return this.http.delete(`http://localhost:8080/books/${id}`);
}



}