package domain;

/**
 * Created by Людмила on 04.02.2017.
 */
public class UserDTO {
    private User user;
    private int score;

    public UserDTO(User user, int score) {
        this.user = user;
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
