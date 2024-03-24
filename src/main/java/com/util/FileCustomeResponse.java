package com.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class FileCustomeResponse {


    private String name;
    private String url;
    private String type;
    private long size;
    private String message;

    public FileCustomeResponse(String message) {
        this.message = message;
    }
}
