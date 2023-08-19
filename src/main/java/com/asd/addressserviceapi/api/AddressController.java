package com.asd.addressserviceapi.api;

import com.asd.addressserviceapi.dto.request.RequestAddressDto;
import com.asd.addressserviceapi.dto.response.ResponseAddressDto;
import com.asd.addressserviceapi.service.AddressService;
import com.asd.addressserviceapi.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/addresses")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public ResponseEntity<StandardResponse> saveAddress(@RequestBody RequestAddressDto addressRequestData) {
       addressService.saveAddress(addressRequestData);
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(201, "Successfully Saved!", null), HttpStatus.CREATED
        );
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<StandardResponse> findAddress(@PathVariable String id) {

        ResponseAddressDto addressResponseData = addressService.findAddressData(id);
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(200, "Successfull!", addressResponseData), HttpStatus.OK

        );
    }

}
