import { Component, OnInit } from '@angular/core';
import { routerTransition } from 'src/app/router.animations';

@Component({
  selector: 'app-user-projects',
  templateUrl: './user-projects.component.html',
  styleUrls: ['./user-projects.component.scss'],
  animations: [routerTransition()]
})
export class UserProjectsComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
