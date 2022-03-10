package ni.edu.uca.ConexionBD.models;

public class Pelicula {
    private int idPelicula;
    private String titulo;
    private String tipoMetraje;
    private int nacionalidad;
    private int clasificacion;
    private String duracion;
    private String sinopsis;

    public Pelicula(){
        super();
    }

    public Pelicula(int idPelicula, String titulo, String tipoMetraje, int nacionalidad, int clasificacion, String duracion, String sinopsis) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.tipoMetraje = tipoMetraje;
        this.nacionalidad = nacionalidad;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoMetraje() {
        return tipoMetraje;
    }

    public void setTipoMetraje(String tipoMetraje) {
        this.tipoMetraje = tipoMetraje;
    }

    public int getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(int nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
