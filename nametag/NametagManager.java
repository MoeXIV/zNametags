package com.shawckz.nametags.nametag;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 360 on 23/06/2015.
 */
public class NametagManager {

    private static Map<String, NametagPlayer> players = new HashMap<>();

    public static void setup(Player p){
        if(!players.containsKey(p.getName())){
            NametagPlayer nametagPlayer = new NametagPlayer(p);
            players.put(p.getName(),nametagPlayer);
        }
    }

    public static NametagPlayer getPlayer(Player p){
        return players.get(p.getName());
    }

    public static boolean contains(Player p){
        return players.containsKey(p.getName());
    }

    public static void remove(Player p){
        if(contains(p)){
            players.remove(p.getName());
        }
    }

    public static void clear(){
        players.clear();
    }

}
