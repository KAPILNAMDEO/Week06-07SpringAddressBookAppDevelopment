import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component'; // ✅ Import standalone component

@NgModule({
  
  imports: [
    BrowserModule,
    UserListComponent // ✅ Import it instead of declaring it
  ],
  
})
export class AppModule { }
