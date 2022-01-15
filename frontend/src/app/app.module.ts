import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { PingServerComponent } from './ping-server/ping-server.component';
import { MessageBoardComponent } from './message-board/message-board.component';

@NgModule({
  declarations: [
    AppComponent,
    PingServerComponent,
    MessageBoardComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
