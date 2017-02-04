package dao;

import repository.StringsDao;
import repository.StringsDaoImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Людмила on 04.02.2017.
 */
public class StringDaoImplTest {
    String string1 = "А роза упала на лапу азора";
    String string2 = "Это не палиндром";
    String string3 = "А роза упала на лапу Азора";
    StringsDao dao;

    @Test
    public void save() {
        dao = new StringsDaoImpl();
        Assert.assertNull(dao.save("1", string1));
        Assert.assertEquals(string2, dao.save("1", string2).get(1));
    }

    @Test
    public void isUnique() {
        dao = new StringsDaoImpl();
        Assert.assertTrue(dao.isUnique("1", string1));
        dao.save("1", string1);
        Assert.assertTrue(dao.isUnique("1", string2));
        Assert.assertFalse(dao.isUnique("1", string1));
        Assert.assertFalse(dao.isUnique("1", string3));
    }
}
