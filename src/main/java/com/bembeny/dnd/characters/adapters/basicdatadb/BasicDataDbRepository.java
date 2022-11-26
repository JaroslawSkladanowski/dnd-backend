package com.bembeny.dnd.characters.adapters.basicdatadb;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface BasicDataDbRepository extends JpaRepository<BasicDataEntity, Long> {
}
