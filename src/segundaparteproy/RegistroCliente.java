
package segundaparteproy;

public class RegistroCliente {

    String cliente;
    int dni;
    String pelicula;
    
    public RegistroCliente(String nombre, int dni, String pelicula) {
        this.cliente = nombre;
        this.dni = dni;
        this.pelicula = pelicula;
    }

    public RegistroCliente() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    
    
   
}
