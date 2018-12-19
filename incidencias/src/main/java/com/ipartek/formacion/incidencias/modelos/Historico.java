package com.ipartek.formacion.incidencias.modelos;

import java.util.Date;

public class Historico {
	private Long ID;
	private String incidencia;
	private String usuario;
	private Date fecha;
	private String comentario;
	private String estado;
	public Historico(Long iD, String incidencia, String usuario, Date fecha, String comentario, String estado) {
		super();
		ID = iD;
		this.incidencia = incidencia;
		this.usuario = usuario;
		this.fecha = fecha;
		this.comentario = comentario;
		this.estado = estado;
	}
	public Historico(String incidencia, String usuario, Date fecha, String comentario, String estado) {
		super();
		this.incidencia = incidencia;
		this.usuario = usuario;
		this.fecha = fecha;
		this.comentario = comentario;
		this.estado = estado;
	}
	public Historico() {
		super();
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getIncidencia() {
		return incidencia;
	}
	public void setIncidencia(String incidencia) {
		this.incidencia = incidencia;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((incidencia == null) ? 0 : incidencia.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Historico other = (Historico) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (incidencia == null) {
			if (other.incidencia != null)
				return false;
		} else if (!incidencia.equals(other.incidencia))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Historico [ID=" + ID + ", incidencia=" + incidencia + ", usuario=" + usuario + ", fecha=" + fecha
				+ ", comentario=" + comentario + ", estado=" + estado + "]";
	}
	
	
	
}
