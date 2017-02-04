package service;

import repository.ScoreDao;
import repository.ScoreDaoImpl;

import java.util.Map;

/**
 * Created by Людмила on 04.02.2017.
 */
public class ScoreServiceImpl implements ScoreService {
    ScoreDao sDao = new ScoreDaoImpl();

    public Integer updateScore(String id, int score) {
        return sDao.updateScore(id, score);

    }

    public Map<String, Long> getAllPlayersScores() {
        return sDao.getUsersScores();
    }
}
