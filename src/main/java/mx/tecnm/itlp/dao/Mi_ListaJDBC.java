package mx.tecnm.itlp.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.tecnm.itlp.models.Mi_Lista;



@Repository
public class Mi_ListaJDBC {

	@Autowired
	JdbcTemplate conexion;
	
	
	public void insertarMiLista(Mi_Lista ml) {
		String sql = "INSERT INTO mi_lista (id,fecha,perfiles_usuarios_id,peliculas_id) VALUES (?,?,?,?)";
		conexion.update(sql,ml.getId(),ml.getFecha(),ml.getPerfiles_usuarios_id(),ml.getPeliculas_id());
	}
	

	
	
	
	
	
}
