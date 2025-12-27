package com.example.posts_service.controller;

import com.example.posts_service.dto.request.PostCreateRequestDto;
import com.example.posts_service.dto.response.PostCreateResponseDto;
import com.example.posts_service.service.PostService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    @PostMapping("/create")
    public ResponseEntity<PostCreateResponseDto> createPost(@RequestBody PostCreateRequestDto postCreateRequestDto, HttpServletRequest request) {
        PostCreateResponseDto postCreateResponseDto = postService.createPost(postCreateRequestDto,1L);
        return ResponseEntity.status(HttpStatus.CREATED).body(postCreateResponseDto);
    }

}
