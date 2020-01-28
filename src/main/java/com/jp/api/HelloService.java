package com.jp.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/value")
public class HelloService {
	
	private String x = "";

	@GET
	@Path("/")
	public Response getMsg() {
		return Response.status(200).entity(x).build();
	}
	
	@POST
	@Path("/{value}")
	public Response setName(@PathParam("name") String value) {
		x = value;
		return Response.status(Status.OK).build();
	}
	
}
