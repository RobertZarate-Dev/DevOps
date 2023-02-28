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
import mx.tecnm.itlp.dao.ElencoJDBC;
import mx.tecnm.itlp.models.Actor_Personaje;
import mx.tecnm.itlp.models.Actores;
import mx.tecnm.itlp.models.Elenco;
import mx.tecnm.itlp.models.Peliculas;


@RestController
@RequestMapping("/netflix")
public class ElencoREST {
	
	   @Autowired
	    ElencoJDBC repo;
	   
	   @PostMapping("/elenco")
	    public ResponseEntity<?> insertarE(@RequestBody Elenco e) {
	    	try {
	    	repo.insertarElenco(e);
	    	return new ResponseEntity<Void>(HttpStatus.CREATED);
	    	
	    	} catch (Exception x) {
	    		System.out.println(x);
	    		return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	    	}
	    }
	   

	   
}
