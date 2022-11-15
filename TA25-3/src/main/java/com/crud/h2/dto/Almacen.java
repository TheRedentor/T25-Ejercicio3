package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="almacenes")
public class Almacen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo_almacen;
	@Column(name = "lugar")
	private String lugar;
	@Column(name = "capacidad")
	private int capacidad;
	
	@OneToMany
    @JoinColumn(name="codigo_almacen")
    private List<Caja> caja;
	
	public Almacen() {
		
	}

	/**
	 * @param codigo_almacen
	 * @param lugar
	 * @param capacidad
	 */
	public Almacen(Long codigo_almacen, String lugar, int capacidad) {
		//super();
		this.codigo_almacen = codigo_almacen;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	
	//Getters y Setters
	
	/**
	 * @return codigo_almacen
	 */
	public Long getId() {
		return codigo_almacen;
	}

	/**
	 * @param codigo_almacen
	 */
	public void setId(Long codigo_almacen) {
		this.codigo_almacen = codigo_almacen;
	}

	/**
	 * @return lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	/**
	 * @return capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param presupuesto
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Almacen [codigo_almacen=" + codigo_almacen + ", lugar=" + lugar + ", capacidad=" + capacidad + "]";
	}
}
