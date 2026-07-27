package estructura_de_datos;

public class Cliente_modelo {
    private String nombre;
    private String cedula;

    public Cliente_modelo(String info_nombre, String info_cedula){
        this.nombre = info_nombre;
        this.cedula = info_cedula;
}
public void ver_datos(){
    System.out.println("cedula:"+ this.cedula);
    System.out.println("Nombre:"+ this.nombre);
}

}