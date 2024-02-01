package com.lotfi.consumeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TypeDataInfo {

    @JsonProperty("bikes")
    private List<Bike> bikes;

    @JsonProperty("vehicle_types")
    private List<Vehicle> vehicles;
}
