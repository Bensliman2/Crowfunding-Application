import { Component, OnInit } from '@angular/core';
import { routerTransition } from 'src/app/router.animations';
import { $ } from 'protractor';

@Component({
  selector: 'app-donate-page',
  templateUrl: './donate-page.component.html',
  styleUrls: ['./donate-page.component.scss'],
  animations: [routerTransition()]
})
export class DonatePageComponent implements OnInit {

  constructor() { }

    isToggled: boolean;

  ngOnInit() {
  }

    toggle() {
      this.isToggled = !this.isToggled;
    }





}
