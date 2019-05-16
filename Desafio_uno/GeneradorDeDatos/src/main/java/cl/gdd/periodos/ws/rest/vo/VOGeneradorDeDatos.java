package cl.gdd.periodos.ws.rest.vo;

import java.util.Date;

public class VOGeneradorDeDatos {
	
	private int id;
	private Date fechaCreacion;
	private Date fechaFin;
	private String[] fechas;
	private boolean validaGDD;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	public String[] getFechas() {
		return fechas;
	}
	public void setFechas(String[] fechas) {
		this.fechas = fechas;
	}
	
	
	public boolean isValidaGDD() {
		return validaGDD;
	}
	public void setValidaGDD(boolean validaGDD) {
		this.validaGDD = validaGDD;
	}

}
