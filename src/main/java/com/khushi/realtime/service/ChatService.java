package com.khushi.realtime.service;

import com.khushi.realtime.model.ChatMessage;
import com.khushi.realtime.repository.ChatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    private final ChatRepository repository;

    public ChatService(ChatRepository repository) {
        this.repository = repository;
    }

    public ChatMessage saveMessage(ChatMessage message) {
        return repository.save(message);
    }

    public List<ChatMessage> getMessages(String sender, String receiver) {
        return repository.findBySenderAndReceiver(sender, receiver);
    }
}