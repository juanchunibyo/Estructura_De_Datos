package estructura_de_datos;

public class ArreglosGeneral {

    // Metodos de la clase
    public static void crearArreglo_estatico() {
        // Inicializa o prepara el arreglo estatico (usando la clase Estatico)
        Estatico.lista_nombre = new String[]{"Cliente 1", "Cliente 2", "Cliente 3"};
    }

    public static void ImprimirArreglo_estatico() {
        // Imprime el contenido del arreglo estatico
        Estatico.imprimir_datos();
    }

    public static void main(String[] args) {
        // Todo codigo que se va a ejecutar
        crearArreglo_estatico();
        ImprimirArreglo_estatico();
    }
}