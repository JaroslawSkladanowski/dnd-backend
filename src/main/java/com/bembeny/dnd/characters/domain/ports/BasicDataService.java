package com.bembeny.dnd.characters.domain.ports;

import com.bembeny.dnd.characters.domain.model.BasicData;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class BasicDataService {

    @Inject
    private BasicDataRepository repository;

    public BasicData get(Long id) {
        return repository.get(id);
    }
}
