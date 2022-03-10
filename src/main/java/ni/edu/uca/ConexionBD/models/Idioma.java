package ni.edu.uca.ConexionBD.models;

public class Idioma {

    private int idIdioma;
    private String nombre;
    private boolean activo;

    public Idioma(){
        super();
    }

    public Idioma(int idIdioma, String nombre, boolean activo) {
        this.idIdioma = idIdioma;
        this.nombre = nombre;
        this.activo = activo;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
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
