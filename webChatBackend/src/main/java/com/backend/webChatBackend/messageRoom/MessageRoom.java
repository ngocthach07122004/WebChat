package com.backend.webChatBackend.messageRoom;

import com.backend.webChatBackend.messageContent.MessageContent;
import com.backend.webChatBackend.messageRoomMember.MessageRoomMember;
import com.backend.webChatBackend.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@Data
@Entity
@Table(name = "message_room")
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)

public class MessageRoom {
    @Id
    @GeneratedValue(generator = "UUID", strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    private Boolean isGroup;

    @CreatedDate
    private LocalDateTime createdDate;

    @ManyToOne
    @JoinColumn(name = "createdBy")
    private User createdBy;

    @OneToMany(mappedBy = "messageRoom", cascade = CascadeType.ALL)
    private List<MessageRoomMember> members;

    @OneToMany(mappedBy = "messageRoom", cascade = CascadeType.ALL)
    private List<MessageContent> messageContents;
}