package repository;

import java.util.ArrayList;

/**
 * Created by Людмила on 04.02.2017.
 */
public interface StringsDao {
    ArrayList save(String id, String string);

    Boolean isUnique(String id, String string);
}
