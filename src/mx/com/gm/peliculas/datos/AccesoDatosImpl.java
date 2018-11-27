package mx.com.gm.peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.domain.Pelicula;


/**
 *
 * @author Bulgaro
 */
public class AccesoDatosImpl implements AccesoDatos {
    AccesoDatos datos;
    Pelicula pelicula = new Pelicula();


    @Override
    public boolean existe(String nombreArchivo){
         
        File archivo = new File(nombreArchivo);
            boolean resp;
            if (archivo.exists()){
                resp = true;
            }else{
                resp = false;
            }
        return resp;
    }
    
    
    @Override
    public void crear(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            
            PrintWriter salida = null;
            
            salida = new PrintWriter(new FileWriter(archivo)); //el FileWriter crea el archivo en memoria
            System.out.println("El archivo se ha creado");
            salida.close();
        } catch (IOException ex) {
            Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }

    @Override
    public List<Pelicula> listar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
                
                File archivo = new File(pelicula, nombreArchivo, true);
                PrintWriter salida = null;
        try {
            salida = new PrintWriter(new FileWriter(archivo));
        } catch (IOException ex) {
            Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
                String contenido="contenido archivo+++ ";
                salida.println(contenido);
                salida.println();
                salida.println("fin de la escritura");
                salida.close();
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrar(String nombreArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }
 