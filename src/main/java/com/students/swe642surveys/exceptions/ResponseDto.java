package com.students.swe642surveys.exceptions;

import lombok.Data;

/*
 * @author Vamshi Gopari, Akhil Krishna Sai Takkella, Purna Chandra Pattipati, Vaishnavi Priya Chennu
 * This is a dto class for response.
 * */
@Data
public class ResponseDto {

    private String message;
    private int statusCode;

    public ResponseDto() {
    }

    public ResponseDto(String message) {
        this.message = message;
    }

    public ResponseDto(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }
}
