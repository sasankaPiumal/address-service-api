package com.asd.addressserviceapi.dto.request;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RequestAddressDto {

    private String id;

    private String country;

    private String city;


}
