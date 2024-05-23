package fr.epsi.b32324c1.service;

import fr.epsi.b32324c1.entity.BeerEntity;
import fr.epsi.b32324c1.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {

    @Autowired
    private BeerRepository beerRepository;

    public List<BeerEntity> getAllBeers() {
        return beerRepository.findAll();
    }

    public BeerEntity getBeerById(Long id) {
        return beerRepository.findById(id).orElse(null);
    }

    public BeerEntity createBeer(BeerEntity beer) {
        return beerRepository.save(beer);
    }

    public BeerEntity updateBeer(Long id, BeerEntity beer) {
        beer.setId(id);
        return beerRepository.save(beer);
    }

    public void deleteBeer(Long id) {
        beerRepository.deleteById(id);
    }
}

