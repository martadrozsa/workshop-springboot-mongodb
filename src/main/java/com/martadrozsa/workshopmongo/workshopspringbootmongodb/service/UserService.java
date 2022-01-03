package com.martadrozsa.workshopmongo.workshopspringbootmongodb.service;

import com.martadrozsa.workshopmongo.workshopspringbootmongodb.domain.User;
import com.martadrozsa.workshopmongo.workshopspringbootmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
