package com.misiontic_hackaton.game_ms.repositories;

import com.misiontic_hackaton.game_ms.models.Adventure;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdventureRepository extends MongoRepository<Adventure,String> {
}
