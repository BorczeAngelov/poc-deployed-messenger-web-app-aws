package dev.borczeangelov.poc.springboot.dto;

public class MessageBoard {
    private String title;

    public MessageBoard(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}