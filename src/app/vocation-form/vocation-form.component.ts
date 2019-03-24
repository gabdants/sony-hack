import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import { VocationService } from './vocation.service'
import { Routes, RouterModule, Router } from '@angular/router';

@Component({
  selector: 'app-vocation-form',
  templateUrl: './vocation-form.component.html',
  styleUrls: ['./vocation-form.component.css']
})
export class VocationFormComponent implements OnInit {


  firstFormGroup: FormGroup;
  secondFormGroup: FormGroup;
  thirdFormGroup: FormGroup;
  fourthFormGroup: FormGroup;
  fifthFormGroup: FormGroup;
  sixthFormGroup: FormGroup;
  seventhFormGroup: FormGroup;
  eighthFormGroup: FormGroup;
  ninthFormGroup: FormGroup;


  vocation: Vocation = {
    ageQuest: '',
    sinceWhenQuest: '',
    whatsTalentQuest: '',
    didSomethingQuest: '',
    whereFitQuest: '',
    courseQuest: '',
    dreamQuest: '',
    perfectionQuest: '',
    email: '',
  };

  result: String;
  constructor(private _formBuilder: FormBuilder, 
    private vocationService: VocationService,
    private router: Router,) {}

  ngOnInit() {
    this.firstFormGroup = this._formBuilder.group({
      firstCtrl: ['', Validators.required]
    });
    this.secondFormGroup = this._formBuilder.group({
      secondCtrl: ['', Validators.required]
    });
    this.thirdFormGroup = this._formBuilder.group({
      thirdCtrl: ['', Validators.required]
    });
    this.fourthFormGroup = this._formBuilder.group({
      fourthCtrl: ['', Validators.required]
    });
    this.fifthFormGroup = this._formBuilder.group({
      fifthCtrl: ['', Validators.required]
    });
    this.sixthFormGroup = this._formBuilder.group({
      sixthCtrl: ['', Validators.required]
    });
    this.seventhFormGroup = this._formBuilder.group({
      seventhCtrl: ['', Validators.required]
    });
    this.eighthFormGroup = this._formBuilder.group({
      eighthCtrl: ['', Validators.required]
    });
    this.ninthFormGroup = this._formBuilder.group({
      ninthCtrl: ['', Validators.required]
    });
  }

  montaArray(){
    this.vocation.ageQuest = this.firstFormGroup.value.firstCtrl;
    this.vocation.sinceWhenQuest = this.secondFormGroup.value.secondCtrl;
    this.vocation.whatsTalentQuest = this.thirdFormGroup.value.thirdCtrl;
    this.vocation.didSomethingQuest = this.fourthFormGroup.value.fourthCtrl;
    this.vocation.whereFitQuest = this.fifthFormGroup.value.fifthCtrl;
    this.vocation.courseQuest = this.sixthFormGroup.value.sixthCtrl;
    this.vocation.dreamQuest = this.seventhFormGroup.value.seventhCtrl;
    this.vocation.perfectionQuest = this.eighthFormGroup.value.eighthCtrl;
    this.vocation.email = this.ninthFormGroup.value.ninthCtrl;
  }

  submitQuest(){
    this.montaArray();
    this.vocationService.createUser(this.vocation).subscribe(response => {
      //this.router.navigateByUrl('/login');
      console.log('foi');
      console.log(response);
    }, error => {
      this.result = error['error']['text'];
      //this.router.navigate(['/resultado'], 
      //{queryParams: result});


      console.error(error['error']['text']);
    });

  }
}
