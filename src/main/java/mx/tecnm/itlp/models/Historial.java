package mx.tecnm.itlp.models;

public class Historial {
	public int id;
	public String fecha;
	public String tiempo_avance;
	public int perfiles_usuarios_id;
	public int peliculas_id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTiempo_avance() {
		return tiempo_avance;
	}
	public void setTiempo_avance(String tiempo_avance) {
		this.tiempo_avance = tiempo_avance;
	}
	public int getPerfiles_usuarios_id() {
		return perfiles_usuarios_id;
	}
	public void setPerfiles_usuarios_id(int perfiles_usuarios_id) {
		this.perfiles_usuarios_id = perfiles_usuarios_id;
	}
	public int getPeliculas_id() {
		return peliculas_id;
	}
	public void setPeliculas_id(int peliculas_id) {
		this.peliculas_id = peliculas_id;
	}
	
	
}
