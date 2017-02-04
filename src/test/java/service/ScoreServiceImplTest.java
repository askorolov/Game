package service;

import Service.ScoreService;
import Service.ScoreServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Людмила on 04.02.2017.
 */
public class ScoreServiceImplTest {

    ScoreService scoreService;

    @Test
    public void updateScore() {
        scoreService = new ScoreServiceImpl();
        Assert.assertNull(scoreService.updateScore(String.valueOf(1), 10));
        Assert.assertEquals(String.valueOf(10), String.valueOf(scoreService.updateScore(String.valueOf(1), 20)));
    }

    @Test
    public void getAllPlayersScores() {
        scoreService = new ScoreServiceImpl();
        scoreService.updateScore(String.valueOf(1), 10);
        scoreService.updateScore(String.valueOf(2), 20);
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 10);
        map.put("2", 20);
        Assert.assertEquals(map, scoreService.getAllPlayersScores());
    }


}
