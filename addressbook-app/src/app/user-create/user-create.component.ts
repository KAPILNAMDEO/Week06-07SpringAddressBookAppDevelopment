import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-user-create',
  standalone: true,
  templateUrl: './user-create.component.html',
  styleUrls: ['./user-create.component.css'],
  imports: [FormsModule,CommonModule]
})
export class UserCreateComponent {
  user = { name: '', phoneNumber: '', email: '', address: '', city: '', state: '', zipcode: '' };

  constructor(public http: HttpClient, public router: Router) {}

  createUser() {
    console.log('Add User button clicked!');  // ✅ Check if function is triggered
  
    this.http.post('http://localhost:8080/addressbook/add', this.user).subscribe({
      next: (response) => {
        console.log('User Created Successfully:', response);
        alert('User Added Successfully!');
        this.router.navigate(['/users']);
      },
      error: (err) => {
        console.error('Error Creating User:', err);
        alert('Failed to add user');
      }
    });
  }

  ngOnInit() {
    console.log('UserCreateComponent Loaded!');
  }
  
}

