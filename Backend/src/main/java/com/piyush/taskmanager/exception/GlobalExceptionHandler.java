package com.piyush.taskmanager.exception;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleException(RuntimeException ex) {
        return ResponseEntity
                .badRequest()
                .body(Map.of(
                        "success", false,
                        "message", ex.getMessage()
                ));
    }
}