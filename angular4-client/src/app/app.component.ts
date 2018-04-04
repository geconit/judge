import{Component, OnInit}from'@angular/core';
import{Http,Response}from'@angular/http';
import{Observable}from'rxjs/Observable';
import 'rxjs/add/operator/map';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit{
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
