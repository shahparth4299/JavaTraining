import { Component } from '@angular/core';
import { Doctor } from './app.DoctorModel';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Subscriber, Observable, merge, pipe, timer, from } from 'rxjs';
import  { map, filter, toArray, debounce} from 'rxjs/operators'
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'HospitalAngular';
  doctorobj:Doctor = new Doctor();
  doctorobjs:Array<Doctor> = new Array<Doctor>();
  constructor(public httpobj: HttpClient){
  } 
  Display(){
    var observable = this.httpobj.get("http://localhost:8080/doctors");
    observable.subscribe(res=>this.Success(res),res=>this.Error(res));
  }
  Success(res){
    this.doctorobjs = res;
  }
  Error(res){
    alert("Something went wrong");
  }
  Search(){
    console.log(this.doctorobj.id);
    let endPoints = "/"+this.doctorobj.id;
    var observable = this.httpobj.get("http://localhost:8080/doctors"+endPoints)
    observable.subscribe(res=>this.SearchSuccess(res),res=>this.SearchError(res));
    this.doctorobj = new Doctor();
  }
  SearchSuccess(res){
    this.doctorobj = res;
  }
  SearchError(res){
    alert("Something went wrong");
  }
  Delete(){
    console.log(this.doctorobj.id);
    
    let endPoints = "/"+this.doctorobj.id;
    var observable = this.httpobj.delete("http://localhost:8080/doctors"+endPoints);
    observable.subscribe(res=>this.insertSuccess(res),res=>this.insertError(res));
    this.doctorobj = new Doctor();
  }
  Insert(){
    console.log(this.doctorobj);
    var observable = this.httpobj.post("http://localhost:8080/doctors",this.doctorobj);
    observable.subscribe(res=>this.insertSuccess(res),res=>this.insertError(res));
    this.doctorobj = new Doctor();
  }
  insertSuccess(res){
    this.doctorobjs = res;
  } 
  insertError(res){
    alert("Something went wrong");
  }

}
