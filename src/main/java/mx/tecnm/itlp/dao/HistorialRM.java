package mx.tecnm.itlp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import mx.tecnm.itlp.models.Historial;
import mx.tecnm.itlp.models.Peliculas;

public class HistorialRM implements RowMapper<Historial> {

	@Override
	public Historial mapRow(ResultSet rs, int rowNum) throws SQLException {
		Historial h = new Historial();
		h.setId(rs.getInt("id"));
		h.setFecha(rs.getString("fecha"));
		h.setTiempo_avance(rs.getString("tiempo_avance"));
		h.setPerfiles_usuarios_id(rs.getInt("perfiles_usuarios_id"));
		h.setPeliculas_id(rs.getInt("peliculas_id"));
		return h;

	}

}
