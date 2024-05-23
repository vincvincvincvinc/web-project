package fr.epsi.b32324c1.repository;

import fr.epsi.b32324c1.entity.BreweryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreweryRepository extends JpaRepository<BreweryEntity, Long> {
}

