package mx.tecnm.itlp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tecnm.itlp.dao.PeliculasJDBC;
import mx.tecnm.itlp.models.Actores;
import mx.tecnm.itlp.models.Peliculas;


@RestController
@RequestMapping("/netflix")
public class PeliculasREST {
	
	   @Autowired
	    PeliculasJDBC repo;
	   
	   @PostMapping("/peliculas")
	    public ResponseEntity<?> insertarP(@RequestBody Peliculas peliculas) {
	    	try {
	    	repo.insertarPeliculas(peliculas);
	    	return new ResponseEntity<Void>(HttpStatus.CREATED);
	    	
	    	} catch (Exception e) {
	    		System.out.println(e);
	    		return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	    		
	    	}
	    }
	   
	   @GetMapping("/peliculas")
			public ResponseEntity<?> consultarPeliculas(){
			try {
				List<Peliculas> resultado= repo.consultarPeliculas();
				return new ResponseEntity<List<Peliculas>>(resultado, HttpStatus.OK);
				}
				catch (Exception e){
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
			}
	   
	   
	   @GetMapping("/peliculas/{id}")
		public ResponseEntity<?> consultarPeliculasID(@PathVariable("id") int id){
		try {
			List<Peliculas> resultado= repo.consultarPeliculasID(id);
			return new ResponseEntity<List<Peliculas>>(resultado, HttpStatus.OK);
			}
			catch (Exception e){
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}
	   
	   @GetMapping("/peliculas/genero/{id}")
		public ResponseEntity<?> consultarPeliculasGEN(@PathVariable("id") int id){
		try {
			List<Peliculas> resultado= repo.consultarPeliculasGenero(id);
			return new ResponseEntity<List<Peliculas>>(resultado, HttpStatus.OK);
			}
			catch (Exception e){
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}
	   
	   @DeleteMapping("/peliculas/{id}")
	    public void desactivarPelicula(@PathVariable int id){
	        repo.desactivar(id);
	    }
	   
	   @PutMapping("/peliculas")
	    public ResponseEntity<?> actualizarAlumno(@RequestBody Peliculas peliculas){
	        try {
	            repo.actualizar(peliculas);
	            return new ResponseEntity<Void>(HttpStatus.CREATED);
	        } catch (Exception e) {
	            // TODO: handle exception
	            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	        }

	    }
	   

	   
	   
	
	   
}
