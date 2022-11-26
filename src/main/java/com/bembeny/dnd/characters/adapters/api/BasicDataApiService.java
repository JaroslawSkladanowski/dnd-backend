package com.bembeny.dnd.characters.adapters.api;

import com.bembeny.dnd.characters.domain.model.BasicData;
import com.bembeny.dnd.characters.domain.ports.BasicDataService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
class BasicDataApiService {

    @Inject
    private BasicDataService service;

    public BasicDataResponse get(Long id) {
        final BasicData basicData = service.get(id);
        return BasicDataResponse.of(basicData);
    }

}
