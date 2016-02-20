package pe.edu.upc.model;

import java.io.Serializable;

public class EstadoCivil implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String descripcion;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
