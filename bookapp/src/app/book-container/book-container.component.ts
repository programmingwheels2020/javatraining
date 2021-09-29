import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';

@Component({
  selector: 'app-book-container',
  templateUrl: './book-container.component.html',
  styleUrls: ['./book-container.component.css']
})
export class BookContainerComponent implements OnInit {

  books: any = []
  constructor(private bookService: BookserviceService) { }

  ngOnInit(): void {
    this.bookService.loadBooks().subscribe((data) => {
      console.log(data);
      this.books = data;
    }, (err) => {
      console.log(err);
    })
  }

}
