package estructura_de_datos;


public class Estatico {
    
    public static String[] lista_nombre = new String[3];
    
    public Estatico(){
        lista_nombre = new String[3];
    }
    
    public static void imprimir_datos(){
        for(int i = 0; i < lista_nombre.length; i++){
            System.out.println("datos: " + lista_nombre[i]);
        }
    }
}