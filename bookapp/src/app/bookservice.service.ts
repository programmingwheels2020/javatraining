import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BookserviceService {

  constructor(private http: HttpClient) { }

  public loadBooks() {
    return this.http.get("https://615425f02473940017efac40.mockapi.io/books")
  }
}
