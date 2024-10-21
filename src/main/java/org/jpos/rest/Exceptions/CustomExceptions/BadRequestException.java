package org.jpos.rest.Exceptions.CustomExceptions;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message){
        super(message);
    }
}
