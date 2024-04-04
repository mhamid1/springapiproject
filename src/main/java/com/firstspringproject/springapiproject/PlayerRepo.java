package com.firstspringproject.springapiproject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



public class PlayerRepo implements IRepository<Player> {

   
    
   private Map<Integer, Player> data;

   public PlayerRepo(){
    this.data = new HashMap<>();
   }

  @Override
  public void save(Player p){
    this.data.put(p.getId(), p);
  }

@Override
public Collection<Player> getAll() {
  
        return data.values();
    }


    @Override
    public boolean deletePlayer(Integer id){
        Player player = data.get(id);
        if(player != null){
            data.values().removeIf(t -> id.equals(t.getId()));
            return true;
        }
        else{
            return false;
        }
    }

    
}
