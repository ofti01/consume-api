package com.lotfi.consumeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Vehicle {

    @JsonProperty("form_factor")
    private String fromFactor;

    @JsonProperty("propulsion_type")
    private String propulsionType;

    @JsonProperty("vehicle_type_id")
    private String vehicleTypeId;

    @JsonProperty("max_range_meters")
    private long maxRangeMeters;

}
