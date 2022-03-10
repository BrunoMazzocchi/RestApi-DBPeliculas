package ni.edu.uca.ConexionBD.models;

public class Nacionalidad {

    private int idNacionalidad;
    private String nombre;
    private boolean activo;

    public Nacionalidad(){
        super();
    }

    public Nacionalidad(int idNacionalidad, String nombre, boolean activo) {
        this.idNacionalidad = idNacionalidad;
        this.nombre = nombre;
        this.activo = activo;
    }

    public int getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(int idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
