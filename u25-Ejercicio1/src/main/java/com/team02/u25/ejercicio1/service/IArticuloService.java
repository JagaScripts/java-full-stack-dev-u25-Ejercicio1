/**
 * u25-Ejercicio1 - com.team02.u25.ejercicio1.servicio - IArticuloServicio
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 16/05/2022
 */
package com.team02.u25.ejercicio1.service;

import java.util.List;

import com.team02.u25.ejercicio1.dto.Articulo;

/**
 * IArticuloServicio.java
 *
 */
public interface IArticuloService {

	//Metodos del CRUD
		public List<Articulo> listarArticulos(); //Listar All 
		
		public Articulo guardarArticulo(Articulo articulo);	//Guarda un articulo CREATE
		
		public Articulo articuloXID(int codigo); //Leer datos de un articulo READ
		
		public Articulo actualizarArticulo(Articulo articulo); //Actualiza datos del articulo UPDATE
		
		public void eliminarArticulo(int codigo);// Elimina el articulo DELETE
	
}
