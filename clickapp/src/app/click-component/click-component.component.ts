import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-click-component',
  templateUrl: './click-component.component.html',
  styleUrls: ['./click-component.component.css']
})
export class ClickComponentComponent implements OnInit {

  counter: any;
  constructor() {
    this.counter = 0;
  }

  ngOnInit(): void {
  }

  increment() {
    this.counter++;
  }
  decrement() {
    this.counter--;
  }

}
