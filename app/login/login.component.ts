import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username="";
  password="";
  emailId="";
  constructor (private routed:Router) {
    
  }
  submitForm()
  {
   console.log(this.username);
   console.log(this.password);
   this.routed.navigate(["home"])
  }


}
