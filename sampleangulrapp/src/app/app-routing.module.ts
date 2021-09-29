import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { ChildAComponent } from './child-a/child-a.component';
import { ChildBComponent } from './child-b/child-b.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [{
  path: "home",
  component: HomeComponent
}, {
  path: "about",
  component: AboutComponent
}, {
  path: "contact",
  component: ContactComponent,
  children: [
    {
      path: 'child-a', // child route path
      component: ChildAComponent, // child route component that the router renders
    },
    {
      path: 'child-b',
      component: ChildBComponent, // another child route component that the router renders
    }]
}, {
  path: "",
  redirectTo: "/home",
  pathMatch: "full"
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
