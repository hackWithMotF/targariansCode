package com.dbs.mq26.exception;

public class QueueAlreadyExistsException extends RuntimeException{
    public QueueAlreadyExistsException(String message) {
        super(message);
    }
}
