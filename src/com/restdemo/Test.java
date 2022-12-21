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
		return "happy diwali";
	}
	
	@Path("/delete")
	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_HTML)
	public String delete()
	{
		return "deleted";
	}
	
	@Path("/update")
	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_HTML)
	public String update()
	{
		return "updated";
	}
	
	
	
}
