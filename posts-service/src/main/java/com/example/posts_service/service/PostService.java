package com.example.posts_service.service;

import com.example.posts_service.dto.request.PostCreateRequestDto;
import com.example.posts_service.dto.response.PostCreateResponseDto;
import com.example.posts_service.entity.Post;
import com.example.posts_service.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    private final ModelMapper modelMapper;

    public PostCreateResponseDto createPost(PostCreateRequestDto postCreateRequestDto,Long userId) {
        Post post = Post.builder()
                .userId(userId)
                .content(postCreateRequestDto.getContent())
                .build();
        post = postRepository.save(post);
        return modelMapper.map(post, PostCreateResponseDto.class);
    }
}
