package com.khushi.realtime.controller;

import com.khushi.realtime.model.ChatMessage;
import com.khushi.realtime.service.ChatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService service;

    public ChatController(ChatService service) {
        this.service = service;
    }

    @PostMapping("/send")
    public ChatMessage sendMessage(@RequestBody ChatMessage message) {
        return service.saveMessage(message);
    }

    @GetMapping("/history")
    public List<ChatMessage> getHistory(
            @RequestParam String sender,
            @RequestParam String receiver) {

        return service.getMessages(sender, receiver);
    }
}