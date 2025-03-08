export interface User {
    id?: number; // Optional if you are creating a new user
    name: string;
    phoneNumber: string;
    email: string;
    address: string;
    city: string;
    state: string;
    zipcode: string;
}

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { UserCreateComponent } from './user-create/user-create.component'; // ✅ Import the standalone component

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    UserCreateComponent // ✅ Import it instead of declaring it
  ]
})
export class UserModule { }
