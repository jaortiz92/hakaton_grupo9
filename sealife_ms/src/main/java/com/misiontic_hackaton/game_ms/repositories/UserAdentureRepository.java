package com.misiontic_hackaton.game_ms.repositories;

import com.misiontic_hackaton.game_ms.models.Item;
import com.misiontic_hackaton.game_ms.models.UserAdventure;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserAdentureRepository extends MongoRepository<UserAdventure,String> {}
