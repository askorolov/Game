package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Людмила on 04.02.2017.
 */
public class StringsDaoImpl implements StringsDao {
    private Map<String, ArrayList<String>> strings = new HashMap<String, ArrayList<String>>();

    public void setStrings(Map<String, ArrayList<String>> strings) {
        this.strings = strings;
    }

    public ArrayList save(String id, String string) {
        ArrayList<String> userStrings = strings.get(id);
        if (null != userStrings) {
            userStrings.add(string);
        } else {
            userStrings = new ArrayList();
            userStrings.add(string);
        }
        return strings.put(id, userStrings);
    }

    public Boolean isUnique(String id, String string) {
        ArrayList<String> userStrings;
        if (!strings.containsKey(id)) {
            userStrings = new ArrayList<String>();
            userStrings.add(string);
            strings.put(id, userStrings);
            return true;
        }
        userStrings = strings.get(id);
        for (String s : userStrings) {
            if (s.equalsIgnoreCase(string)) {
                return false;
            }
        }
        return true;
    }
}
