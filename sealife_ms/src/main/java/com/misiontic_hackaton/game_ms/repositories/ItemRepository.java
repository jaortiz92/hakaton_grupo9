package com.misiontic_hackaton.game_ms.repositories;

import com.misiontic_hackaton.game_ms.models.Adventure;
import com.misiontic_hackaton.game_ms.models.Item;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ItemRepository extends MongoRepository<Item,String> {}

