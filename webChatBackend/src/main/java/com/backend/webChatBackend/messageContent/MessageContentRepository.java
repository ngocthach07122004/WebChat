package com.backend.webChatBackend.messageContent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.JavaBean;
import java.util.UUID;
@Repository
public interface MessageContentRepository  extends JpaRepository<MessageContent, UUID> {
}
