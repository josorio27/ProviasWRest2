package pe.edu.upc.service.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import pe.edu.upc.model.Solicitud;
import pe.edu.upc.model.Usuario;


@Path("/solicitud")
public class SolicitudService {
	
	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{dni}")
	public String getSolicitudes( @PathParam("dni") String dni ) throws ClassNotFoundException, SQLException{
	//public String getSolicitudes() throws ClassNotFoundException, SQLException{
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_provias","root","123456");
		
		PreparedStatement statement = connection.prepareStatement("select * from tb_solicitud where dni='"+ dni +"'");
		
		ResultSet result = statement.executeQuery();
				
		List<Solicitud> solicitudes = new ArrayList<Solicitud>();
				
		while(result.next()){
			
			Solicitud solicitud = new Solicitud();
			solicitud.setNroSolicitud(result.getString("nroSolicitud"));
			solicitud.setMatricula(result.getString("matricula"));
			solicitud.setEstado(result.getString("estado"));
			solicitud.setFechaSolicitud(result.getString("fechaSolicitud"));
			
			solicitudes.add(solicitud);
						
		}
		
		Gson gson = new Gson();
		
		String response = gson.toJson(solicitudes);		
		
		return response.toString();
	}

}
