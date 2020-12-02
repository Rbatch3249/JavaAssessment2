import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BookdetailsComponent } from './bookdetails/bookdetails.component';
import { ViewbooksComponent } from './viewbooks/viewbooks.component';

const routes: Routes = [
  {path: 'books', component: ViewbooksComponent},
  {path: 'books/:id',component: BookdetailsComponent },
  {path: "", component: ViewbooksComponent}
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
