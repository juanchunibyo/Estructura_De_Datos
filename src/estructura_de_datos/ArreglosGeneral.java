package estructura_de_datos;

public class ArreglosGeneral {

    public static void main(String[] args) {
        System.out.println("=== Uso de estructura estática ===");
        Estatico.inicializar();
        Estatico.add("Ana");
        Estatico.add(1, "Luis");
        Estatico.add("Sofía");
        Estatico.imprimir_datos();

        System.out.println("Tamaño actual: " + Estatico.size());
        System.out.println("Elemento en la posición 1: " + Estatico.get(1));
        Estatico.set(1, "Carlos");
        System.out.println("Buscar 'Carlos': " + Estatico.contains("Carlos"));
        Estatico.remove("Ana");
        System.out.println("Índice de 'Carlos': " + Estatico.indexOf("Carlos"));
        Estatico.clear();
        System.out.println("¿Está vacía? " + Estatico.isEmpty());

        System.out.println("\n=== Uso de estructura dinámica ===");
        Dinamico listaDinamica = new Dinamico();
        Cliente_modelo cliente1 = new Cliente_modelo("Ana", "1010");
        Cliente_modelo cliente2 = new Cliente_modelo("Luis", "2020");
        Cliente_modelo cliente3 = new Cliente_modelo("Sofía", "3030");

        listaDinamica.add(cliente1);
        listaDinamica.add(0, cliente2);
        listaDinamica.add(cliente3);
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