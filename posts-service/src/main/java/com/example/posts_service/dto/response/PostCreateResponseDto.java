package com.example.posts_service.dto.response;

import lombok.*;


import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostCreateResponseDto {
    private Long id;
    private String content;
    private Long userId;
    private LocalDateTime createdAt;
}
