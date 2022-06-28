package com.bembeny.dnd;

import io.micronaut.http.annotation.*;

@Controller("/dndBackend")
public class DndBackendController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}