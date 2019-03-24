import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { VocationFormComponent } from './vocation-form/vocation-form.component';
import { HeaderComponent } from './header/header.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import {MatStepperModule} from '@angular/material/stepper';
import {MatInputModule} from '@angular/material/input';
import { ReactiveFormsModule } from '@angular/forms';
import {MatTabsModule} from '@angular/material/tabs';
import {MatProgressBarModule} from '@angular/material/progress-bar';
import { NewUserComponent } from './user/new-user/new-user.component';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatSelectModule} from '@angular/material/select';
import {MatIconModule} from '@angular/material/icon';
import {MatCardModule} from '@angular/material/card';

import { SharedModule } from './shared/shared.module';
import { IndexComponent } from './index/index.component';
import { HomeLogadoComponent } from './home-logado/home-logado.component';
import { ResultadoComponent } from './resultado/resultado.component';



@NgModule({
  declarations: [
    AppComponent,
    VocationFormComponent,
    HeaderComponent,
    NewUserComponent,
    IndexComponent,
    HomeLogadoComponent,
    ResultadoComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatStepperModule,
    MatInputModule,
    ReactiveFormsModule,
    MatTabsModule,
    MatProgressBarModule,
    MatDatepickerModule,
    MatSelectModule,
    MatIconModule,
    MatCardModule,
    HttpClientModule,
    SharedModule,
    

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
