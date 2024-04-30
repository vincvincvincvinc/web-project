package fr.epsi.b32324c1.service;

import fr.epsi.b32324c1.entity.BeerEntity;
import fr.epsi.b32324c1.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BeerServiceImpl implements BeerService {

    @Autowired
    private BeerRepository beerRepository;

    @Override
    public List<BeerEntity> getAllBeers() {
        return beerRepository.findAll();
    }

    @Override
    public BeerEntity getBeerById(Long id) {
        return beerRepository.findById(id).orElse(null);
    }

    @Override
    public BeerEntity createBeer(BeerEntity beer) {
        return beerRepository.save(beer);
    }

    @Override
    public BeerEntity updateBeer(Long id, BeerEntity beer) {
        beer.setId(id);
        return beerRepository.save(beer);
    }

    @Override
    public void deleteBeer(Long id) {
        beerRepository.deleteById(id);
    }
}
