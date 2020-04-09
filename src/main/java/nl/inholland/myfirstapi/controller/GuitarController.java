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

import java.util.List;

@Controller
//endpoint, also the request value /api/guitars
@RequestMapping(value = "guitars")
@CrossOrigin(origins = {"http://localhost:3000}", "http://localhost"})
public class GuitarController {

    @Autowired
    private GuitarService service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Guitar>> getAllGuitars()
    {
        return ResponseEntity.status(404).body(service.getAllGuitars());
    }
}
