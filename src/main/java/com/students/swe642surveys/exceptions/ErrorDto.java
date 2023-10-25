package com.students.swe642surveys.exceptions;

import lombok.Data;

@Data
public class ErrorDto {

    private String errorMessage;
    private int errorCode;

    public ErrorDto() {
    }

    public ErrorDto(String errorMessage, int errorCode) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }
}
