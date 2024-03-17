package com.util;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Data
@Getter
@Setter
public class CustomeRespoonse {

    private String message;
    private HttpStatus status;
    private Object data;
}
