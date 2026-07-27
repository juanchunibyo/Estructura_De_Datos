package estructura_de_datos;
import java.util.ArrayList;
import java.util.List;

//crear el constructor
 
public class Dinamico {
    public List<Cliente_modelo> obj_lista_clientes;
    String[] lista_nombres;
    
    public Dinamico(){
        lista_nombres = new String[3];
        this.obj_lista_clientes = new ArrayList<>();
    }
    public void ver_info(){
        for(Cliente_modelo cliente: this.obj_lista_clientes){
            cliente.ver_datos();
        }
    }
    public void agregar_cliente(Cliente_modelo cliente){
        this.obj_lista_clientes.add(cliente);
    }
}