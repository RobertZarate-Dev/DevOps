package mx.tecnm.itlp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.tecnm.itlp.models.Actor_Personaje;
import mx.tecnm.itlp.models.Actores;
import mx.tecnm.itlp.models.Peliculas;



@Repository
public class ActoresJDBC {

	@Autowired
	JdbcTemplate conexion;
	
	
	public void insertarActores(Actores actores) {
		String sql = "INSERT INTO actores (id,nombre_completo) VALUES (?,?)";
		conexion.update(sql,actores.getId(),actores.getNombre_completo());
	}
	
	public List<Actor_Personaje> consultarActoresPersonajes(int id){
		String sql = "SELECT a.nombre_completo, e.personaje\r\n"
				+ "FROM actores AS a\r\n"
				+ "JOIN elenco AS e ON a.id=e.actores_id\r\n"
				+ "JOIN peliculas AS p ON p.id=e.peliculas_id\r\n"
				+ "WHERE p.id=?";
		return conexion.query(sql, new ActoresRM(),id );
	
	}
	
	
	
	
	
}
