package com.bembeny.dnd.characters.adapters.basicdatadb;

import com.bembeny.dnd.characters.domain.model.BasicData;
import com.bembeny.dnd.characters.domain.ports.BasicDataRepository;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class BasicDataRepositoryImpl implements BasicDataRepository {

    @Inject
    private BasicDataDbRepository repository;

    @Override
    public BasicData get(Long id) {
        return repository
                .findById(id)
                .map(BasicDataEntity::toDomain)
                .orElseThrow(() -> new HttpStatusException(HttpStatus.NOT_FOUND, "Character cannot be found."));
    }
}
