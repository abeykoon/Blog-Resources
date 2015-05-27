package com.wso2.example;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.concurrent.atomic.AtomicInteger;

@Path("/count")
public class MessageCountService {

    private AtomicInteger counter = new AtomicInteger();
    private Integer printCountBy = 1;

    @GET
    @Path("/increment")
    public Response increment(@QueryParam("id") String id) {
        int currentVal = counter.incrementAndGet();
        if(currentVal % printCountBy == 0) {
            System.out.println("Message Count = " + currentVal + " Message ID = " + id);
        }
        return Response.ok().build();
    }

    @GET
    @Path("/decrement")
    public Response decrement(@QueryParam("id") String id) {
        int currentVal = counter.decrementAndGet();
        if(currentVal % printCountBy == 0) {
            System.out.println("Message Count = " + currentVal + " Message ID = " + id);
        }
        return Response.ok().build();
    }

    @GET
    @Path("/reset")
    public Response reset() {
        counter.set(0);
        return Response.ok().build();
    }
}
