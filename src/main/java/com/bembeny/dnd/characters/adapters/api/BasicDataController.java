package com.bembeny.dnd.characters.adapters.api;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import lombok.AllArgsConstructor;

@Controller("/characters/v1")
@AllArgsConstructor
class BasicDataController {

    @Inject
    private BasicDataApiService service;

    @Get("{id}")
    public BasicDataResponse get(Long id) {
        return service.get(id);
    }
}
