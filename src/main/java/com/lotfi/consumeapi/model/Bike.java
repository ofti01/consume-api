package com.lotfi.consumeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Bike {

    @JsonProperty("bike_id")
    private String bikeId;

    @JsonProperty("current_range_meters")
    private long currentRangeMeters;

    @JsonProperty("is_disabled")
    private boolean isDisabled;

    @JsonProperty("is_reserved")
    private boolean isReserved;

    @JsonProperty("last_reported")
    private long lastReported;

    @JsonProperty("lon")
    private double longitude;

    @JsonProperty("lat")
    private double latitude;

    @JsonProperty("pricing_plan_id")
    private String pricingPlanID;

    @JsonProperty("rental_uris")
    private RentalUris rentalUris;

    @JsonProperty("vehicle_type_id")
    private String vehicleTypeId;

}
