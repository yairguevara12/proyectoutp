
package segundaparteproy;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class ColaRegistro {
    //Colas: 
    protected  LinkedList<RegistroPelicula> registroPeli = new LinkedList<>();
     protected  LinkedList<RegistroCliente> registroClientes = new LinkedList<>();
     protected  LinkedList<ClienteEspera> clienteEspera = new LinkedList<>();
     
    //instanciamos 
    RegistroPelicula registroPelicula = new RegistroPelicula();
    
    //Cuando usas colas usas enqueue
    
    //agregar:
    public void enqueuePelicula(RegistroPelicula p) {
        registroPeli.add(p);
    }
    
    public void enqueueCliente(RegistroCliente c) {
        registroClientes.add(c);
    }
    public void enqueueClienteEspera(ClienteEspera cp) {
        clienteEspera.add(cp);
    }
    
    //Listas
    //RegistroPelicula
    public void listElements() {
        int i = 0;
        for (RegistroPelicula colaElement : registroPeli) {
            System.out.println("[" + i + "] => " + colaElement);
            i++;
        }
    }
    //lista de RegistroCliente
    public void listElementsC() {
        int i = 0;
        for (RegistroCliente colaElement : registroClientes) {
            System.out.println("[" + i + "] => " + colaElement);
            i++;
        }
    }
    //lista de ClienteEspera
    public void listElementsEspera() {
        int i = 0;
        for (ClienteEspera colaElement : clienteEspera) {
            System.out.println("[" + i + "] => " + colaElement);
            i++;
        }
    }
    
    //Retorna los elementos:
    
    public LinkedList<RegistroPelicula> returnListElementsPelicula() {
        /*int i =0;
        String elementsToPrint = "";
        for(Pelicula colaElement : registroPeli){
           elementsToPrint += "[" +i +"] => "+ colaElement.getCodigo()+ " "
                            + colaElement.getNombre() + " "
                            + colaElement.getAño()+ " "
                            + colaElement.getClasificacion() + " "
                            + colaElement.getDuracion()+ " "
                            + colaElement.getResolucion()+" '\n";
           i++;
            System.out.println(elementsToPrint);
       }*/
        return registroPeli;
    }
    public LinkedList<RegistroCliente> returnListElementsCliente() {
        /*int i =0;
        String elementsToPrint = "";
        for(Pelicula colaElement : registroPeli){
           elementsToPrint += "[" +i +"] => "+ colaElement.getCodigo()+ " "
                            + colaElement.getNombre() + " "
                            + colaElement.getAño()+ " "
                            + colaElement.getClasificacion() + " "
                            + colaElement.getDuracion()+ " "
                            + colaElement.getResolucion()+" '\n";
           i++;
            System.out.println(elementsToPrint);
       }*/
        return registroClientes;
    }
     public LinkedList<ClienteEspera> returnListElementsClienteEspera() {
        /*int i =0;
        String elementsToPrint = "";
        for(Pelicula colaElement : registroPeli){
           elementsToPrint += "[" +i +"] => "+ colaElement.getCodigo()+ " "
                            + colaElement.getNombre() + " "
                            + colaElement.getAño()+ " "
                            + colaElement.getClasificacion() + " "
                            + colaElement.getDuracion()+ " "
                            + colaElement.getResolucion()+" '\n";
           i++;
            System.out.println(elementsToPrint);
       }*/
        return clienteEspera;
    }
}
