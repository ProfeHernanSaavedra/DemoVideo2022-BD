
package modelo;

/**
 *
 * @author Hernan
 */
public class Alumno {
    
    private int rut,idCarrera;
    private String nombre,direccion;

    public Alumno() {
    }

    public Alumno(int rut, int idCarrera, String nombre, String direccion) {
        this.rut = rut;
        this.idCarrera = idCarrera;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Alumno{" + "rut=" + rut + ", idCarrera=" + idCarrera + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    
    
    
}
