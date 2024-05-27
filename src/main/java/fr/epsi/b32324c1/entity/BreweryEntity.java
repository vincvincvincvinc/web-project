package fr.epsi.b32324c1.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "brewery")
public class BreweryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "brewery", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BeerEntity> beers;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BeerEntity> getBeers() {
        return beers;
    }

    public void setBeers(List<BeerEntity> beers) {
        this.beers = beers;
    }
}
