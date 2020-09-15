import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UserProjectsRoutingModule } from './user-projects-routing.module';
import { UserProjectsComponent } from './user-projects.component';

@NgModule({
  declarations: [UserProjectsComponent],
  imports: [
    CommonModule,
    UserProjectsRoutingModule
  ]
})
export class UserProjectsModule { }
