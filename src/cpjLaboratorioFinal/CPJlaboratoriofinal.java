/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpjLaboratorioFinal;

import java.util.Scanner;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;

            
public class CPJlaboratoriofinal {
    
        public static Scanner entrada = new Scanner(System.in);
        private static final String NOMBRE_ARCHIVO = "C:\\Users\\Bulgaro\\Desktop\\Funadamentos Java\\laboratorioFinal\\laboratorioFinal\\catalogoPeliculas\\catalogoPeliculas.txt";
        public static int opcion;
        Pelicula pelicula;
        
        public static void main(String[] args) {
            CatalogoPeliculasImpl catalogo = new CatalogoPeliculasImpl();
            
            do{
                System.out.println("---------------MENU-------------------------");
                System.out.println("1.-Iniciar Catalogo peliculas");
                System.out.println("2.-Agregar Pelicula");
                System.out.println("3.-Listar Peliculas");
                System.out.println("4.-Buscar Pelicula");
                System.out.println("0.-Salir");
                System.out.println("Elija Opcion");
            
            
                opcion = entrada.nextInt();
                switch(opcion){
                case 1:
                    System.out.println("1.-Iniciar Catalogo De peliculas");
                    catalogo.iniciarArchivo(NOMBRE_ARCHIVO);
                break;
                case 2:
                    System.out.println("2.-Agregar Palicula");
                    String nombre = entrada.next();
                    Pelicula pelicula = new Pelicula(nombre);
                    catalogo.agregarPelicula(nombre, NOMBRE_ARCHIVO);
                break;
                case 3:
                    System.out.println("3.-Listar Peliculas");
                    String nombre = entrada.next();
                    Pelicula pelicula = new Pelicula(nombre);
                    catalogo.listarPeliculas(NOMBRE_ARCHIVO);
                    
                break;
                case 4:
                    System.out.println("4.-Buscar pelicula");
                    
                break;
                case 0:
                    System.out.println("0.-Salir");
                default:
                    System.out.println("Opcion no Valida");
                break;
                }
            }while(opcion!=0);
            }
        }

