import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {Http, Response} from "@angular/http";

@Component({
  selector: 'app-club',
  templateUrl: './club.component.html',
  styleUrls: ['./club.component.css']
})
export class ClubComponent implements OnInit {

  id: number;
  private sub: any;
  competitionList = [];

  constructor(private route: ActivatedRoute, private http:Http) { }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.id = +params['id']; // (+) converts string 'id' to a number
    });
  }

  getCompetitionData = () => {
    this.http.get("http://localhost:8080/competition")
      .map((res: Response) => res.json())
      .subscribe(
        (data: any) => {
          console.log(data)
          this.competitionList = data;
        },
        (error) => {
        });
    console.log(this.competitionList);
  }

}
