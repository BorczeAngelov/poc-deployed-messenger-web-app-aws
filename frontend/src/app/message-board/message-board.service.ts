import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { MessageBoard } from './messageBoard';

@Injectable({
  providedIn: 'root'
})
export class MessageBoardService {

  serverUrl: string;
  messageBoard$: Observable<MessageBoard>;
  isProduction: boolean;

  constructor(private http: HttpClient) {
    this.isProduction = environment.production;

    if (this.isProduction) {
      this.serverUrl = "//" + window.location.hostname;
    }
    else {
      this.serverUrl = "http://localhost:8080";
    }
  }

  loadMessageBoard(): void {
    this.messageBoard$ = this.http.get<MessageBoard>(this.serverUrl + '/api/messageboard/getmessageboard');
  }
}
