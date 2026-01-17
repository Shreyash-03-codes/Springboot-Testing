package com.springboot.posting.socials.dto.response;

import com.springboot.posting.socials.dto.error.ApiError;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ApiResponse<T> {

    private LocalDateTime dateTime;

    private T data;

    private ApiError error;

    ApiResponse(){
        this.dateTime=LocalDateTime.now();
    }

    public ApiResponse(T data){
        this.data=data;
    }

    public ApiResponse(ApiError error){
        this.error=error;
    }
}
