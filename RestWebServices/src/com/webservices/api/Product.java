package com.webservices.api;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/product")
public class Product {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String productName(){
		return "My name is ipad 2";
	}
	
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String productNameByID(@PathParam("ProductId") String id){
		if (id.equals("1"))
		return "ID ";
		else
			return "No Product";
		
	}*/
	
	@GET
	@Path("{productId}")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public String productId(@PathParam("productId") int id){
		if(id == 1)
			return "id is "+"1";
		else 
			return "no productId";
	}	
	@GET
	@Path("/productname/{productName}")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public String productName(@PathParam("productName") String name){
		
			return "Hello "+name;
				
}
	
	
	
}
