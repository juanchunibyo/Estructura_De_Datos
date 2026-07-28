package estructura_de_datos;

import java.util.ArrayList;
import java.util.List;

public class Dinamico {
    public List<Cliente_modelo> obj_lista_clientes;

    public Dinamico() {
        this.obj_lista_clientes = new ArrayList<>();
    }

    public void ver_info() {
        System.out.println("Contenido de la lista dinámica:");
        for (Cliente_modelo cliente : this.obj_lista_clientes) {
            cliente.ver_datos();
        }
    }

    public void add(Cliente_modelo elemento) {
        this.obj_lista_clientes.add(elemento);
    }

    public void add(int indice, Cliente_modelo elemento) {
        this.obj_lista_clientes.add(indice, elemento);
    }

    public Cliente_modelo get(int indice) {
        return this.obj_lista_clientes.get(indice);
    }

    public void set(int indice, Cliente_modelo elemento) {
        this.obj_lista_clientes.set(indice, elemento);
    }

    public Cliente_modelo remove(int indice) {
        return this.obj_lista_clientes.remove(indice);
    }

    public boolean remove(Cliente_modelo elemento) {
        return this.obj_lista_clientes.remove(elemento);
    }

    public int size() {
        return this.obj_lista_clientes.size();
    }

    public boolean isEmpty() {
        return this.obj_lista_clientes.isEmpty();
    }

    public boolean contains(Cliente_modelo elemento) {
        return this.obj_lista_clientes.contains(elemento);
    }

    public int indexOf(Cliente_modelo elemento) {
        return this.obj_lista_clientes.indexOf(elemento);
    }

    public void clear() {
        this.obj_lista_clientes.clear();
    }

    public Cliente_modelo[] toArray() {
        return this.obj_lista_clientes.toArray(new Cliente_modelo[0]);
    }

    public void agregar_cliente(Cliente_modelo cliente) {
        this.add(cliente);
    }

    public static void main(String[] args) {
        Dinamico listaDinamica = new Dinamico();
        Cliente_modelo cliente1 = new Cliente_modelo("Ana", "1010");
        Cliente_modelo cliente2 = new Cliente_modelo("Luis", "2020");
        Cliente_modelo cliente3 = new Cliente_modelo("Sofía", "3030");

        listaDinamica.add(cliente1);
        listaDinamica.add(0, cliente2);
        listaDinamica.add(cliente3);

        System.out.println("=== Lista dinámica ===");
        listaDinamica.ver_info();

        System.out.println("Tamaño: " + listaDinamica.size());
        System.out.println("Cliente en la posición 1: " + listaDinamica.get(1));
        listaDinamica.set(1, new Cliente_modelo("Carlos", "4040"));
        System.out.println("Contiene a Carlos: " + listaDinamica.contains(new Cliente_modelo("Carlos", "4040")));
        listaDinamica.remove(0);
        System.out.println("Índice de Carlos: " + listaDinamica.indexOf(new Cliente_modelo("Carlos", "4040")));
        listaDinamica.clear();
        System.out.println("¿Está vacía la lista dinámica? " + listaDinamica.isEmpty());
    }
}