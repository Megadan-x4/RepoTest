package com.megadanx4.anidamiento.dto;

public class TipificacionDTO {
	
	private String id;
	private String descripcion;
	private boolean seleccionado;
	public TipificacionDTO(String id, String descripcion, boolean seleccionado) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.seleccionado = seleccionado;
	}
	

	public TipificacionDTO() {
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

	public boolean isSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(boolean seleccionado) {
		this.seleccionado = seleccionado;
	}

	

	@Override
	public String toString() {
		return "\t\t\t" + getClass().getName() + " {\n\t\t\t\tid: " + id + "\n\t\t\t\tdescripcion: " + descripcion + "\n\t\t\t\tseleccionado: "
				+ seleccionado + "\n}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (seleccionado ? 1231 : 1237);
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
		TipificacionDTO other = (TipificacionDTO) obj;
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
		if (seleccionado != other.seleccionado)
			return false;
		return true;
	}
}
