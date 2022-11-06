package com.restdemo;
import javax.ws.rs.GET;
//http://localhost:8989/RestServiceDemo/rest/rs/show
import javax.ws.rs.Path;
import javax.ws.rs.Produces;




@Path("/rs")
public class Test {
	
	
	@Path("/show")
	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_HTML)
	public String show()
	{
		return "hello World";
	}
	
	@Path("/display")
	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_HTML)
	public String display()
	{
		return "sky is the limit";
	}
	
	
	
	
}
