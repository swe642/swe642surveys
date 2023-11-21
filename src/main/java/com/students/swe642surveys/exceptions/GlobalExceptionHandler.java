package com.students.swe642surveys.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
 * @author Vamshi Gopari, Akhil Krishna Sai Takkella, Purna Chandra Pattipati, Vaishnavi Priya Chennu
 * This class has global exception handle for the whole springboot application
 * */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDto> handleGlobalException(Exception exception) {
        // Log the exception or perform any other necessary actions
        ResponseDto response = new ResponseDto();
        response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        response.setMessage(exception.getLocalizedMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
