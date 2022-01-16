package dev.borczeangelov.poc.springboot.controller;

import java.time.LocalTime;
import java.util.Arrays;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.borczeangelov.poc.springboot.dto.Message;
import dev.borczeangelov.poc.springboot.dto.MessageBoard;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MessageBoardController {

    private static MessageBoard messageBoard = InitialiseMessageBoard();

    @RequestMapping(value = "/api/messageboard/getmessageboard")
    public MessageBoard getMessageBoard() {
        return messageBoard;
    }

    @PostMapping(value = "/api/messageboard/postmessage")
    public MessageBoard postMessage(@RequestBody Message newMessage) {
        newMessage.setId(messageBoard.getMessages().length);
        newMessage.setTimeStamp(LocalTime.now());

        Message[] oldMessages = messageBoard.getMessages();
        Message[] newMessages = Arrays.copyOf(oldMessages, oldMessages.length + 1);
        newMessages[oldMessages.length] = newMessage;
        messageBoard.setMessages(newMessages);

        return messageBoard;
    }

    @RequestMapping(value = "/api/messageboard/clearmessageboard")
    public MessageBoard clearMessageBoard() {
        messageBoard.setMessages(new Message[0]);
        return messageBoard;
    }

    private static MessageBoard InitialiseMessageBoard() {
        LocalTime localTime = LocalTime.now();
        String title = "Server generated message board." +
                " LocalTime = " + localTime;

        Message[] messages = new Message[] {
                new Message(0, "Cloud Server", "Hi, this is the first message from the cloud", localTime)
        };

        return new MessageBoard(title, messages);
    }
}