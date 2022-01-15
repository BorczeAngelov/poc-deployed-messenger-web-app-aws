import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { PingServerComponent } from './ping-server/ping-server.component';
import { MessageBoardComponent } from './message-board/message-board.component';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { FormsModule } from '@angular/forms';

@NgModule({
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    MatFormFieldModule,
    MatInputModule,
  ],
  declarations: [
    AppComponent,
    PingServerComponent,
    MessageBoardComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
