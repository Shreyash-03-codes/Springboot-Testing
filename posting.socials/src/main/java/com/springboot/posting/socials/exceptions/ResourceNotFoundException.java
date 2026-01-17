package com.springboot.posting.socials.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException{

    private String message;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
