package dao;

import repository.ScoreDao;
import repository.ScoreDaoImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Людмила on 04.02.2017.
 */
public class ScoreDaoImplTest {


    ScoreDao scoreDao;

    @Test
    public void updateScore() {
        scoreDao = new ScoreDaoImpl();
        Assert.assertNull(scoreDao.updateScore("1", 10));
        Assert.assertEquals("10", String.valueOf(scoreDao.updateScore("1", 10)));
        Assert.assertEquals("20", String.valueOf(scoreDao.updateScore("1", 0)));
    }

    @Test
    public void getUsersScores() {
        scoreDao = new ScoreDaoImpl();
        scoreDao.updateScore("1", 10);
        scoreDao.updateScore("2", 20);
        Map<String, Integer> scores = new HashMap<>();
        scores.put("1", 10);
        scores.put("2", 20);
        Assert.assertEquals(scores, scoreDao.getUsersScores());
    }
}
