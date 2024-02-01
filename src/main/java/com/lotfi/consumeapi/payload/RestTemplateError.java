package com.lotfi.consumeapi.payload;

import lombok.Data;

@Data
public class RestTemplateError {
    private String timestamp;
    private String status;
    private String error;
    private String path;
}