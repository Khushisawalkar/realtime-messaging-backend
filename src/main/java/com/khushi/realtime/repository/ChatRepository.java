package com.khushi.realtime.repository;

import com.khushi.realtime.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ChatRepository extends JpaRepository<ChatMessage, Long> {

    List<ChatMessage> findBySenderAndReceiver(String sender, String receiver);

}