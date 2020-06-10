package com.unw.service;

import com.unw.entity.Person;
import java.util.List;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author UNGERW
 */
@Component
@Path("/spring-docker-db/")
public class HelloWorldService {
  
  @Autowired
  private PersonService personService;

  @GET
  @Path("/hello")
  public Response test() {
    return Response.status(200).entity("Rest Enpoint , Date 10.05.2019 - HELLO AWS Friends - V1.1").build();
  }

  @GET
  @Path("/helloPerson")
  public Response helloPerson() {
    List<Person> persons = personService.findAll();
    System.out.println("Persons in table " + persons.size());
    Person person = personService.findByName("wolfgang");
    return Response.status(200).entity("Rest Enpoint , Date 10.05.2019 - HELLO " + person!=null ?person.getName(): "-" ).build();
  }

}
