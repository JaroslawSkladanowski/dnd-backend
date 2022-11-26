package com.bembeny.dnd.characters.domain.ports;

import com.bembeny.dnd.characters.domain.model.BasicData;

public interface BasicDataRepository {
    BasicData get(Long id);
}
