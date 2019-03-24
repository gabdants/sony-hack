import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  user: User;

  API_URL = environment.apiUrl;

  constructor(
    private http: HttpClient
  ) { }

  createUser(user: User) {
    return this.http.post<User>(`${this.API_URL}user/create`, user);
  }

}
