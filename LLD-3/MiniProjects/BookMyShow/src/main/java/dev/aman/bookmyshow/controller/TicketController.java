package dev.aman.bookmyshow.controller;

import dev.aman.bookmyshow.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/hello")
    public ResponseEntity greet(){
        String value = ticketService.greet();
        return ResponseEntity.ok(value);
    }
}
