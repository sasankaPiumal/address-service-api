package com.asd.addressserviceapi.util.mappers;

import com.asd.addressserviceapi.dto.core.AddressDto;
import com.asd.addressserviceapi.dto.response.ResponseAddressDto;
import com.asd.addressserviceapi.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address toAddress(AddressDto addressDto);

    ResponseAddressDto toAddressResponseData(Address address);

}
