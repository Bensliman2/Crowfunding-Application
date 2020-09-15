import { Component, OnInit } from '@angular/core';
import { routerTransition } from 'src/app/router.animations';

@Component({
  selector: 'app-user-donate',
  templateUrl: './user-donate.component.html',
  styleUrls: ['./user-donate.component.scss'],
  animations: [routerTransition()]
})
export class UserDonateComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
