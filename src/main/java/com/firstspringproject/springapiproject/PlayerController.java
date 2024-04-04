package com.firstspringproject.springapiproject;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

     @PostMapping("/delete-player/{id}")
    public ResponseEntity<String> deletePlayer(@PathVariable Integer id){
        boolean updated = repo.deletePlayer(id);
        if (updated) {
            return ResponseEntity.ok("Player with " + id  + " deleted successfully");
        } else {
            return new ResponseEntity<>("Player with ID " + id + " not found", HttpStatus.NOT_FOUND);
        }
    }

}
