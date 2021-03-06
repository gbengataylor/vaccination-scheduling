package org.acme.vaccinationscheduler.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.acme.vaccinationscheduler.domain.Person;

@Path("/recipient/")
public class RecipientResource {

    @POST
    @Path("/request/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addRecipientRequest(Person person){
        return Response.ok().build();
    }

    @PUT
    @Path("/request/update")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addRecipientRequestUpdate(Person person){
        return Response.ok().build();
    }
}
