package com.backend.webChatBackend.user;


import com.backend.webChatBackend.messageRoom.MessageRoom;
import com.backend.webChatBackend.messageRoomMember.MessageRoomMember;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    private LocalDateTime lastLogin = LocalDateTime.now();

    private String avatarUrl;

    @OneToMany(mappedBy = "createdBy")
    private List<MessageRoom> messageRooms;

    @OneToMany(mappedBy = "user" )
    private List<MessageRoomMember> messageRoomMembers;

}