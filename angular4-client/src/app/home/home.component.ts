import { Component, OnInit } from '@angular/core';
import {Http, Response} from "@angular/http";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  judgeList = [];
  clubList = [];

  constructor(private http:Http){}

  ngOnInit() {
    this.getJudgeData();
    this.getClubData();
  }

  getJudgeData = () => {
    this.http.get("http://localhost:8080/judge")
      .map((res: Response) => res.json())
      .subscribe(
        (data: any) => {
          console.log(data)
          this.judgeList = data;
        },
        (error) => {
        });
    console.log(this.judgeList);
  }

  getClubData = () => {
    this.http.get("http://localhost:8080/club")
      .map((res: Response) => res.json())
      .subscribe(
        (data: any) => {
          console.log(data)
          this.clubList = data;
        },
        (error) => {
        });
    console.log(this.clubList);
  }
}
