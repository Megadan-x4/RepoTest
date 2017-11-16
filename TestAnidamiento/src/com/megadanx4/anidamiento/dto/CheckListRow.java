package com.megadanx4.anidamiento.dto;

public class CheckListRow {
	
	private String idNaturaleza;
	private String naturaleza;
	private String idCriterio;
	private String criterio;
	private String idTipificacion;
	private String tipificacion;
	
	public CheckListRow(String idNaturaleza, String naturaleza, String idCriterio, String criterio,
			String idTipificacion, String tipificacion) {
		super();
		this.idNaturaleza = idNaturaleza;
		this.naturaleza = naturaleza;
		this.idCriterio = idCriterio;
		this.criterio = criterio;
		this.idTipificacion = idTipificacion;
		this.tipificacion = tipificacion;
	}
	public CheckListRow() {
		super();
	}
	public String getIdNaturaleza() {
		return idNaturaleza;
	}
	public void setIdNaturaleza(String idNaturaleza) {
		this.idNaturaleza = idNaturaleza;
	}
	public String getNaturaleza() {
		return naturaleza;
	}
	public void setNaturaleza(String naturaleza) {
		this.naturaleza = naturaleza;
	}
	public String getIdCriterio() {
		return idCriterio;
	}
	public void setIdCriterio(String idCriterio) {
		this.idCriterio = idCriterio;
	}
	public String getCriterio() {
		return criterio;
	}
	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}
	public String getIdTipificacion() {
		return idTipificacion;
	}
	public void setIdTipificacion(String idTipificacion) {
		this.idTipificacion = idTipificacion;
	}
	public String getTipificacion() {
		return tipificacion;
	}
	public void setTipificacion(String tipificacion) {
		this.tipificacion = tipificacion;
	}
	@Override
	public String toString() {
		return getClass().getName() + " {\n\tidNaturaleza: " + idNaturaleza + "\n\tnaturaleza: " + naturaleza
				+ "\n\tidCriterio: " + idCriterio + "\n\tcriterio: " + criterio + "\n\tidTipificacion: "
				+ idTipificacion + "\n\ttipificacion: " + tipificacion + "\n}";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((criterio == null) ? 0 : criterio.hashCode());
		result = prime * result + ((idCriterio == null) ? 0 : idCriterio.hashCode());
		result = prime * result + ((idNaturaleza == null) ? 0 : idNaturaleza.hashCode());
		result = prime * result + ((idTipificacion == null) ? 0 : idTipificacion.hashCode());
		result = prime * result + ((naturaleza == null) ? 0 : naturaleza.hashCode());
		result = prime * result + ((tipificacion == null) ? 0 : tipificacion.hashCode());
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
		CheckListRow other = (CheckListRow) obj;
		if (criterio == null) {
			if (other.criterio != null)
				return false;
		} else if (!criterio.equals(other.criterio))
			return false;
		if (idCriterio == null) {
			if (other.idCriterio != null)
				return false;
		} else if (!idCriterio.equals(other.idCriterio))
			return false;
		if (idNaturaleza == null) {
			if (other.idNaturaleza != null)
				return false;
		} else if (!idNaturaleza.equals(other.idNaturaleza))
			return false;
		if (idTipificacion == null) {
			if (other.idTipificacion != null)
				return false;
		} else if (!idTipificacion.equals(other.idTipificacion))
			return false;
		if (naturaleza == null) {
			if (other.naturaleza != null)
				return false;
		} else if (!naturaleza.equals(other.naturaleza))
			return false;
		if (tipificacion == null) {
			if (other.tipificacion != null)
				return false;
		} else if (!tipificacion.equals(other.tipificacion))
			return false;
		return true;
	}
}
