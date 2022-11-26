package com.bembeny.dnd.profesions.adapters.profesiondb;

import com.bembeny.dnd.profesions.domain.enums.ProfesionType;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProfesionEntity {

    @Id
    @GeneratedValue
    Long id;

    String name;

    @Enumerated(EnumType.STRING)
    ProfesionType type;
}
