import { Component, OnInit } from '@angular/core';
import { routerTransition } from 'src/app/router.animations';

@Component({
  selector: 'app-editproject',
  templateUrl: './editproject.component.html',
  styleUrls: ['./editproject.component.scss'],
  animations: [routerTransition()]
})
export class EditprojectComponent implements OnInit {

  constructor() {}

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
