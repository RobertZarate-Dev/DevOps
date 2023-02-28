package mx.tecnm.itlp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.tecnm.itlp.dao.PeliculasRM;

import mx.tecnm.itlp.models.Peliculas;



@Repository
public class PeliculasJDBC {

	@Autowired
	JdbcTemplate conexion;
	
	
	public void insertarPeliculas(Peliculas peliculas) {
		String sql = "INSERT INTO peliculas (id,titulo,valoracion,duracion,idioma,fecha_lanzamiento,subtitulos,sinopsis,productora,tamano_descarga,categorias_id) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		conexion.update(sql, peliculas.getId(), peliculas.getTitulo(),peliculas.getValoracion(),peliculas.getDuracion(),peliculas.getIdioma(),peliculas.getFecha_lanzamiento(),peliculas.getSubtitulos(),peliculas.getSinopsis(),peliculas.getProductora(),peliculas.getTamano_descarga(),peliculas.getCategorias_id());
	}
	
	public List<Peliculas> consultarPeliculas(){
		String sql = "select * from peliculas where activo=1 ";
		return conexion.query(sql, new PeliculasRM() );
	
	}
	
	public List<Peliculas> consultarPeliculasID(int id){
		String sql = "select * from peliculas where id=? and activo=1 ";
		return conexion.query(sql, new PeliculasRM(),id );
	
	}

	public List<Peliculas> consultarPeliculasGenero(int id) {
		String sql = "SELECT *\r\n"
				+ "FROM peliculas AS p\r\n"
				+ "JOIN genero_pelicula AS gp ON gp.peliculas_id = p.id\r\n"
				+ "JOIN generos AS g ON g.id = gp.generos_id\r\n"
				+ "WHERE gp.generos_id= ? and activo=1";
		return conexion.query(sql, new PeliculasRM(),id );
	}
	
	public void desactivar(int id) {
        String sql= "UPDATE peliculas SET activo=0, deleted = now() WHERE id=?";
        conexion.update(sql, id);
    }

	public void actualizar(Peliculas p) {
        String sql= "UPDATE peliculas SET titulo=?, valoracion=?, duracion=?, idioma=?, fecha_lanzamiento=?, subtitulos=?, sinopsis=?, productora=?, tamano_descarga=?, categorias_id=?, updated = now() WHERE id=?";
        conexion.update(sql,p.getTitulo(),p.getValoracion(),p.getDuracion(),p.getIdioma(),p.getFecha_lanzamiento(),p.getSubtitulos(),p.getSinopsis(),p.getProductora(),p.getTamano_descarga(),p.getCategorias_id(),p.getId());
    }
	
	
	
}
