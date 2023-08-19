package com.asd.addressserviceapi.service;

import com.asd.addressserviceapi.dto.request.RequestAddressDto;
import com.asd.addressserviceapi.dto.response.ResponseAddressDto;

public interface AddressService {
    public ResponseAddressDto saveAddress(RequestAddressDto addressRequestData);

    public ResponseAddressDto findAddressData(String id);
}
