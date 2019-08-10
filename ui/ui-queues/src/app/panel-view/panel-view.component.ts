import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';

@Component({
  selector: 'app-panel-view',
  templateUrl: './panel-view.component.html',
  styleUrls: ['./panel-view.component.css']
})
export class PanelViewComponent implements OnInit {

  constructor(private http: Http) { }

  ngOnInit() {
    
    this.http.get("http://10.10.1.46:8080/api/queue").subscribe(() =>{

    });
  }

}
