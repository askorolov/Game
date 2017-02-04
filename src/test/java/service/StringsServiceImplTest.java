package service;

import Service.StringsService;
import Service.StringsServiceImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Людмила on 04.02.2017.
 */
public class StringsServiceImplTest {


    String string1 = "А роза упала на лапу азора";
    String string2 = "Это не палиндром";
    String string3 = "А роза упала на лапу Азора  ";
    private StringsService stringsService;

    @Test
    public void checkPalindrome() {
        stringsService = new StringsServiceImpl();
        Assert.assertTrue(stringsService.checkPalindrome(string1));
        Assert.assertFalse(stringsService.checkPalindrome(string2));
        Assert.assertTrue(stringsService.checkPalindrome(string3));

    }

    @Test
    public void countSymbols() {
        stringsService = new StringsServiceImpl();
        Assert.assertEquals(string1.length(), stringsService.countSymbols(string1));
        Assert.assertEquals(string2.length(), stringsService.countSymbols(string2));
        Assert.assertEquals(string3.trim().length(), stringsService.countSymbols(string3));
    }


}
