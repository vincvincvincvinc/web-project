package fr.epsi.b32324c1.service;

import fr.epsi.b32324c1.entity.BeerEntity;
import java.util.List;
public interface BeerService {
    List<BeerEntity> getAllBeers();
    BeerEntity getBeerById(Long id);
    BeerEntity createBeer(BeerEntity beer);
    BeerEntity updateBeer(Long id, BeerEntity beer);
    void deleteBeer(Long id);
}
