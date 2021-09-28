package com.example.backend.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import com.example.backend.dto.ResponseDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    // @ExceptionHandler(NoSuchElementException.class)
    // public ResponseEntity<Object> handleNotFoundException(NoSuchElementException
    // notFoundException) {
    // return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
    // ResponseDto.builder().message(notFoundException.getMessage()).status(HttpStatus.NOT_FOUND).build());
    // }

    // @ExceptionHandler(IllegalArgumentException.class)
    // protected ResponseEntity<Object> handleMethodArgumentNotValid(final
    // IllegalArgumentException ex) {
    // return new ResponseEntity(ex, HttpStatus.BAD_REQUEST);

    // }

}
