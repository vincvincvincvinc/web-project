package fr.epsi.b32324c1.service;

import fr.epsi.b32324c1.model.Beer;
import fr.epsi.b32324c1.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BeerServiceImpl implements BeerService {

    @Autowired
    private BeerRepository beerRepository;

    @Override
    public List<Beer> getAllBeers() {
        return beerRepository.findAll();
    }

    @Override
    public Beer getBeerById(Long id) {
        return beerRepository.findById(id).orElse(null);
    }

    @Override
    public Beer createBeer(Beer beer) {
        return beerRepository.save(beer);
    }

    @Override
    public Beer updateBeer(Long id, Beer beer) {
        beer.setId(id);
        return beerRepository.save(beer);
    }

    @Override
    public void deleteBeer(Long id) {
        beerRepository.deleteById(id);
    }
}
