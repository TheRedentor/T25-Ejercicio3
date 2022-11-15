package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Caja;

public interface ICajaService {
	
	public List<Caja> listarCajas();
	
	public Caja guardarCaja(Caja caja);
	
	public Caja cajaXID(String num_referencia);
	
	public Caja actualizarCaja(Caja caja);
	
	public void eliminarCaja(String num_referencia);
	
}
