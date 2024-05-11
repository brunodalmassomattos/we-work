package br.com.fiap.wework.controller.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandler {

    private StandardError standardError = new StandardError();

    @ExceptionHandler(ControllerNotFoundException.class)
    public ResponseEntity<StandardError> entityNotFound(ControllerNotFoundException exception,
                                                        HttpServletRequest request) {
        standardError.setTimeStamp(Instant.now());
        standardError.setStatus(HttpStatus.NOT_FOUND.value());
        standardError.setError("Entity not found");
        standardError.setMessage(exception.getMessage());
        standardError.setPath(request.getRequestURI());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.standardError);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<StandardError> validation(MethodArgumentNotValidException exception,
                                                    HttpServletRequest request) {
        var validateError = new ValidateError();

        validateError.setTimeStamp(Instant.now());
        validateError.setStatus(HttpStatus.BAD_REQUEST.value());
        validateError.setError("Entity not found");
        validateError.setMessage(exception.getMessage());
        validateError.setPath(request.getRequestURI());

        exception.getBindingResult().getFieldErrors().forEach(item -> validateError.addMessage(item.getField(), item.getDefaultMessage()));

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(validateError);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<StandardError> validation(DataIntegrityViolationException exception,
                                                    HttpServletRequest request) {
        var validateError = new ValidateError();

        validateError.setTimeStamp(Instant.now());
        validateError.setStatus(HttpStatus.BAD_REQUEST.value());
        validateError.setError("Entity duplicaded");
        validateError.setMessage(exception.getMessage());
        validateError.setPath(request.getRequestURI());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(validateError);
    }

}
