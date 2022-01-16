import { Component, OnInit } from '@angular/core';
import { Message } from './Message';
import { MessageBoardService } from './message-board.service';

@Component({
  selector: 'app-message-board',
  templateUrl: './message-board.component.html',
  styleUrls: ['./message-board.component.css']
})
export class MessageBoardComponent implements OnInit {

  userName: String = 'Guest';
  message: String = null;

  constructor(public messageBoardService: MessageBoardService) { }

  ngOnInit(): void {
    this.loadMessageBoard();
  }

  loadMessageBoard(): void {
    this.messageBoardService.loadMessageBoard();
  }

  clearMessageBoard(): void {
    this.messageBoardService.clearMessageBoard();
  }

  sendMessage(): void {

    if (this.message) {
      var newMessage: Message = {
        id: 0,
        user: this.userName,
        content: this.message,
        timeStamp: null,
      }

      console.log(this.message);


      this.messageBoardService.sendMessage(newMessage);
      this.message = null;
    }
  }
}
