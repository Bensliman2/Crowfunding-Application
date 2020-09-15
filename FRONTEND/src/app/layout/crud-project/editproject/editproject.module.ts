import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EditprojectRoutingModule } from './editproject-routing.module';
import { EditprojectComponent } from './editproject.component';

@NgModule({
  declarations: [EditprojectComponent],
  imports: [
    CommonModule,
    EditprojectRoutingModule
  ]
})
export class EditprojectModule { }
