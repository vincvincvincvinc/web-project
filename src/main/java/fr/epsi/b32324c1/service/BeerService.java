package fr.epsi.b32324c1.service;

import fr.epsi.b32324c1.model.Beer;
import java.util.List;
public interface BeerService {
    List<Beer> getAllBeers();
    Beer getBeerById(Long id);
    Beer createBeer(Beer beer);
    Beer updateBeer(Long id, Beer beer);
    void deleteBeer(Long id);
}
