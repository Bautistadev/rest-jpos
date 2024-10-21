package org.jpos.rest.services.contracts;

import org.glassfish.jersey.spi.Contract;



@Contract
public interface EchoService {

    String echo();
    String echo(String message);
}
