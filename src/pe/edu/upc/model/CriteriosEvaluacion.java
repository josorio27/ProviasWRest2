package pe.edu.upc.model;

import java.io.Serializable;

public class CriteriosEvaluacion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String altura;
	private String peso;
	private String longitud;
	
	
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

}
