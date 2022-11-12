
package modelo;

/**
 *
 * @author Hernan
 */
public class Carrera {
    
    private int idCarrera;
    private String nombre;

    public Carrera() {
    }

    public Carrera(int idCarrera, String nombre) {
        this.idCarrera = idCarrera;
        this.nombre = nombre;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Carrera{" + "idCarrera=" + idCarrera + ", nombre=" + nombre + '}';
    }
    
    
    
}
