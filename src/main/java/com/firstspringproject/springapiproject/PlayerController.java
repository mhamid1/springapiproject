package com.firstspringproject.springapiproject;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Player")
public class PlayerController {

    PlayerRepo repo;

    public PlayerController(){
        repo = new PlayerRepo();
    }

    @GetMapping("/all")
    public Collection<Player> getaPlayers(){
        return repo.getAll();
    }
    
    @PostMapping("/add")
    public String createPlayer(@RequestBody Player p){
        repo.save(p);
        return "Player saved";
    }
}
