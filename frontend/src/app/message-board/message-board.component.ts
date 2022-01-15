import { Component, OnInit } from '@angular/core';
import { MessageBoardService } from './message-board.service';
import {MatFormFieldModule} from '@angular/material/form-field'; 

@Component({
  selector: 'app-message-board',
  templateUrl: './message-board.component.html',
  styleUrls: ['./message-board.component.css']
})
export class MessageBoardComponent implements OnInit {

  constructor(public messageBoardService: MessageBoardService) { }

  ngOnInit(): void {
    this.messageBoardService.loadMessageBoard();
  }
}
