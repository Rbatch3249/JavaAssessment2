import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Category } from '../model/category';


@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  private url = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

getAllCategories(): Observable<any>{
  return this.http.get(this.url+`/books/category`);
}

getCategoryType(type: string): Observable<any>{
return this.http.get(this.url+`/books/category/${type}`);
}
addCategory(category: Category): Observable<any>{
  return this.http.post(this.url + `/books/categories`, category);
}





}
