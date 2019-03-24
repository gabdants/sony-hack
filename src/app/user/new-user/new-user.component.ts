import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { FormGroup, FormControl, Validators, AbstractControl } from '@angular/forms';

@Component({
  selector: 'app-new-user',
  templateUrl: './new-user.component.html',
  styleUrls: ['./new-user.component.css']
})
export class NewUserComponent implements OnInit {

  user: User = {
    userName: '',
    email: '',
    phoneNumber: '',
    gender: '',
    carreer_type: '',
    experienceYears: '',
    experienceLevel: '',
    password: ''
  };
  
  // genderArray = [
  //   'Masculino',
  //   'Feminino'
  // ];

  minDate = new Date(1990, 1, 1);
  maxDate = new Date(2000, 11, 13); 

  userForm: FormGroup;

  constructor(
    private userService: UserService,
    private router: Router,
  ) { }

  ngOnInit() {
    this.userForm = new FormGroup({
      username: new FormControl(''),
      email: new FormControl('', {
        validators: [Validators.required]
      }),
      phoneNumber: new FormControl('', {
        validators: [Validators.required]
      }),
      gender: new FormControl('', {
        validators: [Validators.required]
      }),
      carreer_type: new FormControl('', {
        validators: [Validators.required]
      }),
      experienceYears: new FormControl('', {
        validators: [Validators.required]
      }),
      experienceLevel: new FormControl('', {
        validators: [Validators.required]
      }),
      password: new FormControl('', {
        validators: [Validators.required]
      }),
    });
  }
  createUser() {

    this.userService.createUser(this.user).subscribe(response => {
      //this.router.navigateByUrl('/login');
      console.log('foi');
    }, error => {
      console.error(error);
    });
  }


}
