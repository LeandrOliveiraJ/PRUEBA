package mx.com.gm.peliculas.datos;

import java.util.ArrayList;
import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;



public interface AccesoDatos {
    public abstract boolean existe(String nombreArchivo);
    public abstract List<Pelicula> listar(String nombre);
    public abstract void escribir(Pelicula pelicula,String nombreArchivo,boolean anexar);
    public abstract String buscar(String nombreArchivo,String buscar);
    public abstract void crear (String nombreArchivo);
    public abstract void borrar(String nombreArchivo);
}
