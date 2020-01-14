package org.acme.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/v1")
public class ExampleResource {
    @GET
    public String hello(){
        return "hello";
    }

    @GET
    @Path("{name}")
    public String GreetingWithName(@PathParam("name") String name ) {
        return "hello "+name;
    }
}
