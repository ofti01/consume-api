package com.lotfi.consumeapi.service;

import com.lotfi.consumeapi.model.Bike;
import com.lotfi.consumeapi.model.DataInfo;
import com.lotfi.consumeapi.model.Vehicle;
import com.lotfi.consumeapi.payload.BikeResponse;
import com.lotfi.consumeapi.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ConsumeService {

    private final RestTemplate restTemplate;


    public List<BikeResponse> getAllBikes(){
        DataInfo dataInfo = restTemplate.getForEntity(Constants.BIKE_API, DataInfo.class).getBody();
        DataInfo dataVehicles = restTemplate.getForEntity(Constants.VEHICLES_API, DataInfo.class).getBody();
        if( dataInfo != null && dataVehicles != null) {
            List<Bike> bikes = dataInfo.getTypeDataInfo().getBikes();
            List<BikeResponse> bikeResponses = new ArrayList<>();
            List<Vehicle> vehicles = dataVehicles.getTypeDataInfo().getVehicles();
            bikes.forEach(bike -> {
                List<Vehicle> vehicleList = vehicles.stream().filter(vehicle -> {
                    return Objects.equals(vehicle.getVehicleTypeId(), bike.getVehicleTypeId());
                }).toList();
                BikeResponse bikeResponse = BikeResponse.builder()
                        .bikeId(bike.getBikeId())
                        .isDisabled(bike.isDisabled())
                        .isReserved(bike.isReserved())
                        .fromFactor(vehicleList.get(0).getFromFactor())
                        .build();
                bikeResponses.add(bikeResponse);
            });
            return bikeResponses;
        }
        else
            return null;
    }

}
