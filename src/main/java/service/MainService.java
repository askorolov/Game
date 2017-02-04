package service;

import domain.User;
import domain.UserDTO;

import java.util.List;

/**
 * Created by Людмила on 04.02.2017.
 */
public interface MainService {

    int calculateScore(User user, String string);

    void updateUserScores(User user, String string);

    void updateStrings(User user, String string);

    List<UserDTO> getBestPlayers();

}
