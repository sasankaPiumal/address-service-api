package com.asd.addressserviceapi.dto.response;


import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResponseAddressDto {

    private String id;

    private String country;

    private String city;
}
