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

import mx.tecnm.itlp.dao.Mi_ListaJDBC;
import mx.tecnm.itlp.dao.PeliculasJDBC;
import mx.tecnm.itlp.models.Mi_Lista;
import mx.tecnm.itlp.models.Mi_lista_response;



@RestController
@RequestMapping("/netflix")
public class Mi_ListaREST {
	
	   @Autowired
	    Mi_ListaJDBC repo;
	   
	   @PostMapping("/lista")
	    public ResponseEntity<?> insertarMiLista(@RequestBody Mi_Lista ml) {
	    	try {
	    	repo.insertarMiLista(ml);;
	    	return new ResponseEntity<Void>(HttpStatus.CREATED);
	    	
	    	} catch (Exception e) {
	    		System.out.println(e);
	    		return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	    		
	    	}
	    }

		@GetMapping("/{id}")
		public ResponseEntity<?> consultarLista(@PathVariable("id") int id){
		try {
			List<Mi_lista_response> resultado= repo.consultarListaIdPerfil(id);
			return new ResponseEntity<List<Mi_lista_response>>(resultado, HttpStatus.OK);
			}
			catch (Exception e){
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		}
	   
	 
	   

	   
	   
	
	   
}
