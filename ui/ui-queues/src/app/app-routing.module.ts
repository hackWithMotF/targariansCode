import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PanelViewComponent } from './panel-view/panel-view.component';


const routes: Routes = [
{
  path:"queue",
  component:PanelViewComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
