package com.lotfi.consumeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RentalUris {

    @JsonProperty("android")
    private String android;

    @JsonProperty("ios")
    private String ios;
}
