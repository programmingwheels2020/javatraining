import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MyserviceService {

  constructor(private http: HttpClient) { }

  public myLoggerFunction() {
    console.log("This is my test log")
  }

  public loadPost() {
    return this.http.get("https://jsonplaceholder.typicode.com/posts")
  }
}
