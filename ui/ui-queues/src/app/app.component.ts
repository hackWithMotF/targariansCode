import { OnInit, Component } from '@angular/core';
import {DetailComponentComponent} from './detail-component/detail-component.component';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit  {
  title = 'ui-queues';
  ngOnInit() {
    
  }
}
