import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UserDonateRoutingModule } from './user-donate-routing.module';
import { UserDonateComponent } from './user-donate.component';

@NgModule({
  declarations: [UserDonateComponent],
  imports: [
    CommonModule,
    UserDonateRoutingModule
  ]
})
export class UserDonateModule { }
