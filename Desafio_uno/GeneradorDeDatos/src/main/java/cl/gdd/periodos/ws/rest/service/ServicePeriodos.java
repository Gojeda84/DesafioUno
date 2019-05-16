package cl.gdd.periodos.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cl.gdd.periodos.ws.rest.vo.VOGeneradorDeDatos;

@Path("/Previred")
public class ServicePeriodos {

	@POST
	@Path("/validaPeriodos")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOGeneradorDeDatos validaPeriodos(VOGeneradorDeDatos gdd) {
		System.out.println("Hola mundo!!");
		gdd.setValidaGDD(false);
		System.out.println("Fecha de creación: "+gdd.getFechaCreacion()+"\nFecha de término: "+gdd.getFechaFin());
		gdd.setValidaGDD(true);
		
		return gdd;
	}
	
}
