import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { MatInputModule, MatPaginatorModule, MatProgressSpinnerModule, 
  MatSortModule, MatTableModule } from "@angular/material"
  import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DetailComponentComponent } from './detail-component/detail-component.component';
<<<<<<< HEAD
import {RouterModule, Routes} from '@angular/router';
=======
import { HttpClientModule} from "@angular/common/http";
import { PanelViewComponent } from './panel-view/panel-view.component';
>>>>>>> f3878a5a66fa764a5df8b8a30a63929b37d1e931

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
<<<<<<< HEAD
    RouterModule.forRoot(appRoutes)
=======
    HttpClientModule
>>>>>>> f3878a5a66fa764a5df8b8a30a63929b37d1e931
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
