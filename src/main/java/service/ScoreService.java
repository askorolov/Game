package service;

import java.util.Map;

/**
 * Created by Людмила on 04.02.2017.
 */
public interface ScoreService {
    Integer updateScore(String id, int score);

    Map getAllPlayersScores();
}
