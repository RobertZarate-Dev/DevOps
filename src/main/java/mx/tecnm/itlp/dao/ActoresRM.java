package mx.tecnm.itlp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import mx.tecnm.itlp.models.Actor_Personaje;
import mx.tecnm.itlp.models.Actores;
import mx.tecnm.itlp.models.Peliculas;

public class ActoresRM implements RowMapper<Actor_Personaje> {

	@Override
	public Actor_Personaje mapRow(ResultSet rs, int rowNum) throws SQLException {
		Actor_Personaje a = new Actor_Personaje();
		a.setNombre_completo(rs.getString("nombre_completo"));
		a.setPersonaje(rs.getString("personaje"));
		
		return a;

	}

}
