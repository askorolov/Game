package service;

import domain.User;
import domain.UserDTO;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Людмила on 04.02.2017.
 */
public class MainServiceImpl implements MainService {


    private StringsService stringsService = new StringsServiceImpl();
    private UserService userService = new UserServiceImpl();
    private ScoreService scoreService = new ScoreServiceImpl();

    public void setStringsService(StringsService stringsService) {
        this.stringsService = stringsService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setScoreService(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    public int calculateScore(User user, String string) {
        if (stringsService.isUnique(String.valueOf(user.getId()), string) && stringsService.checkPalindrome(string)) {
            return stringsService.countSymbols(string);
        }
        return 0;
    }

    public void updateUserScores(User user, String string) {
        int score = calculateScore(user, string);
        scoreService.updateScore(String.valueOf(user.getId()), score);

    }

    public void updateStrings(User user, String string) {
        stringsService.saveString(String.valueOf(user.getId()), string);
    }

    public List<UserDTO> getBestPlayers() {
        Map<String, Integer> allPlayersScores = scoreService.getAllPlayersScores();

        List<UserDTO> collect = allPlayersScores.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .limit(5)
                .map(x -> new UserDTO(userService.getUser(x.getKey()), x.getValue()))
                .collect(Collectors.toList());
        Collections.reverse(collect);
        return collect;
    }
}
