package com.ipartek.formacion.incidencias.repositorio;

import java.util.List;

public interface CrudAble<P> {

	boolean insert(P pojo);
	List<P> getAll();
	P getById(int id);
	boolean update(P pojo);
	boolean delete(int id);

}
