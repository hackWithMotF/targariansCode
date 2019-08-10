package com.dbs.mq26.exception;

import com.dbs.mq26.controller.QueueController;



import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice(basePackageClasses = QueueController.class)
public class QueueExceptionHandler {

    @ExceptionHandler(QueueAlreadyExistsException.class)
    @ResponseBody
    public ResponseEntity<String> genericHandler(HttpServletRequest request, QueueAlreadyExistsException ex) {
        return new ResponseEntity<String>(ex.getMessage(), HttpStatus.OK);
    }
}
