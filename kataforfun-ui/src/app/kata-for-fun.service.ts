import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Result } from './model/result';

@Injectable({
  providedIn: 'root'
})
export class KataForFunService {


  CONVERSION_RESULT_URL = 'http://localhost:8080/kata-for-fun/'
  constructor(private http: HttpClient) { }

  convert(inputNumber: Number): Observable<Result> {
    return this.http.get<Result>(this.CONVERSION_RESULT_URL + inputNumber);
  }

}
