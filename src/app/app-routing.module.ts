import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VocationFormComponent } from './vocation-form/vocation-form.component';
import { NewUserComponent } from './user/new-user/new-user.component';
import { IndexComponent } from './index/index.component';
import { HomeLogadoComponent } from './home-logado/home-logado.component';
import { ResultadoComponent } from './resultado/resultado.component';

const routes: Routes = [
  { path:'vocationForm', component: VocationFormComponent }, 
  { path:'signup', component: NewUserComponent },
  { path:'homeLogado', component: HomeLogadoComponent },
  { path:'resultado', component: ResultadoComponent },
  { path:'', component: IndexComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
