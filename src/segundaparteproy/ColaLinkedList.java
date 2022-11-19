/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundaparteproy;

import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class ColaLinkedList {
   // protected LinkedList<String> elementos = new LinkedList<>();
    //pilas:
    protected  Deque <Pelicula> elementos = new LinkedList<>();
    //instanciamos
    Pelicula colaPelicula = new Pelicula();
    /*protected int size;
    protected int start;
    protected int end;*/
    
    //funcion deque
    public void deque(Pelicula p){
        /*this.colaPelicula.setCodigo(codigo);
        this.colaPelicula.setNombre(nombre);
        this.colaPelicula.setAño(año);
        this.colaPelicula.setClasificacion(clasificacion);
        this.colaPelicula.setDuracion(duracion);
        this.colaPelicula.setResolucion(resolucion);*/
        //agrega
        elementos.push(p);
    }
    
    /*public void dequeue(int codigo){
        if(elementos.isEmpty()){
            System.out.println("La cola se encuentra vacia");
        } else {
            if (elementos.size() >=0 && codigo < elementos.size()){
                elementos.remove(codigo);
            } else {
                System.out.println("El elemento se encuentra fuera de la cola");
            }
        }
        
    }*/
    //funcion eliminar
    public void dequeue(Pelicula p){
       //elimina
     elementos.remove(p);
               
    }
    
    public void listElements(){
        int i =0;
        for(Pelicula colaElement : elementos){
           System.out.println("[" + i +"] => " + colaElement);
           i++;
       }
    }
    
    //retorne los valores que hay en Pelicula
    public Deque<Pelicula> returnListElements(){
        /*int i =0;
        String elementsToPrint = "";
        for(Pelicula colaElement : elementos){
           elementsToPrint += "[" +i +"] => "+ colaElement.getCodigo()+ " "
                            + colaElement.getNombre() + " "
                            + colaElement.getAño()+ " "
                            + colaElement.getClasificacion() + " "
                            + colaElement.getDuracion()+ " "
                            + colaElement.getResolucion()+" '\n";
           i++;
            System.out.println(elementsToPrint);
       }*/
       return elementos;
    } 
}
