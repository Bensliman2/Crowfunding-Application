import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DonatePageRoutingModule } from './donate-page-routing.module';
import { DonatePageComponent } from './donate-page.component';


@NgModule({
  declarations: [DonatePageComponent],
  imports: [
    CommonModule,
    DonatePageRoutingModule
  ]
})
export class DonatePageModule { }
