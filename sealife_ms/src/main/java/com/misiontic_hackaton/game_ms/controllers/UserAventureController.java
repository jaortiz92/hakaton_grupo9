package com.misiontic_hackaton.game_ms.controllers;

import com.misiontic_hackaton.game_ms.models.Item;
import com.misiontic_hackaton.game_ms.models.UserAdventure;
import com.misiontic_hackaton.game_ms.repositories.ItemRepository;
import com.misiontic_hackaton.game_ms.repositories.UserAdentureRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAventureController {
    private final UserAdentureRepository userAdentureRepository;

    public UserAventureController(UserAdentureRepository userAdentureRepository) {
        this.userAdentureRepository = userAdentureRepository;
    }

    @PostMapping("/game")
    UserAdventure newAccount(@RequestBody UserAdventure userAdventure){
        return userAdentureRepository.save(userAdventure);
    }


}
