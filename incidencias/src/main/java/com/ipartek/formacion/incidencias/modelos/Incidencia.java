	package com.ipartek.formacion.incidencias.modelos;

import java.util.Date;

public class Incidencia {
	private Long ID;
	private Date fecha;
	private String usuarioCreador;
	private String titulo;
	private String descripcion;
	private String equipo;
	private String usuarioAsignado;
	
	public Incidencia(Long iD, Date fecha, String usuarioCreador, String titulo, String descripcion, String equipo,
			String usuarioAsignado) {
		super();
		ID = iD;
		this.fecha = fecha;
		this.usuarioCreador = usuarioCreador;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.equipo = equipo;
		this.usuarioAsignado = usuarioAsignado;
	}
	public Incidencia(Date fecha, String usuarioCreador, String titulo, String descripcion, String equipo,
			String usuarioAsignado) {
		super();
		this.fecha = fecha;
		this.usuarioCreador = usuarioCreador;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.equipo = equipo;
		this.usuarioAsignado = usuarioAsignado;
	}
	public Incidencia() {
		super();
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getUsuarioCreador() {
		return usuarioCreador;
	}
	public void setUsuarioCreador(String usuarioCreador) {
		this.usuarioCreador = usuarioCreador;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getUsuarioAsignado() {
		return usuarioAsignado;
	}
	public void setUsuarioAsignado(String usuarioAsignado) {
		this.usuarioAsignado = usuarioAsignado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((equipo == null) ? 0 : equipo.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((usuarioAsignado == null) ? 0 : usuarioAsignado.hashCode());
		result = prime * result + ((usuarioCreador == null) ? 0 : usuarioCreador.hashCode());
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
		Incidencia other = (Incidencia) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (equipo == null) {
			if (other.equipo != null)
				return false;
		} else if (!equipo.equals(other.equipo))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (usuarioAsignado == null) {
			if (other.usuarioAsignado != null)
				return false;
		} else if (!usuarioAsignado.equals(other.usuarioAsignado))
			return false;
		if (usuarioCreador == null) {
			if (other.usuarioCreador != null)
				return false;
		} else if (!usuarioCreador.equals(other.usuarioCreador))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Incidencia [ID=" + ID + ", fecha=" + fecha + ", usuarioCreador=" + usuarioCreador + ", titulo=" + titulo
				+ ", descripcion=" + descripcion + ", equipo=" + equipo + ", usuarioAsignado=" + usuarioAsignado + "]";
	}
	
		
}
