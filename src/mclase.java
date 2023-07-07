import java.io.Serializable;

public class mclase implements Serializable {
    private String nombre;
    private int edad;

    public mclase(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Nombre:" +nombre+ ", edad"+edad;
    }
    private static final long serialVersionUID=1L;
}
