package org.jpos.rest.config;


import org.reflections.Reflections;

import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;
import java.util.Set;

@Provider
public class AutoRegisterFeature implements Feature {

    @Override
    public boolean configure(FeatureContext context) {
        Reflections reflections = new Reflections("org.jpos.rest.controllers");
        Set<Class<?>> classes = reflections.getTypesAnnotatedWith(javax.ws.rs.Path.class);
        for (Class<?> clazz : classes) {
            context.register(clazz);
        }
        return true;
    }
}
