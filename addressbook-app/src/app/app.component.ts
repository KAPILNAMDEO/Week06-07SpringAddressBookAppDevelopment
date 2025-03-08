import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router'
import { CommonModule } from '@angular/common'; // Required for standalone components
import { UserListComponent } from './user-list/user-list.component'; // Adjust the path if needed

@Component({
  selector: 'app-root',
  standalone: true, // Mark AppComponent as standalone
  imports: [CommonModule, UserListComponent], // Ensure it's an array
  template: `<app-user-list></app-user-list>`, // ✅ Use it in the template
})
export class AppComponent {
}

