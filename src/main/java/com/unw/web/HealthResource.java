/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unw.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Component;

/**
 *
 * @author UNGERW
 */
@Component
@Path("cce/")
public class HealthResource {

    @GET
    @Path("/health")
    public Response test() {
        return Response.status(200).entity("App is running").build();
    }

}
