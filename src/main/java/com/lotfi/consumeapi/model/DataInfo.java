package com.lotfi.consumeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DataInfo {

    @JsonProperty("version")
    private String version;

    @JsonProperty("ttl")
    private String ttl;

    @JsonProperty("last_updated")
    private double lastUpdated;

    @JsonProperty("data")
    private TypeDataInfo typeDataInfo;
}
