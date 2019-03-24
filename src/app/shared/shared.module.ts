import { NgModule, ModuleWithProviders } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MatRadioModule} from '@angular/material/radio';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';


import {
  MatCardModule,
  MatButtonModule,
  MatIconModule,
  MatInputModule,
  MatFormFieldModule,
  MatNativeDateModule,
  MatSelectModule,
  MatOptionModule,
  MatProgressBarModule,
  MatTabsModule,
  MatDatepickerModule,
  MatDividerModule,
  MatListModule,
  MatSnackBarModule,
  
} from '@angular/material';

import { RouterModule } from '@angular/router';
import { UserService } from '../user/user.service';


@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule,
    MatInputModule,
    MatFormFieldModule,
    MatDatepickerModule,
    MatSelectModule,
    MatTabsModule,
    MatProgressBarModule,
    MatOptionModule,
    MatNativeDateModule,
    MatDividerModule,
    MatListModule,
    MatSnackBarModule,
    MatRadioModule,

  ],
  declarations: [],
  exports: [
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule,
    MatInputModule,
    MatFormFieldModule,
    MatDatepickerModule,
    MatSelectModule,
    MatTabsModule,
    MatProgressBarModule,
    MatOptionModule,
    MatNativeDateModule,
    MatDividerModule,
    MatListModule,
    MatSnackBarModule,
    MatRadioModule,
  ],
})
export class SharedModule {
  static forRoot(): ModuleWithProviders {
    return {
      ngModule: SharedModule,
      providers: [
        UserService,
      ]
    };
  }
}
