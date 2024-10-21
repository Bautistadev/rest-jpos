package org.jpos.rest.services.impl;

import org.jpos.rest.Exceptions.CustomExceptions.BadRequestException;
import org.jpos.rest.services.contracts.EchoService;
import org.jvnet.hk2.annotations.Service;



@Service
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo() {
        return "Echo!";
    }

    @Override
    public String echo(String message) {

        if(message.equalsIgnoreCase("hola"))
            throw new BadRequestException("No ingresar hola");

        return message;
    }


}
