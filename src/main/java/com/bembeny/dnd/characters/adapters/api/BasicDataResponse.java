package com.bembeny.dnd.characters.adapters.api;

import com.bembeny.dnd.characters.domain.enums.Gender;
import com.bembeny.dnd.characters.domain.enums.Profesion;
import com.bembeny.dnd.characters.domain.enums.Race;
import com.bembeny.dnd.characters.domain.enums.StarSign;
import com.bembeny.dnd.characters.domain.model.BasicData;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
class BasicDataResponse {
    Long id;
    String name;
    Profesion profesion;
    Race race;
    Gender gender;
    Integer age;
    String birthplace;
    StarSign starSign;
    Long experience;

    static BasicDataResponse of(BasicData basicData) {
        return BasicDataResponse
                .builder()
                .id(basicData.getId())
                .name(basicData.getName())
                .profesion(basicData.getProfesion())
                .race(basicData.getRace())
                .gender(basicData.getGender())
                .age(basicData.getAge())
                .birthplace(basicData.getBirthplace())
                .starSign(basicData.getStarSign())
                .experience(basicData.getExperience())
                .build();
    }
}
