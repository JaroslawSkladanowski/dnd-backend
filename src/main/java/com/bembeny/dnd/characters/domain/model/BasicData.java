package com.bembeny.dnd.characters.domain.model;

import com.bembeny.dnd.characters.domain.enums.Gender;
import com.bembeny.dnd.characters.domain.enums.Profesion;
import com.bembeny.dnd.characters.domain.enums.Race;
import com.bembeny.dnd.characters.domain.enums.StarSign;
import lombok.Data;

@Data
public class BasicData {
    Long id;
    String name;
    Profesion profesion;
    Race race;
    Gender gender;
    Integer age;
    String birthplace;
    StarSign starSign;
    Long experience;
}
