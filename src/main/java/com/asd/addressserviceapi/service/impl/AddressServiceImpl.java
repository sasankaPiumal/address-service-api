package com.asd.addressserviceapi.service.impl;

import com.asd.addressserviceapi.dto.core.AddressDto;
import com.asd.addressserviceapi.dto.request.RequestAddressDto;
import com.asd.addressserviceapi.dto.response.ResponseAddressDto;
import com.asd.addressserviceapi.entity.Address;
import com.asd.addressserviceapi.exception.ClassNotFoundException;
import com.asd.addressserviceapi.repo.AddressRepo;
import com.asd.addressserviceapi.service.AddressService;
import com.asd.addressserviceapi.util.mappers.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.Random;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;

    private final AddressMapper addressMapper;

    @Autowired
    public AddressServiceImpl(AddressRepo addressRepo, AddressMapper addressMapper) {
        this.addressRepo = addressRepo;
        this.addressMapper = addressMapper;
    }

    @Override
    public ResponseAddressDto saveAddress(RequestAddressDto addressRequestData) {
        AddressDto addressDto = new AddressDto(
                addressRequestData.getId(),
                addressRequestData.getCountry(),
                addressRequestData.getCity()
        );

        Address address = addressMapper.toAddress(addressDto);
        addressRepo.save(address);
        return addressMapper.toAddressResponseData(address);
    }

    @Override
    public ResponseAddressDto findAddressData(String id) {
        Optional<Address> selectedAddress = addressRepo.findById(id);
        if (selectedAddress.isPresent()) {
            return addressMapper.toAddressResponseData(selectedAddress.get());
        }
        throw new ClassNotFoundException("Not Found details by id " + id);
    }
}
