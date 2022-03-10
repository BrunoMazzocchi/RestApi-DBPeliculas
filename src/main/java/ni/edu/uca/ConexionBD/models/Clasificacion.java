package ni.edu.uca.ConexionBD.models;

public class Clasificacion {
	private int idClasificacion;
	private String abreviacion;
	private String nombre;
	private boolean activo;
	public Clasificacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Clasificacion(int idClasificacion, String abreviacion, String nombre, boolean activo) {
		super();
		this.idClasificacion = idClasificacion;
		this.abreviacion = abreviacion;
		this.nombre = nombre;
		this.activo = activo;
	}
	public int getIdClasificacion() {
		return idClasificacion;
	}
	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}
	public String getAbreviacion() {
		return abreviacion;
	}
	public void setAbreviacion(String abrevacion) {
		this.abreviacion = abrevacion;
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
	@Override
	public String toString() {
		return "Clasificacion [idClasificacion=" + idClasificacion + ", abreviacion=" + abreviacion + ", nombre="
				+ nombre + ", activo=" + activo + "]";
	}
	
	

}
