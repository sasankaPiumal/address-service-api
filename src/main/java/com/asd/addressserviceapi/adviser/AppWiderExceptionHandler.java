package com.asd.addressserviceapi.adviser;

import com.asd.addressserviceapi.exception.ClassNotFoundException;
import com.asd.addressserviceapi.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWiderExceptionHandler {

    @ExceptionHandler(ClassNotFoundException.class)
    public ResponseEntity<StandardResponse> handleClassNotFoundException(ClassNotFoundException e){
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(404,e.getMessage(),e), HttpStatus.NOT_FOUND
        );

    }

}
