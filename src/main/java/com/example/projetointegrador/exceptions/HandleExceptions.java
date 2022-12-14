package com.example.projetointegrador.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class HandleExceptions {

    @ExceptionHandler(SectionInvalidException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(SectionInvalidException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("section invalid")
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(BatchInvalidException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(BatchInvalidException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("batch invalid")
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(ProductNotFoundException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("product not found")
                .message(ex.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CategoryInvalidException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(CategoryInvalidException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("category invalid")
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(InsuficientVolumeException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(InsuficientVolumeException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("insuficient volume")
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(StorageInvalidException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(StorageInvalidException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("storage invalid")
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ExpiredProductException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(ExpiredProductException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("product about to expire or expired")
                .message(ex.getMessage())
                .status(HttpStatus.CONFLICT.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(UserUNotFoundException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(UserUNotFoundException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("user not found")
                .message(ex.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InsufficientStockException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(InsufficientStockException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("insufficient stock")
                .message(ex.getErrors().toString())
                .status(HttpStatus.UNPROCESSABLE_ENTITY.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(InvalidOrderTypeException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(InvalidOrderTypeException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("invalid order type")
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(PeriodInvalidException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(PeriodInvalidException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("invalid period")
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BatchProductNotFoundException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(BatchProductNotFoundException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("batch product not found")
                .message(ex.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(CartItemNotFoundException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(CartItemNotFoundException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
            .title("No cart item to discount")
            .message(ex.getMessage())
            .status(HttpStatus.NOT_FOUND.value())
            .timeStamp(LocalDateTime.now())
            .build();
        
        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InvalidUserException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(InvalidUserException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("invalid user")
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ExpiredCancellationPeriodException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(ExpiredCancellationPeriodException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("cancellation period expired")
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnfinishedOrderException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(UnfinishedOrderException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("unfinished order")
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidDateFormatException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(InvalidDateFormatException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("invalid date format")
                .message(ex.getMessage())
                .status(HttpStatus.BAD_REQUEST.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CartNotFoundException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(CartNotFoundException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("cart not found")
                .message(ex.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UsernameNotFoundException.class)
    public ResponseEntity<ExceptionDetails> handleInvalidFields(UsernameNotFoundException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .title("username not found")
                .message(ex.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
    }
}
