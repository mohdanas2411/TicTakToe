package com.example.repository;

import com.example.domain.Game;
import com.example.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by patrycja on 15.05.16.
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findOneByUserName(String userName);
}
