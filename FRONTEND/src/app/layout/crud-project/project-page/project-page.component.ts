import { Component, OnInit } from '@angular/core';
import { routerTransition } from 'src/app/router.animations';

@Component({
  selector: 'app-project-page',
  templateUrl: './project-page.component.html',
  styleUrls: ['./project-page.component.scss'],
  animations: [routerTransition()]
})
export class ProjectPageComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
