
package segundaparteproy;

import java.util.LinkedList;


public class Pelicula  implements Comparable<Pelicula>{

    int codigo;
    String nombre;
    int año;
    String clasificacion;
    String duracion;
    String resolucion;
    String imagen;
    
   
    
    public Pelicula(int codigo, String nombre, int año, String clasificacion, String duracion, String resolucion, String imagen) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.año = año;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
        this.resolucion = resolucion;
        this.imagen = imagen;
    }

    public Pelicula() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    @Override
    public int compareTo(Pelicula comparePelicula) {
        int compareCodigo = ((Pelicula)comparePelicula). getCodigo();
        return this.codigo-compareCodigo; 
    }
}
