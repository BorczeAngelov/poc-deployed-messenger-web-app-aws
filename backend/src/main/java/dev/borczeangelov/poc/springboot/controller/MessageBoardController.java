package dev.borczeangelov.poc.springboot.controller;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.borczeangelov.poc.springboot.dto.MessageBoard;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MessageBoardController {

    @RequestMapping(value = "/api/messageboard/getmessageboard")
    public MessageBoard getMessageBoard() {

        String title = "Test: Title title is set from server" +
                " LocalTime = " + LocalTime.now();

        return new MessageBoard(title);
    }
}