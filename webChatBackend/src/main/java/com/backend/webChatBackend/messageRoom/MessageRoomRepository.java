package com.backend.webChatBackend.messageRoom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface MessageRoomRepository  extends JpaRepository<MessageRoom, UUID> {
}
