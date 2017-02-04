package domain;

/**
 * Created by Людмила on 04.02.2017.
 */
public class Scores {
    int id;
    int score;

    public Scores(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Scores)) return false;

        Scores scores = (Scores) o;

        return getId() == scores.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}