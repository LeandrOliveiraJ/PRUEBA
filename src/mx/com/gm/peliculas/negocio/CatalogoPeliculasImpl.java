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
        
        if (acceso.existe(nombreArchivo)==true){
            List<Pelicula> peliculas = acceso.listar(nombreArchivo);
            
            for(Pelicula pelicula : peliculas){
                System.out.println(pelicula);
            }
        }else{
            System.out.println("No Hay Lista");}
     }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        
        String buscado = null;
        buscado = datos.buscar(nombreArchivo, buscar);
        
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        
        if (acceso.existe(nombreArchivo)==true){
            System.out.println("El archivo Existe");
            
        }else{
            acceso.crear(nombreArchivo);
            
        }
    }
    @Override
    public void borrarArchivo(String nombreArchivo) {
        
        if (acceso.existe(nombreArchivo)==true){
            acceso.borrar(nombreArchivo);
            System.out.println("El archivo Se ha borrado con exito");
            
        }else{
            System.out.println("No se ha podido borrar el archivo");
        }
    }
    
}
