package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Clasificacion;

@Repository
public class ClasificacionDRepository implements ClasificacionIRepository {

	@Autowired
	JdbcTemplate operacion;
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = operacion.queryForList("Select * from Clasificacion");
		return lista;
	}

	@Override
	public int GuardarRegistro(Clasificacion c) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Insert into Clasificacion(abreviacion, nombre, activo) values(?, ?, ?)",
				c.getAbreviacion(), c.getNombre(), c.isActivo());
		return b;
	}

	@Override
	public int EditarRegistro(Clasificacion c) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Update Clasificacion set abreviacion = ?, nombre = ?, activo = ? where idClasificacion = ?",
				c.getAbreviacion(), c.getNombre(), c.isActivo(), c.getIdClasificacion());
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Delete from Clasificacion where idClasificacion = ?", id);
		return b;
	}

}
