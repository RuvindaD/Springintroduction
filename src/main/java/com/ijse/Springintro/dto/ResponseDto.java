package com.ijse.Springintro.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto<T> {
    private String message;
    private T data;
}
