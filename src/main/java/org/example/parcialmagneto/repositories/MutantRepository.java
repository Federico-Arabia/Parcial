package org.example.parcialmagneto.repositories;

import org.example.parcialmagneto.model.Mutant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MutantRepository extends JpaRepository<Mutant, String> {

    Optional<Mutant> findByDna(String dnaSequence);
    long countByIsMutant(boolean isMutant);
}

