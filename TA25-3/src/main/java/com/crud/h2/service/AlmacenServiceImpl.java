package com.crud.h2.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IAlmacenDAO;
import com.crud.h2.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService {
	@Autowired
	IAlmacenDAO iAlmacenDAO;
	
	@Override
	public List<Almacen> listarAlmacenes() {
		
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXID(Long codigo_almacen) {
		
		return iAlmacenDAO.findById(codigo_almacen).get();
	}
	

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long codigo_almacen) {
		
		iAlmacenDAO.deleteById(codigo_almacen);
		
	}
}
