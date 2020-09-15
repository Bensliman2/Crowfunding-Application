import { Component, OnInit } from '@angular/core';
import { routerTransition } from 'src/app/router.animations';

@Component({
  selector: 'app-create-project',
  templateUrl: './create-project.component.html',
  styleUrls: ['./create-project.component.scss'],
  animations: [routerTransition()]
})
export class CreateProjectComponent implements OnInit {

  constructor() { }

  selectedFile: File;
  http: any;

  ngOnInit() {
  }

  onFileChanged(event) {
    this.selectedFile = event.target.files[0];
  }

  onUpload() {
    // this.http is the injected HttpClient
    this.http.post('my-backend.com/file-upload', this.selectedFile,
    {reportProgress: true,
    observe: 'events'
  })
    .subscribe(event => {
      console.log(event); // handle event here
    });
}

}
