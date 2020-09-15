import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EditprojectComponent } from './editproject.component';

const routes: Routes = [
  {
    path: '', component: EditprojectComponent
}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class EditprojectRoutingModule { }
