import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { Routes, RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { JudgeComponent } from './judge/judge.component';
import { CompetitionComponent } from './competition/competition.component';
import { HomeComponent } from './home/home.component';
import { ClubComponent } from './club/club.component';

export const ROUTES: Routes = [
  { path: 'judge/:id/account', component: JudgeComponent },
  { path: 'club/:id/account', component: ClubComponent},
  { path: 'competition', component: CompetitionComponent},
  { path: 'home', component: HomeComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    JudgeComponent,
    CompetitionComponent,
    HomeComponent,
    ClubComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    RouterModule.forRoot(ROUTES)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
