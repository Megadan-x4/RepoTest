package com.megadanx4.anidamiento.dto;

import java.util.Map;

public class CheckListDTO {
	private String tipoDoc;
	private Map<String, NaturalezaDTO> naturalezas;
	
	public CheckListDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CheckListDTO(String tipoDoc, Map<String, NaturalezaDTO> naturalezas) {
		super();
		this.tipoDoc = tipoDoc;
		this.naturalezas = naturalezas;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public Map<String, NaturalezaDTO> getNaturalezas() {
		return naturalezas;
	}
	public void setNaturalezas(Map<String, NaturalezaDTO> naturalezas) {
		this.naturalezas = naturalezas;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + " {\n\ttipoDoc: " + tipoDoc + 
				"\n\tnaturalezas: \n" + 
				naturalezas + "\n}";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naturalezas == null) ? 0 : naturalezas.hashCode());
		result = prime * result + ((tipoDoc == null) ? 0 : tipoDoc.hashCode());
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
		CheckListDTO other = (CheckListDTO) obj;
		if (naturalezas == null) {
			if (other.naturalezas != null)
				return false;
		} else if (!naturalezas.equals(other.naturalezas))
			return false;
		if (tipoDoc == null) {
			if (other.tipoDoc != null)
				return false;
		} else if (!tipoDoc.equals(other.tipoDoc))
			return false;
		return true;
	}
}
