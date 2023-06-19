import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-hanee',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = 'internship';
  // d:string = new Date().toTimeString();
  // city="Hyderabad";
  // cityNew = "";
constructor(private router: Router) {

}
   
  //reactive
 ngOnInit()
 {
  this.router.navigateByUrl("/login")  
 }

}
