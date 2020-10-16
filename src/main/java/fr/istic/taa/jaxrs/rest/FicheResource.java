package fr.istic.taa.jaxrs.rest;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.dao.generic.FicheDao;
import fr.istic.taa.jaxrs.domain.Fiche;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/fiche")
@Produces({"application/json", "application/xml"})
public class FicheResource {

	@GET
	public Response getFiches(){
		FicheDao dao = new FicheDao();
		return Response.ok(dao.findAll()).build();
	}

	@POST
	public Response addFiche(
			@Parameter(description = "Fiche object that needs to be added to the store", required = true) Fiche fiche) {
		FicheDao dao = new FicheDao();
		dao.save(fiche);
		return Response.ok().entity("SUCCESS").build();
	}

	@DELETE
	@Path("/{ficheId}")
	public Response deleteFiche(@PathParam("ficheId") Long id)  {
		FicheDao dao = new FicheDao();
		dao.deleteById(id);
		return Response.ok().build();
	}

	@GET
	@Path("/{ficheId}")
	public Fiche getFicheById(@PathParam("ficheId") Long id)  {
		FicheDao dao = new FicheDao();
		dao.findOne(id);
		return new Fiche();
	}
}