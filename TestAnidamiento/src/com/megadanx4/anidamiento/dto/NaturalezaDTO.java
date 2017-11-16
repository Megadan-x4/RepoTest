package com.megadanx4.anidamiento.dto;

import java.util.Map;

public class NaturalezaDTO {
	
	private String id;
	private String descripcion;
	private Map<String, CriterioDTO> criterios;
	public NaturalezaDTO(String id, String descripcion, Map<String, CriterioDTO> criterios) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.criterios = criterios;
	}
	public NaturalezaDTO() {
		super();
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
	public Map<String, CriterioDTO> getCriterios() {
		return criterios;
	}
	public void setCriterios(Map<String, CriterioDTO> criterios) {
		this.criterios = criterios;
	}
	
	
	@Override
	public String toString() {
		return "\t" + getClass().getSimpleName() + " {\n\t\tid: " + id + "\n\t\tdescripcion: " + descripcion + "\n\t\tcriterios: \n"
				+ criterios + "\n}";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((criterios == null) ? 0 : criterios.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		NaturalezaDTO other = (NaturalezaDTO) obj;
		if (criterios == null) {
			if (other.criterios != null)
				return false;
		} else if (!criterios.equals(other.criterios))
			return false;
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
		return true;
	}
}
