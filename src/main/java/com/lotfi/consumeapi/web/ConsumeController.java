package com.lotfi.consumeapi.web;

import com.lotfi.consumeapi.model.Bike;
import com.lotfi.consumeapi.payload.BikeResponse;
import com.lotfi.consumeapi.service.ConsumeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ConsumeController {

    private final ConsumeService consumeService;

    @GetMapping("/bikes")
    public ResponseEntity<List<BikeResponse>> getAll(){
        return new ResponseEntity<>(consumeService.getAllBikes(), HttpStatus.OK);
    }
}
