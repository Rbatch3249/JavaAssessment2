import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { ViewbooksComponent } from './viewbooks/viewbooks.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter/src/ng2-filter.module';
import { FormsModule } from '@angular/forms';
import { BookdetailsComponent } from './bookdetails/bookdetails.component';


@NgModule({
  declarations: [
    AppComponent,
    ViewbooksComponent,
    BookdetailsComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [HttpClientModule,ViewbooksComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
