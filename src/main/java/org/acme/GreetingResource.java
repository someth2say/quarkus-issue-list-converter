package org.acme;

import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-list")
public class GreetingResource {

    @Inject
    BaseConfiguration baseConfig;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello "+baseConfig.mylist().stream().map(e->e.text).collect(Collectors.joining(","));
    }
}