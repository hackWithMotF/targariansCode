import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { MatInputModule, MatPaginatorModule, MatProgressSpinnerModule, 
  MatSortModule, MatTableModule } from "@angular/material"
  import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DetailComponentComponent } from './detail-component/detail-component.component';
import { HttpClientModule} from "@angular/common/http";
import { PanelViewComponent } from './panel-view/panel-view.component';
import { Routes } from '@angular/router';

const appRoutes: Routes =  [
  {path:'', component: DetailComponentComponent}
]
@NgModule({
  declarations: [
    AppComponent,
    DetailComponentComponent,
    PanelViewComponent
  ],
  imports: [
    // BrowserAnimationsModule,
    BrowserModule,
    AppRoutingModule,
    MatInputModule,
    MatTableModule,
    MatPaginatorModule,
    MatSortModule,
    MatProgressSpinnerModule,
    RouterModule.forRoot(appRoutes)
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
