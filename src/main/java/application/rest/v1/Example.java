package application.rest.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/*
@Path("v1/example")
public class Example {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response example() {
		List<String> list = new ArrayList<>();
		// return a simple list of strings
		list.add("Congratulations, your application is up and running");
		return Response.ok(list.toString()).build();
	}

}
*/

@Path("hello")
public class Example {

	@GET
	public String greet() throws Exception {
		return "Hello from " + java.net.InetAddress.getLocalHost().getHostName();
	}
}
