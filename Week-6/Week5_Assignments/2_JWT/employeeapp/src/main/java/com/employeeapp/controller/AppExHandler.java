package com.employeeapp.controller;

import com.employeeapp.entities.ErrorDetails;
import com.employeeapp.exceptions.EmplpoyeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.Collectors;

@RestControllerAdvice
public class AppExHandler {

    @Value("${PRODUCT_APP_ERROR_500}")
    private String productAppError500;

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDetails> handle400(MethodArgumentNotValidException ex) {
        String message = ex.getBindingResult().getAllErrors().stream().map(ex1 -> ex1.getDefaultMessage()).collect(Collectors.joining(","));
        ErrorDetails errorDetails = ErrorDetails.builder()
                .timestamp(LocalTime.from(LocalDateTime.now())).errorCode(400).
                message(message).
                toContact("admin@thk.com").build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
    }
    //@ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorDetails> handleException500(Exception ex) {
//        ErrorDetails errorMessages = ErrorDetails
//                .builder().timestamp(LocalDateTime.now())
//                .status(500).
//                message(productAppError500)
//                .toContact("admin@thk.com")
//                .build();
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessages);
//    }

    @ExceptionHandler(EmplpoyeeNotFoundException.class)
    public ResponseEntity<ErrorDetails> handle404(EmplpoyeeNotFoundException ex) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .timestamp(LocalTime.from(LocalDateTime.now())).errorCode(404).
                message(ex.getMessage()).
                toContact("admin@thk.com").build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorDetails);
    }

}