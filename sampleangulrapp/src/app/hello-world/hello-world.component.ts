import { Component, OnInit } from '@angular/core';
import { MyserviceService } from '../myservice.service';

@Component({
  selector: 'app-hello-world',
  templateUrl: './hello-world.component.html',
  styleUrls: ['./hello-world.component.css']
})
export class HelloWorldComponent implements OnInit {

  counter: number = 0;
  constructor(private myService: MyserviceService) { }

  ngOnInit(): void {
    this.myService.loadPost().subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err)
    })

  }

  increment() {
    this.counter++;
    this.myService.myLoggerFunction();
  }

  decrement() {
    this.counter--;
  }


}
