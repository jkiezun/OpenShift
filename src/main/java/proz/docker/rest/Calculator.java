package proz.docker.rest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;


//klasa g��wna implementuj�ca polecenia HTTP
// jest adnotowana @Path
// jest publiczna
// ma domy�lny i publiczny konstruktor
@Path("/calc")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class Calculator {
	@GET
	@Path("/dodaj")
	public String dodaj(@QueryParam("pierwLiczba") int pierwLiczba, @QueryParam("drugaLiczba") int drugaLiczba){
        return Integer.toString(pierwLiczba + drugaLiczba);
	}
	
	@GET
	@Path("/odejmij")
	public String odejmij(@QueryParam("pierwLiczba") int pierwLiczba, @QueryParam("drugaLiczba") int drugaLiczba){
        return Integer.toString(pierwLiczba - drugaLiczba);
	}
	
	@GET
	@Path("/pomnoz")
	public String pomnoz(@QueryParam("pierwLiczba") int pierwLiczba, @QueryParam("drugaLiczba") int drugaLiczba){
        return Integer.toString(pierwLiczba * drugaLiczba);
	}
	
	@GET
	@Path("/podziel")
	public String podziel(@QueryParam("pierwLiczba") int pierwLiczba, @QueryParam("drugaLiczba") int drugaLiczba){
        return Integer.toString(pierwLiczba / drugaLiczba);
	}
}
