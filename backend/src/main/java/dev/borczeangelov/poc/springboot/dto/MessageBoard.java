package dev.borczeangelov.poc.springboot.dto;

public class MessageBoard {
    private String title;
    private Message[] messages;

    public MessageBoard(String title, Message[] messages) {
        this.title = title;
        this.messages = messages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Message[] getMessages() {
        return messages;
    }

    public void setMessages(Message[] messages) {
        this.messages = messages;
    }
}