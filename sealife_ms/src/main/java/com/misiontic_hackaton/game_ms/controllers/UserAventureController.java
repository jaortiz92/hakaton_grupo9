package com.misiontic_hackaton.game_ms.controllers;

import com.misiontic_hackaton.game_ms.models.Item;
import com.misiontic_hackaton.game_ms.models.UserAdventure;
import com.misiontic_hackaton.game_ms.repositories.ItemRepository;
import com.misiontic_hackaton.game_ms.repositories.UserAdentureRepository;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

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

    @GetMapping("/game/{login}")
    List<UserAdventure> findIdByCategory (@PathVariable String login){
        List<UserAdventure> games4Login = null;
        List<UserAdventure> games = userAdentureRepository.findAll();
        if(games != null && !games.isEmpty()){
            games4Login = games.stream()
                    .filter(prod -> login.equals(prod.getLogin()))
                    .filter(prod -> 3 !=(prod.getStatusAdventure()))
                    .collect(Collectors.toList());
        }
        return games4Login;
    }

    @GetMapping("/gamestatus/{adventure}/{login}")
    UserAdventure ua4login4adventure (@PathVariable String login,@PathVariable String adventure){
        UserAdventure ua = new UserAdventure();
        List<UserAdventure> games4Login = null;
        List<UserAdventure> games = userAdentureRepository.findAll();
        if(games != null && !games.isEmpty()) {
            games4Login = games.stream()
                    .filter(prod -> login.equals(prod.getLogin()))
                    .filter(prod -> adventure.equals(prod.getNameAdventure()))
                    .collect(Collectors.toList());

            int ultimoDato = games4Login.size();
            if (ultimoDato > 0) {
                --ultimoDato;
            }
            ua = games4Login.get(ultimoDato);
        }
        return ua;
    }

    @GetMapping("/game/scores")
        List<Map<String,Integer>> topScores(){
        List<Map<String,Integer>> scores = new ArrayList<>();
            List<UserAdventure> games = userAdentureRepository.findAll();
            if(games != null && !games.isEmpty()) {
                Set<String> usuarios = new HashSet<>(games.size());
                games.stream().filter(p -> usuarios.add(p.getLogin())).collect(Collectors.toList());
                for (String user : usuarios) {
                    Set<String> aventuras = new HashSet<>(games.size());
                    List<UserAdventure> games4Login = games.stream()
                                    .filter(prod -> user.equals(prod.getLogin()))
                                    .collect(Collectors.toList());
                    games4Login.stream().filter(p -> aventuras.add(p.getNameAdventure())).collect(Collectors.toList());
                    if(aventuras != null && !aventuras.isEmpty()){
                        int contador =0;
                        for (String aventura : aventuras) {
                            List<UserAdventure> lastGame4Login = games.stream()
                                    .filter(prod -> user.equals(prod.getLogin()))
                                    .filter(prod -> aventura.equals(prod.getNameAdventure()))
                                    .collect(Collectors.toList());

                            int ultimoDato = games4Login.size();
                            if (ultimoDato > 0) {
                                --ultimoDato;
                            }
                            contador = contador +  lastGame4Login.get(ultimoDato).getScoreAdventure();
                        }
                        Map<String,Integer> scoreUser = new HashMap<>();
                        scoreUser.put(user,contador);
                        scores.add(scoreUser);
                    }
                }

            }

        return scores;
    }
}
