import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { NewestRoutingModule } from './newest-routing.module';
import { NewestComponent } from './newest.component';

@NgModule({
  declarations: [NewestComponent],
  imports: [
    CommonModule,
    NewestRoutingModule
  ]
})
export class NewestModule { }
