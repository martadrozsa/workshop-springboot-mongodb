package com.martadrozsa.workshopmongo.workshopspringbootmongodb.repository;

import com.martadrozsa.workshopmongo.workshopspringbootmongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
