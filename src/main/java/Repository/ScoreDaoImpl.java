package Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Людмила on 04.02.2017.
 */
public class ScoreDaoImpl implements ScoreDao {
    HashMap<String, Integer> scores = new HashMap<String, Integer>();

    public Integer updateScore(String id, int score) {
        if (scores.containsKey(String.valueOf(id))) {
            Integer oldScore = scores.get(String.valueOf(id));
            return scores.put(String.valueOf(id), oldScore + score);
        } else {
            return scores.put(String.valueOf(id), score);
        }


    }

    public Map<String, Integer> getUsersScores() {
        return scores;
    }

    public void setScores(HashMap<String, Integer> scores) {
        this.scores = scores;
    }
}
