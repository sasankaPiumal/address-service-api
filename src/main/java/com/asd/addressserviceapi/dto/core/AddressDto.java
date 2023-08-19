package com.asd.addressserviceapi.dto.core;

import lombok.*;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

    private String id;

    private String country;

    private String city;

}
