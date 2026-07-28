package estructura_de_datos;

public class Cliente_modelo {
    private String nombre;
    private String cedula;

    public Cliente_modelo(String info_nombre, String info_cedula) {
        this.nombre = info_nombre;
        this.cedula = info_cedula;
    }

    public void ver_datos() {
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Nombre: " + this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Cliente_modelo{nombre='" + nombre + "', cedula='" + cedula + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cliente_modelo that = (Cliente_modelo) obj;
        return nombre.equals(that.nombre) && cedula.equals(that.cedula);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nombre, cedula);
    }
}