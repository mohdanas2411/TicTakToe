package com.example.repository;

import com.example.domain.Game;
import com.example.enums.GameStatus;
import com.example.enums.GameType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by pdybka on 30.05.16.
 */
@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
    List<Game> findByGameTypeAndGameStatus(GameType GameType, GameStatus GameStatus);
    List<Game> findByGameStatus(GameStatus gameStatus);
}
