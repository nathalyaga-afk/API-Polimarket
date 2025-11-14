package com.poli.market.entity;

import lombok.Data;

@Data
public class Cliente {
	
	private Integer idCliente;
    private String nombres;
    private String correo;
    private String celular;
    private Boolean potencial;
    
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Boolean getPotencial() {
		return potencial;
	}
	public void setPotencial(Boolean potencial) {
		this.potencial = potencial;
	}

}
