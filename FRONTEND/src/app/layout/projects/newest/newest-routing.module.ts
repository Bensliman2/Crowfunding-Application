import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NewestComponent } from './newest.component';

const routes: Routes = [  {
  path: '', component: NewestComponent
}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class NewestRoutingModule { }
