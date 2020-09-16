package fr.istic.taa.jaxrs.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.dao.generic.UserDao;
import fr.istic.taa.jaxrs.domain.User;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/user")
@Produces({"application/json", "application/xml"})
public class UserResource {

	@GET
	public List<User> getUsers(){
		UserDao dao = new UserDao();
		return dao.findAll();
	}
	
	@GET
	@Path("/{userId}")
	public User getUserById(@PathParam("userId") Long id)  {
		UserDao dao = new UserDao();
		return dao.findOne(id);
	}

	@POST
	@Consumes("application/json")
	public Response addUser(
			@Parameter(description = "User object that needs to be added to the store", required = true) User user) {
		UserDao dao = new UserDao();
		dao.save(user);
		return Response.ok().entity("SUCCESS").build();
	}
}