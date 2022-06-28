package com.bembeny.dnd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
// TODO: https://d-n-d-helper.youtrack.cloud/issue/DNDH-5 - KILL ME PLOX
public class TestEntity {
    @Id
    @GeneratedValue
    private Long id;
}
