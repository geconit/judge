import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {Http, Response} from "@angular/http";

@Component({
  selector: 'app-judge',
  templateUrl: './judge.component.html',
  styleUrls: ['./judge.component.css']
})
export class JudgeComponent implements OnInit {

  judgeList = [];

  constructor(private http:Http) { }

  ngOnInit() {
    this.getCompetition()
  }

  getCompetition = () => {
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

}
