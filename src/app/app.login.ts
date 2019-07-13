import {Component} from '@angular/core';
import {Router,RouterModule} from '@angular/router';
import {EmployeeService} from './app.employeeService'
import { constructor } from 'q';

@Component({
    selector:'log',
    templateUrl:'login.html'
})



export class Login{
    constructor(private router:Router){}
    uName:number;
    uPass:string;
    iname:number=1234;
    ipass:string="akhil";
    login(){
        if(this.uName==this.iname && this.uPass==this.ipass){
            this.router.navigate(['wel']);
        }
        else{
            alert("Invalid");
        }

    }

}