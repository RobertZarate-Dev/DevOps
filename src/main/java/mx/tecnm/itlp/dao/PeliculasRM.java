package mx.tecnm.itlp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;



import mx.tecnm.itlp.models.Peliculas;

public class PeliculasRM implements RowMapper<Peliculas> {

	@Override
	public Peliculas mapRow(ResultSet rs, int rowNum) throws SQLException {
		Peliculas pelicula = new Peliculas();
		pelicula.setId(rs.getInt("id"));
		pelicula.setTitulo(rs.getString("titulo"));
		pelicula.setValoracion(rs.getString("valoracion"));
		pelicula.setDuracion(rs.getString("duracion"));
		pelicula.setIdioma(rs.getString("idioma"));
		pelicula.setFecha_lanzamiento(rs.getInt("fecha_lanzamiento"));
		pelicula.setSubtitulos(rs.getString("subtitulos"));
		pelicula.setSinopsis(rs.getString("sinopsis"));
		pelicula.setProductora(rs.getString("productora"));
		pelicula.setTamano_descarga(rs.getString("tamano_descarga"));
		pelicula.setCategorias_id(rs.getInt("categorias_id"));
		
		return pelicula;

	}

}
