package mx.tecnm.itlp.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.tecnm.itlp.models.Mi_Lista;
import mx.tecnm.itlp.models.Mi_lista_response;
import mx.tecnm.itlp.models.Peliculas;



@Repository
public class Mi_ListaJDBC {

	@Autowired
	JdbcTemplate conexion;
	
	
	public void insertarMiLista(Mi_Lista ml) {
		String sql = "INSERT INTO mi_lista (id,fecha,perfiles_usuarios_id,peliculas_id) VALUES (?,?,?,?)";
		conexion.update(sql,ml.getId(),ml.getFecha(),ml.getPerfiles_usuarios_id(),ml.getPeliculas_id());
	}

	public List<Mi_lista_response> consultarListaIdPerfil(int id) {
		String sql = "SELECT p.titulo, p.sinopsis, p.productora, p.tamano_descarga, m.perfiles_usuarios_id\r\n"
				+ "FROM mi_lista AS m\r\n"
				+ "JOIN peliculas AS p ON p.id=m.peliculas_id\r\n"
				+ "WHERE p.activo = 1 AND m.perfiles_usuarios_id=?";
		return conexion.query(sql, new MiListaRM(),id );
	}
	
	public void EliminardeMiLista(int idperfilusuarios,int idpeliculas){
		String sql="Delete FROM mi_lista WHERE perfiles_usuarios_id=? AND peliculas_id=?";
		conexion.update(sql,idperfilusuarios,idpeliculas);
	}
	
	
	public int CantidadPeliculas(int idperdilusuairos){
		Integer cnt = conexion.queryForObject(
    	"SELECT count(*) \r\n"
		+ "FROM mi_lista AS m \r\n"
		+"JOIN peliculas AS p ON p.id=m.peliculas_id\r\n"
		+ "WHERE p.activo = 1 AND m.perfiles_usuarios_id=?", 
		Integer.class, idperdilusuairos);
	    return cnt;
	}
	
	
}
