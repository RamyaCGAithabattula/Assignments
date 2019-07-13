import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import {Routes,RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';

import { HttpClientModule } from '@angular/common/http';
import { Login } from './app.login';
import { Register } from './app.register';
import { Welcome } from './app.welcome';
const routes:Routes=[
{path:'',redirectTo:'log',pathMatch:'full'},
{path:'log',component:Login},
{path:'reg',component:Register},
{path:'wel',component:Welcome}

];
@NgModule({
    imports: [
        BrowserModule,RouterModule.forRoot(routes),FormsModule,HttpClientModule
        
    ],
    declarations: [
        AppComponent,Login,Register,Welcome
		],
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }