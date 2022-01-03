package com.martadrozsa.workshopmongo.workshopspringbootmongodb.service.exception;

import com.martadrozsa.workshopmongo.workshopspringbootmongodb.domain.User;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException(String msg) {
        super(msg);
    }




}
