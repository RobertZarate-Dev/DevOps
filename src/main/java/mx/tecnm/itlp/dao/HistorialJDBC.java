package mx.tecnm.itlp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.tecnm.itlp.dao.PeliculasRM;
import mx.tecnm.itlp.models.Historial;
import mx.tecnm.itlp.models.Peliculas;
import java.time.LocalDate;


@Repository
public class HistorialJDBC {

	@Autowired
	JdbcTemplate conexion;
	
	// \"2022-11-12\",\"01:18:58\",6,1
	public void insertarHistorial(Historial h) {
		String sql = "INSERT INTO historial (id,fecha,tiempo_avance,perfiles_usuarios_id,peliculas_id) VALUES(?,?,?,?,?)";
		conexion.update(sql, h.getId(), h.getFecha(),h.getTiempo_avance(),h.getPerfiles_usuarios_id(),h.peliculas_id);
	}
	
	
	public List<Historial> consultarHistorialByID(int id_pelicula,int id_usuario){
		String sql = "SELECT * FROM historial WHERE perfiles_usuarios_id=? AND peliculas_id=?; ";
		return conexion.query(sql, new HistorialRM(),id_usuario,id_pelicula );
	
	}
	

	
	

	
	
}
