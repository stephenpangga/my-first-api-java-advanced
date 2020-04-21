package nl.inholland.myfirstapi.controller;

import nl.inholland.myfirstapi.model.Guitar;
import nl.inholland.myfirstapi.service.GuitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Collections;
import java.util.List;

@Controller
//endpoint, also the request value /api/guitars
@RequestMapping(value = "guitars")
@CrossOrigin(origins = {"http://localhost:3000}", "http://localhost"})
public class GuitarController {

    @Autowired
    private GuitarService service;
    // url: localhost:8080/api/guitars/
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Guitar>> getAllGuitars()
    {
        return ResponseEntity.status(200).body(service.getAllGuitars());
    }
    // url: localhost:8080/api/guitars/all
    @RequestMapping(value = "all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Guitar>> all()
    {
        return ResponseEntity.status(404).body(service.getAllGuitars());
    }

    /*
    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Guitar>> getPerId()
    {
        return service.getId(long id);
    }
    */
    @RequestMapping(value = "arrange", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Guitar>> organizeGuitarsbyPrice()
    {
        return ResponseEntity.status(200).body(service.organizeGuitarbyPrice());
    }

}
