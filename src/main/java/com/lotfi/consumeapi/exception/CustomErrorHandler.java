package com.lotfi.consumeapi.exception;


import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.BufferedReader;
import java.io.IOException;


@Component
public class CustomErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse response)
            throws IOException {
        return response.getStatusCode().is5xxServerError() ||
                response.getStatusCode().is4xxClientError();
    }

    @Override
    public void handleError(ClientHttpResponse response)
            throws IOException {

        if (response.getStatusCode().is4xxClientError()
                || response.getStatusCode().is5xxServerError()) {




                throw new RestServiceException(
                        response.getStatusText(),
                        response.getStatusCode(),
                        response.getBody().toString());
            }


    }
}