package com.ssafy.travlog.notification.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberModel {
    private Long memberId;
    private String loginId;
    private String hashedPassword;
    private String publicId;
    private String displayName;
    private String bio;
    private LocalDateTime createdAt;
}
