package fr.epsi.b32324c1.service;

import fr.epsi.b32324c1.entity.BreweryEntity;
import fr.epsi.b32324c1.repository.BreweryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreweryService {

    @Autowired
    private BreweryRepository breweryRepository;

    public List<BreweryEntity> getAllBreweries() {
        return breweryRepository.findAll();
    }

    public BreweryEntity getBreweryById(Long id) {
        return breweryRepository.findById(id).orElse(null);
    }

    public BreweryEntity createBrewery(BreweryEntity brewery) {
        return breweryRepository.save(brewery);
    }

    public BreweryEntity updateBrewery(Long id, BreweryEntity brewery) {
        brewery.setId(id);
        return breweryRepository.save(brewery);
    }

    public void deleteBrewery(Long id) {
        breweryRepository.deleteById(id);
    }
}
