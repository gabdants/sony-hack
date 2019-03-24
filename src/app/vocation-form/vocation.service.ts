import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class VocationService {

  vocation: Vocation;

  API_URL = environment.apiUrl;

  constructor(
    private http: HttpClient
  ) { }

  createUser(vocation: Vocation) {
    return this.http.post<Vocation>(`${this.API_URL}quest/result`, vocation);
  }
}
