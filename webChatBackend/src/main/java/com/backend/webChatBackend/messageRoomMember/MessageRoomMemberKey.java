package com.backend.webChatBackend.messageRoomMember;

import com.backend.webChatBackend.messageRoom.MessageRoom;
import com.backend.webChatBackend.user.User;
import lombok.Data;

import java.io.Serializable;
@Data
public class MessageRoomMemberKey implements Serializable {
      private User user;
      private MessageRoom messageRoom;
}
