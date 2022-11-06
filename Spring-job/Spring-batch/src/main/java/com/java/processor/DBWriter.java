package com.java.processor;

import com.java.model.Player;
import com.java.repo.UserRepository;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Player> {

    private UserRepository userRepository;

    @Autowired
    public DBWriter (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void write(List<? extends Player> player) throws Exception{
        System.out.println("Data Saved for Players: " + player);
        userRepository.saveAll(player);
    }
}
