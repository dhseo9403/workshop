package com.test.springbootapp.service;

import java.util.List;

import com.test.springbootapp.dto.PostDto;

public interface PostService {
    PostDto createPost(PostDto post);
    List<PostDto> getAllPosts();
    PostDto getPostById(Long id);
    PostDto updatePost(PostDto post, Long id);
    void deletePostById(Long id);

}
