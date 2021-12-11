package com.misiontic_hackaton.game_ms.controllers;

import com.misiontic_hackaton.game_ms.models.Item;
import com.misiontic_hackaton.game_ms.repositories.AdventureRepository;
import com.misiontic_hackaton.game_ms.models.Adventure;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdventureController {

    private final AdventureRepository adventureRepository;

    public AdventureController(AdventureRepository adventureRepository) {
        this.adventureRepository = adventureRepository;
    }

    @PostMapping("/adventures")
    Adventure newAccount(@RequestBody Adventure adventure){

        return adventureRepository.save(adventure);
    }

    @GetMapping("/adventures/all")
    List<Adventure> getAdventures (){
        return adventureRepository.findAll();
    }
}
