package com.martadrozsa.workshopmongo.workshopspringbootmongodb.service;

import com.martadrozsa.workshopmongo.workshopspringbootmongodb.domain.Post;
import com.martadrozsa.workshopmongo.workshopspringbootmongodb.repository.PostRepository;
import com.martadrozsa.workshopmongo.workshopspringbootmongodb.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post findById(String id) {
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public List<Post> findByTitle(String text) {
        return postRepository.findByTitleContainingIgnoreCase(text);
    }

}
