package com.ghy.spring.dubbo.springbootapi;



import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public interface GhyServer {
    @GET
    @Path("/say")
    String ghyServer(String str);
}
