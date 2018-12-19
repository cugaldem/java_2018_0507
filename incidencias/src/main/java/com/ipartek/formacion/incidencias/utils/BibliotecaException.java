package com.ipartek.formacion.incidencias.utils;

public class BibliotecaException extends RuntimeException{
	private static final long serialVersionUID = -6529259702715693882L;

	public BibliotecaException() {
	}

	public BibliotecaException(String message) {
		super(message);
	}

	public BibliotecaException(Throwable cause) {
		super(cause);
	}

	public BibliotecaException(String message, Throwable cause) {
		super(message, cause);
	}

	public BibliotecaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
