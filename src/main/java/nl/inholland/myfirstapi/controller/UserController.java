package nl.inholland.myfirstapi.controller;


import nl.inholland.myfirstapi.model.Guitar;
import nl.inholland.myfirstapi.model.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
//endpoint, also the request value /api/guitars
@RequestMapping(value = "users")
@CrossOrigin(origins = {"http://localhost:3000}", "http://localhost"})
public class UserController {

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser()
    {
        return ResponseEntity.status(200).body(new User("stephen", "pangga"));
    }
}
