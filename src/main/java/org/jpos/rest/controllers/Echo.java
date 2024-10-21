package org.jpos.rest.controllers;
import io.swagger.annotations.Api;
import org.jpos.rest.services.contracts.EchoService;
import org.jpos.rest.services.impl.EchoServiceImpl;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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

}