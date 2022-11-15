package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="cajas")
public class Caja {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "num_referencia")
	private String num_referencia;
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "valor")
	private int valor;
	
	@ManyToOne
    @JoinColumn(name="codigo_almacen")
    private Almacen almacen;
	
	public Caja() {
		
	}

	/**
	 * @param num_referencia
	 * @param contenido
	 * @param valor
	 * @param codigo_almacen
	 */
	public Caja(String num_referencia, String contenido, int valor, Almacen almacen) {
		//super();
		this.num_referencia = num_referencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	
	//Getters y Setters
	
	/**
	 * @return num_referencia
	 */
	public String num_referencia() {
		return num_referencia;
	}

	/**
	 * @param num_referencia
	 */
	public void setId(String num_referencia) {
		this.num_referencia = num_referencia;
	}

	/**
	 * @return contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	/**
	 * @return valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	/**
	 * @return almacen
	 */
	public Almacen getAlmacen() {
		return almacen;
	}

	/**
	 * @param almacen
	 */
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Caja [num_referencia=" + num_referencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacen + "]";
	}
}
