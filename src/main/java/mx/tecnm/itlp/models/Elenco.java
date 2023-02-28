package mx.tecnm.itlp.models;

public class Elenco {
	private int id;
	private String personaje;
	private String papel;
	private int actores_id;
	private int peliculas_id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonaje() {
		return personaje;
	}
	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}
	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}
	public int getActores_id() {
		return actores_id;
	}
	public void setActores_id(int actores_id) {
		this.actores_id = actores_id;
	}
	public int getPeliculas_id() {
		return peliculas_id;
	}
	public void setPeliculas_id(int peliculas_id) {
		this.peliculas_id = peliculas_id;
	}

	
}
