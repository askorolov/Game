package Service;


import Repository.StringsDao;
import Repository.StringsDaoImpl;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Людмила on 04.02.2017.
 */
public class StringsServiceImpl implements StringsService {
    private StringsDao sDao = new StringsDaoImpl();

    public boolean checkPalindrome(String string) {
        if (null != string && !string.equalsIgnoreCase("")) {
            string = string.replace(" ", "");
            string = string.toLowerCase();
            StringBuffer sb = new StringBuffer(string);
            StringBuffer sb1 = new StringBuffer(string).reverse();
            if (Objects.equals(sb.toString(), sb1.toString())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean isUnique(String id, String string) {
        return sDao.isUnique(id, string);
    }

    public int countSymbols(String string) {
        string = string.trim();
        return string.length();
    }

    public ArrayList saveString(String id, String string) {
        if (isUnique(id, string)) {
            return sDao.save(id, string);
        }
        return null;
    }
}
