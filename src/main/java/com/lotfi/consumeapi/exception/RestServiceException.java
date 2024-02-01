package com.lotfi.consumeapi.exception;

import org.springframework.http.HttpStatusCode;


public class RestServiceException extends RuntimeException {

    private String serviceName;
    private HttpStatusCode statusCode;
    private String error;

    public RestServiceException(
            String serviceName,
            HttpStatusCode statusCode,
            String error) {

        super();
        this.serviceName = serviceName;
        this.statusCode = statusCode;
        this.error = error;
    }
}
