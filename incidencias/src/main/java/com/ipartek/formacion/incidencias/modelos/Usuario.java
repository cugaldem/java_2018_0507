package com.ipartek.formacion.incidencias.modelos;

public class Usuario {
	private Long ID;
	private String email;
	private String password;
	private String equipo;
	public Usuario(Long iD, String email, String password, String equipo) {
		super();
		ID = iD;
		this.email = email;
		this.password = password;
		this.equipo = equipo;
	}
	public Usuario(String email, String password, String equipo) {
		super();
		this.email = email;
		this.password = password;
		this.equipo = equipo;
	}
	
	public Usuario(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Usuario() {
		super();
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((equipo == null) ? 0 : equipo.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Usuario other = (Usuario) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (equipo == null) {
			if (other.equipo != null)
				return false;
		} else if (!equipo.equals(other.equipo))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuario [ID=" + ID + ", email=" + email + ", password=" + password + ", equipo=" + equipo + "]";
	}
	
	
	
}
