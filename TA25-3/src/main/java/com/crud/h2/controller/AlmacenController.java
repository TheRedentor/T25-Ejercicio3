package com.crud.h2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Almacen;
import com.crud.h2.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {
	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes(){
		return almacenServiceImpl.listarAlmacenes();
	}
	
	
	@PostMapping("/almacenes")
	public Almacen salvarAlmacen(Almacen almacen) {
		
		return almacenServiceImpl.guardarAlmacen(almacen);
	}
	
	
	@GetMapping("/almacenes/{codigo_almacen}")
	public Almacen almacenXID(@PathVariable(name="codigo_almacen") Long codigo_almacen) {
		
		Almacen almacen_xid= new Almacen();
		
		almacen_xid=almacenServiceImpl.almacenXID(codigo_almacen);
		
		System.out.println("Almacen XID: "+almacen_xid);
		
		return almacen_xid;
	}
	
	@PutMapping("/almacenes/{codigo_almacen}")
	public Almacen actualizarAlmacen(@PathVariable(name="codigo_almacen")Long codigo_almacen,Almacen almacen) {
		
		Almacen almacen_seleccionado= new Almacen();
		Almacen almacen_actualizado= new Almacen();
		
		almacen_seleccionado= almacenServiceImpl.almacenXID(codigo_almacen);
		
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());
		
		almacen_actualizado = almacenServiceImpl.actualizarAlmacen(almacen_seleccionado);
		
		System.out.println("El almacen actualizado es: "+ almacen_actualizado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{codigo_almacen}")
	public void eliminarAlmacen(@PathVariable(name="codigo_almacen")Long codigo_almacen) {
		almacenServiceImpl.eliminarAlmacen(codigo_almacen);
	}
}
