package org.jpos.rest.controllers;
import io.swagger.annotations.Api;
import org.jpos.rest.services.contracts.EchoService;


import javax.inject.Inject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/echo")
@Api(value = "/echo", description = "Echo API")
public class Echo {

    @Inject
    private EchoService echoService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String echo() {
        return echoService.echo();
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String echo(String message){
        return echoService.echo(message);
    }

}