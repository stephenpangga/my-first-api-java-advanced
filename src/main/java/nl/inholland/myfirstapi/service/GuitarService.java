package nl.inholland.myfirstapi.service;


import nl.inholland.myfirstapi.model.Guitar;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class GuitarService {

    private List<Guitar> guitars;

    public GuitarService() {
        guitars = Arrays.asList(
                new Guitar(1L, "Fender", "Telecaster", 899.0),
                new Guitar(2L, "Fender", "Stratocaster", 1299.0),
                new Guitar(3L, "Fender", "Thunderbird", 2999.0)
        );
    }

    public List<Guitar> getAllGuitars() {
        return guitars;
    }

    public List<Guitar> organizeGuitarbyPrice()
    {
        Collections.sort(guitars, (g1, g2)-> (int) (g1.getPrice()-g2.getPrice()));

        return guitars;
    }
}
