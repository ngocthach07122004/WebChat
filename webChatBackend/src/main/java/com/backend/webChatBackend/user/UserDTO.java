package com.backend.webChatBackend.user;

import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private String password;
    private UserStatus status;
    private String avatarUrl;
}