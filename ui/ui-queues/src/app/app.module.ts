import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { MatInputModule, MatPaginatorModule, MatProgressSpinnerModule, 
  MatSortModule, MatTableModule } from "@angular/material"

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DetailComponentComponent } from './detail-component/detail-component.component';
import { HttpClientModule} from "@angular/common/http";
import { PanelViewComponent } from './panel-view/panel-view.component';

@NgModule({
  declarations: [
    AppComponent,
    DetailComponentComponent,
    PanelViewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatInputModule,
    MatTableModule,
    MatPaginatorModule,
    MatSortModule,
    MatProgressSpinnerModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
