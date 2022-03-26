package com.educacion.interfaces;

import java.util.List;

// inyeccion de dependencias
public interface DAO<K, E> {

	E buscarPorID(K k);

	Boolean eliminar(E e);

	Boolean actualizar(E e);

	Boolean insertar(E e);

	List<E> listar();

}
