package com.asd.addressserviceapi.util;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StandardResponse {

    private int code;

    private String message;

    private Object data;

}
