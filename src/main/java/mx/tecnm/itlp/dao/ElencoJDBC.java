package mx.tecnm.itlp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.tecnm.itlp.dao.PeliculasRM;
import mx.tecnm.itlp.models.Elenco;
import mx.tecnm.itlp.models.Peliculas;



@Repository
public class ElencoJDBC {

	@Autowired
	JdbcTemplate conexion;
	
	
	public void insertarElenco(Elenco e) {
		String sql = "INSERT INTO elenco (id, personaje, papel, actores_id, peliculas_id)\r\n"
				+ "VALUES (?,?,?,?,?);";
		conexion.update(sql, e.getId(), e.getPersonaje(),e.getPapel(),e.getActores_id(),e.getPeliculas_id());
	}
		
	
}
