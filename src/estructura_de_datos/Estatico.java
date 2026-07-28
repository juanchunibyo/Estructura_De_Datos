package estructura_de_datos;

public class Estatico {

    public static String[] lista_nombre = new String[3];
    private static int tamaño = 0;

    public Estatico() {
        inicializar();
    }

    public static void inicializar() {
        lista_nombre = new String[3];
        tamaño = 0;
    }

    public static void add(String elemento) {
        if (tamaño == lista_nombre.length) {
            agrandarArreglo();
        }
        lista_nombre[tamaño] = elemento;
        tamaño++;
    }

    public static void add(int indice, String elemento) {
        if (indice < 0 || indice > tamaño) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        if (tamaño == lista_nombre.length) {
            agrandarArreglo();
        }
        for (int i = tamaño; i > indice; i--) {
            lista_nombre[i] = lista_nombre[i - 1];
        }
        lista_nombre[indice] = elemento;
        tamaño++;
    }

    public static String get(int indice) {
        validarIndice(indice);
        return lista_nombre[indice];
    }

    public static void set(int indice, String elemento) {
        validarIndice(indice);
        lista_nombre[indice] = elemento;
    }

    public static String remove(int indice) {
        validarIndice(indice);
        String elemento = lista_nombre[indice];
        for (int i = indice; i < tamaño - 1; i++) {
            lista_nombre[i] = lista_nombre[i + 1];
        }
        lista_nombre[tamaño - 1] = null;
        tamaño--;
        return elemento;
    }

    public static boolean remove(String elemento) {
        int indice = indexOf(elemento);
        if (indice >= 0) {
            remove(indice);
            return true;
        }
        return false;
    }

    public static int size() {
        return tamaño;
    }

    public static boolean isEmpty() {
        return tamaño == 0;
    }

    public static boolean contains(String elemento) {
        return indexOf(elemento) >= 0;
    }

    public static int indexOf(String elemento) {
        for (int i = 0; i < tamaño; i++) {
            if (elemento == null && lista_nombre[i] == null) {
                return i;
            }
            if (elemento != null && elemento.equals(lista_nombre[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void clear() {
        for (int i = 0; i < tamaño; i++) {
            lista_nombre[i] = null;
        }
        tamaño = 0;
    }

    public static String[] toArray() {
        String[] copia = new String[tamaño];
        for (int i = 0; i < tamaño; i++) {
            copia[i] = lista_nombre[i];
        }
        return copia;
    }

    public static void imprimir_datos() {
        System.out.println("Contenido de la lista estática:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println((i + 1) + ". " + lista_nombre[i]);
        }
    }

    private static void agrandarArreglo() {
        String[] nuevoArreglo = new String[lista_nombre.length + 3];
        for (int i = 0; i < lista_nombre.length; i++) {
            nuevoArreglo[i] = lista_nombre[i];
        }
        lista_nombre = nuevoArreglo;
    }

    private static void validarIndice(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
    }

    public static void main(String[] args) {
        inicializar();
        add("Ana");
        add(1, "Luis");
        add("Sofía");
        imprimir_datos();

        System.out.println("Tamaño actual: " + size());
        System.out.println("Elemento en la posición 1: " + get(1));
        set(1, "Carlos");
        System.out.println("Buscar 'Carlos': " + contains("Carlos"));
        remove("Ana");
        System.out.println("Índice de 'Carlos': " + indexOf("Carlos"));
        clear();
        System.out.println("¿Está vacía? " + isEmpty());
    }
}