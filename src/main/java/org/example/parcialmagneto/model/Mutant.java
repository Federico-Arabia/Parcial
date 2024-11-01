package org.example.parcialmagneto.model;

import jakarta.persistence.Entity;
import lombok.*;

import java.io.Serializable;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mutant extends Base implements Serializable {

    private String dna;
    private boolean isMutant;
}
