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

import mx.tecnm.itlp.dao.ActoresJDBC;
import mx.tecnm.itlp.dao.HistorialJDBC;
import mx.tecnm.itlp.models.Actor_Personaje;
import mx.tecnm.itlp.models.Actores;
import mx.tecnm.itlp.models.Historial;
import mx.tecnm.itlp.models.Peliculas;


@RestController
@RequestMapping("/netflix")
public class ActoresREST {
	
	   @Autowired
	    ActoresJDBC repo;
	   

	   
	   
	   @PostMapping("/actores")
	    public ResponseEntity<?> insertarA(@RequestBody Actores actores) {
	    	try {
	    	repo.insertarActores(actores);
	    	return new ResponseEntity<Void>(HttpStatus.CREATED);
	    	
	    	} catch (Exception e) {
	    		System.out.println();
	    		System.out.println(e);
	    		return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	    	}
	    }
	   
	   
	   
	   @GetMapping("/actores/{id}")
		public ResponseEntity<?> consultarActorPeliculaId(@PathVariable("id") int id){
		try {
			List<Actor_Personaje> resultado= repo.consultarActoresPersonajes(id);
			return new ResponseEntity<List<Actor_Personaje>>(resultado, HttpStatus.OK);
			}
			catch (Exception e){
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}
	   
	

	   
	   
	
	   
}
