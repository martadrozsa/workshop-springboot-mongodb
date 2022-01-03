package com.martadrozsa.workshopmongo.workshopspringbootmongodb.repository;

import com.martadrozsa.workshopmongo.workshopspringbootmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
