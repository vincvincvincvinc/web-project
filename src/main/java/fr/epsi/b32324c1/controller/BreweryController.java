package fr.epsi.b32324c1.controller;

import fr.epsi.b32324c1.entity.BreweryEntity;
import fr.epsi.b32324c1.service.BreweryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/breweries")
public class BreweryController {

    @Autowired
    private BreweryService breweryService;

    @GetMapping
    public List<BreweryEntity> getAllBreweries() {
        return breweryService.getAllBreweries();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BreweryEntity> getBreweryById(@PathVariable Long id) {
        BreweryEntity brewery = breweryService.getBreweryById(id);
        return ResponseEntity.ok().body(brewery);
    }

    @PostMapping
    public ResponseEntity<BreweryEntity> createBrewery(@RequestBody BreweryEntity brewery) {
        BreweryEntity createdBrewery = breweryService.createBrewery(brewery);
        return ResponseEntity.created(URI.create("/api/breweries/" + createdBrewery.getId())).body(createdBrewery);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BreweryEntity> updateBrewery(@PathVariable Long id, @RequestBody BreweryEntity brewery) {
        BreweryEntity updatedBrewery = breweryService.updateBrewery(id, brewery);
        return ResponseEntity.ok().body(updatedBrewery);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBrewery(@PathVariable Long id) {
        breweryService.deleteBrewery(id);
        return ResponseEntity.noContent().build();
    }
}
