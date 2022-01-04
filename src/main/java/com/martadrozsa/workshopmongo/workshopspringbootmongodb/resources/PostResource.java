package com.martadrozsa.workshopmongo.workshopspringbootmongodb.resources;

import com.martadrozsa.workshopmongo.workshopspringbootmongodb.domain.Post;
import com.martadrozsa.workshopmongo.workshopspringbootmongodb.resources.util.URL;
import com.martadrozsa.workshopmongo.workshopspringbootmongodb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;
import java.util.List;


@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    private final PostService postService;

    @Autowired
    public PostResource(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = postService.findById(id);
        return ResponseEntity.ok().body((obj));
    }

    @RequestMapping(value = "/titlesearch", method = RequestMethod.GET)
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
        text = URL.decodeParam(text);
        List<Post> list = postService.findByTitle(text);
        return ResponseEntity.ok().body((list));
    }
}
