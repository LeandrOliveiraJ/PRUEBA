/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.negocio;
import java.util.ArrayList;
import java.util.List;
import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.domain.Pelicula;
/**
 *
 * @author Bulgaro
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas {
    AccesoDatosImpl acceso = new AccesoDatosImpl();
    AccesoDatos datos;
    
    
    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        if (acceso.existe(nombreArchivo)==true){
            Pelicula pelicula = new Pelicula(nombrePelicula);
            acceso.escribir(pelicula, nombreArchivo, true);
            
        }else{
            acceso.crear(nombreArchivo);
            Pelicula pelicula = new Pelicula(nombrePelicula);
            acceso.escribir(pelicula, nombreArchivo, true);
        }
        
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        //listar Pelicula
        List<Pelicula> lista = new ArrayList<>();
        if (acceso.existe(nombreArchivo)==true){
            acceso.listar(nombreArchivo);
        }else{
            System.out.println("No Hay Lista");}
     }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        if (acceso.existe(nombreArchivo)== true){
            String resp = acceso.buscar(nombreArchivo, buscar);
            System.out.println(resp);
        }
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        
        if (acceso.existe(nombreArchivo)==true){
            System.out.println("El archivo Existe");
            
        }else{
            acceso.crear(nombreArchivo);
            
        }
    }
    
}
