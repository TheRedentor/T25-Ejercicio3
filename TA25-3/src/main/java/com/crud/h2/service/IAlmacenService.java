package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Almacen;

public interface IAlmacenService {
	
	public List<Almacen> listarAlmacenes();
	
	public Almacen guardarAlmacen(Almacen almacen);
	
	public Almacen almacenXID(Long codigo_almacen);
	
	public Almacen actualizarAlmacen(Almacen almacen);
	
	public void eliminarAlmacen(Long codigo_almacen);
	
}
