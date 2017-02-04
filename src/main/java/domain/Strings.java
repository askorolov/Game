package domain;

import java.util.List;

/**
 * Created by Людмила on 04.02.2017.
 */
public class Strings {
    int id;
    List<String> strings;

    public Strings(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Strings)) return false;

        Strings strings = (Strings) o;

        return getId() == strings.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
