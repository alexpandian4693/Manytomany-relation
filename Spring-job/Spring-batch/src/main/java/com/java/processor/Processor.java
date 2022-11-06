package com.java.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.java.model.Player;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<Player, Player> {

    private static final Map<String, String> NAMES =
            new HashMap<>();

    public Processor() {
    	NAMES.put("001", "Alex");
    	NAMES.put("002", "MSD");
    	NAMES.put("003", "RAINA");
    }

    @Override
    public Player process(Player player) throws Exception {
        String namecode = player.getName();
        String name = NAMES.get(namecode);
        player.setName(name);
        player.setTime(new Date());
        System.out.println(String.format("Converted from [%s] to [%s]", namecode, name));
        return player;
    }
}
