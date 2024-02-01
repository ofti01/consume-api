package com.lotfi.consumeapi.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BikeResponse {

    @JsonProperty("bike_id")
    private String bikeId;

    @JsonProperty("is_disabled")
    private boolean isDisabled;

    @JsonProperty("is_reserved")
    private boolean isReserved;

    @JsonProperty("form_factor")
    private String fromFactor;
}
