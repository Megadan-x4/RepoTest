package com.megadanx4.anidamiento.dto;

public class CheckedRow {
		
		private String idNaturaleza;
		private String idCriterio;
		private String idTipificacion;
		private boolean seleccionado;
		
		
		
		public CheckedRow() {
			super();
			//TODO implementar constructor
		}
		public CheckedRow(String idNaturaleza, String idCriterio, String idTipificacion, boolean seleccionado) {
			super();
			this.idNaturaleza = idNaturaleza;
			this.idCriterio = idCriterio;
			this.idTipificacion = idTipificacion;
			this.seleccionado = seleccionado;
		}
		public String getIdNaturaleza() {
			return idNaturaleza;
		}
		public void setIdNaturaleza(String idNaturaleza) {
			this.idNaturaleza = idNaturaleza;
		}
		public String getIdCriterio() {
			return idCriterio;
		}
		public void setIdCriterio(String idCriterio) {
			this.idCriterio = idCriterio;
		}
		public String getIdTipificacion() {
			return idTipificacion;
		}
		public void setIdTipificacion(String idTipificacion) {
			this.idTipificacion = idTipificacion;
		}
		public boolean isSeleccionado() {
			return seleccionado;
		}
		public void setSeleccionado(boolean seleccionado) {
			this.seleccionado = seleccionado;
		}
		@Override
		public String toString() {
			return getClass().getName() + " {\n\tidNaturaleza: " + idNaturaleza + "\n\tidCriterio: " + idCriterio
					+ "\n\tidTipificacion: " + idTipificacion + "\n\tseleccionado: " + seleccionado + "\n}";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((idCriterio == null) ? 0 : idCriterio.hashCode());
			result = prime * result + ((idNaturaleza == null) ? 0 : idNaturaleza.hashCode());
			result = prime * result + ((idTipificacion == null) ? 0 : idTipificacion.hashCode());
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
			CheckedRow other = (CheckedRow) obj;
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
			if (seleccionado != other.seleccionado)
				return false;
			return true;
		}
		
}
