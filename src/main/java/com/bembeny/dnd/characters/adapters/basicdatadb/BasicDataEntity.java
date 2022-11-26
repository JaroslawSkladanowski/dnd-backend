package com.bembeny.dnd.characters.adapters.basicdatadb;

import com.bembeny.dnd.characters.domain.model.BasicData;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class BasicDataEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;


    BasicData toDomain() {
        final BasicData basicData = new BasicData();
        basicData.setId(id);
        basicData.setName(name);
        return basicData;
    }
}
