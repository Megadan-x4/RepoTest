package com.megadanx4.anidamiento.dto;

import java.util.Map;

public class CriterioDTO {
	
	private String id;
	private String descripcion;
	private Map<String, TipificacionDTO> tipificaciones;
	
	public CriterioDTO(String id, String descripcion, Map<String, TipificacionDTO> tipificaciones) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.tipificaciones = tipificaciones;
	}
	public CriterioDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Map<String, TipificacionDTO> getTipificaciones() {
		return tipificaciones;
	}
	public void setTipificaciones(Map<String, TipificacionDTO> tipificaciones) {
		this.tipificaciones = tipificaciones;
	}
	
	@Override
	public String toString() {
		return "\t\t" + getClass().getName() + " {\n\t\t\tid: " + id + "\n\t\t\tdescripcion: " + descripcion + "\n\t\t\ttipificaciones: \n"
				+ tipificaciones + "\n}";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tipificaciones == null) ? 0 : tipificaciones.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CriterioDTO other = (CriterioDTO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tipificaciones == null) {
			if (other.tipificaciones != null)
				return false;
		} else if (!tipificaciones.equals(other.tipificaciones))
			return false;
		return true;
	}
	
	
	

}
