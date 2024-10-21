package org.jpos.rest.services.impl;

import org.jpos.rest.services.contracts.EchoService;
import org.jvnet.hk2.annotations.Service;



@Service
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo() {
        return "Echo!";
    }
}
