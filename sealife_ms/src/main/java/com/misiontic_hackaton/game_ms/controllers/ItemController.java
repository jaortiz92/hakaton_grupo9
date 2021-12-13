package com.misiontic_hackaton.game_ms.controllers;

import com.misiontic_hackaton.game_ms.models.Adventure;
import com.misiontic_hackaton.game_ms.models.Item;
import com.misiontic_hackaton.game_ms.repositories.AdventureRepository;
import com.misiontic_hackaton.game_ms.repositories.ItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @PostMapping("/items")
    Item newAccount(@RequestBody Item item){

        return itemRepository.save(item);
    }

    @GetMapping("/items/all")
    List<Item> getProducts (){
        return itemRepository.findAll();
    }

}
