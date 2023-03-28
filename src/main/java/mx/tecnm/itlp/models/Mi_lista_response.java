package mx.tecnm.itlp.models;

public class Mi_lista_response {
    private String titulo;
    private String sinopsis;
	private String productora;
	private String tamano_descarga;
    private int perfiles_usuarios_id;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    public int getPerfiles_usuarios_id() {
        return perfiles_usuarios_id;
    }
    public void setPerfiles_usuarios_id(int perfiles_usuarios_id) {
        this.perfiles_usuarios_id = perfiles_usuarios_id;
    }
    
}
