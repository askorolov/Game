package repository;

import java.util.Map;

/**
 * Created by Людмила on 04.02.2017.
 */
public interface ScoreDao {
    Integer updateScore(String id, int score);

    Map getUsersScores();
}
