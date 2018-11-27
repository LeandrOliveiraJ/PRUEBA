/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.negocio;

/**
 *
 * @author Bulgaro
 */
public interface CatalogoPeliculas {
    
    public abstract void agregarPelicula(String nombrePelicula, String nombreArchivo);
    public abstract void listarPeliculas(String nombreArchivo);
    public abstract void buscarPelicula(String nombreArchivo, String buscar);
    public abstract void iniciarArchivo(String nombreArchivo);
}
