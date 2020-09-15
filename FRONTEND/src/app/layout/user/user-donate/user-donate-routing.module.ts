import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserDonateComponent } from './user-donate.component';

const routes: Routes = [
  {
    path: '', component: UserDonateComponent
}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UserDonateRoutingModule { }
