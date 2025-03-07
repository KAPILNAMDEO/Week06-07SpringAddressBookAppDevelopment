import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserListComponent } from './user-list/user-list.component';
import { UserCreateComponent } from './user-create/user-create.component';
import { UserUpdateComponent } from './user-update/user-update.component';
import { UserDetailComponent } from './user-detail/user-detail.component';

const routes: Routes = [
  { path: 'users', component: UserListComponent },
  { path: 'create-user', component: UserCreateComponent },
  { path: 'update-user/:id', component: UserUpdateComponent },
  { path: 'user-details/:id', component: UserDetailComponent },
  { path: '', redirectTo: 'users', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }