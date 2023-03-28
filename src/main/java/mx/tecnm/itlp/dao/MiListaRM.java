package mx.tecnm.itlp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import mx.tecnm.itlp.models.Mi_Lista;
import mx.tecnm.itlp.models.Mi_lista_response;
import mx.tecnm.itlp.models.Peliculas;

import org.springframework.jdbc.core.RowMapper;



public class MiListaRM implements RowMapper<Mi_lista_response>{
	@Override
	public Mi_lista_response mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mi_lista_response mi_lista = new Mi_lista_response();
		mi_lista.setTitulo(rs.getString("titulo"));
        mi_lista.setSinopsis(rs.getString("sinopsis"));
		mi_lista.setProductora(rs.getString("productora"));
		mi_lista.setTamano_descarga(rs.getString("tamano_descarga"));
		mi_lista.setPerfiles_usuarios_id(rs.getInt("perfiles_usuarios_id"));
		
		return mi_lista;

	}
}
