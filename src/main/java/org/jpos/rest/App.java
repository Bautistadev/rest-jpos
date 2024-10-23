package org.jpos.rest;

import config.AutoRegisterFeature;
import config.inyection.MyApplicationBinder;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.jpos.rest.Exceptions.ExceptionProvider;

public class App extends ResourceConfig {

    public App() {
        super();
        register(JacksonFeature.class);
        register(new MyApplicationBinder());
        register(AutoRegisterFeature.class);
        register(ApiListingResource.class);
        register(SwaggerSerializers.class);
        register(ExceptionProvider.class);
    }
}
