package org.jpos.rest.services.impl;

import org.jpos.rest.dtos.response.Prueba;
import org.jpos.rest.services.contracts.EchoService;
import org.jvnet.hk2.annotations.Service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;


@Service
public class EchoServiceImpl implements EchoService {

    @Override
    public Response echo() {
        Map<String,String> resp= new HashMap<>();
        resp.put("message","Echo!");
        return  Response.ok(new Prueba("Echo!")).status(Response.Status.OK).build();
    }
}
