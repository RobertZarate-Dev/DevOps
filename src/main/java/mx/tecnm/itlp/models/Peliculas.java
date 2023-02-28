package mx.tecnm.itlp.models;

public class Peliculas {
	private int id;
	private String titulo;
	private String valoracion;
	private String duracion;
	private String idioma; 
	private int fecha_lanzamiento; 
	private String subtitulos;
	private String sinopsis;
	private String productora;
	private String tamano_descarga;
	private int categorias_id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getValoracion() {
		return valoracion;
	}
	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public int getFecha_lanzamiento() {
		return fecha_lanzamiento;
	}
	public void setFecha_lanzamiento(int fecha_lanzamiento) {
		this.fecha_lanzamiento = fecha_lanzamiento;
	}
	public String getSubtitulos() {
		return subtitulos;
	}
	public void setSubtitulos(String subtitulos) {
		this.subtitulos = subtitulos;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getProductora() {
		return productora;
	}
	public void setProductora(String productora) {
		this.productora = productora;
	}
	public String getTamano_descarga() {
		return tamano_descarga;
	}
	public void setTamano_descarga(String tamano_descarga) {
		this.tamano_descarga = tamano_descarga;
	}
	public int getCategorias_id() {
		return categorias_id;
	}
	public void setCategorias_id(int categorias_id) {
		this.categorias_id = categorias_id;
	}
	
}

