package com.backend.webChatBackend.messageContent;

import com.backend.webChatBackend.messageRoom.MessageRoom;
import com.backend.webChatBackend.user.User;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MessageContentDTO {
    private UUID id;
    private String content;
    private LocalDateTime dateSent;
    private MessageType messageType;
    private UUID messageRoomId;
    private String sender;
}
