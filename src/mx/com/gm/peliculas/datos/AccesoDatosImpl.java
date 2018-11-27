package mx.com.gm.peliculas.datos;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.domain.Pelicula;


/**
 *
 * @author Bulgaro
 */
public class AccesoDatosImpl implements AccesoDatos {
    
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
        //
        List<Pelicula> lista = new ArrayList<>();
          File archivo = new File(nombre);
        if (archivo.exists()) {
            BufferedReader entrada = null;
            try {
                entrada = new BufferedReader(new FileReader(archivo));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            String lectura = null;
            try {
                lectura = entrada.readLine();
            } catch (IOException ex) {
                Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            while (lectura != null) {
                System.out.println("Pelicula: " + lectura);
                try {
                    lectura = entrada.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
                
                File archivo = new File(nombreArchivo);
                
                PrintWriter salida = null;
        try {
            salida = new PrintWriter (new FileWriter(nombreArchivo, anexar));
        } catch (IOException ex) {
            Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
                String contenido = pelicula.getNombre();
                salida.println("Pelicula............. " + contenido);
                salida.println();
                salida.println("----------------------------------");
                salida.close();
                System.out.println("se ha anexado la informacion correctamente");
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        archivo.delete();
        System.out.println("Archivo Borrado");
    }
        
    }
 