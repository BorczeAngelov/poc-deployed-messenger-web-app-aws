package dev.borczeangelov.poc.springboot.controller;

import java.time.LocalTime;
import java.util.Collections;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.borczeangelov.poc.springboot.dto.PingServerRespone;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PingServerController {

    private static Integer _counter = 0;

    @RequestMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> index() {
        return Collections.singletonMap("message", "Greetings from updated Spring Boot!");
    }

    @RequestMapping(value = "/api/pingServer")
    public PingServerRespone pingServer() {

        String message = "This is ping-pong respone from server." +
                " LocalTime = " + LocalTime.now() +
                " Static counter = " + ++_counter;

        return new PingServerRespone(message);
    }
}
