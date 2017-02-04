package Service;

import java.util.ArrayList;

/**
 * Created by Людмила on 04.02.2017.
 */
public interface StringsService {
    boolean checkPalindrome(String string);

    boolean isUnique(String id, String string);

    int countSymbols(String string);

    ArrayList saveString(String id, String string);
}
