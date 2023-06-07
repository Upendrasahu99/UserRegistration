package com.bridgelebz;

import org.junit.Assert;
import org.junit.Test;
import com.bridgelebz.MatchPatter;
import com.bridgelebz.UserDetail;

public class DemoTesting {
//    @Test
//    public void checkFirstNameTest1() {//doubt
//        System.out.println("tt");
//        MatchPatter matchPatter = new MatchPatter();
//        matchPatter.setFirstName("Ram");
//        System.out.println(matchPatter.checkFirstName());
////        Assert.assertEquals("Ram", matchPatter.getFirstName());
//        Assert.assertTrue(matchPatter.checkFirstName());
//
//    }
    @Test
    public void checkFirstName() {
        DemoTesting demoTest = new DemoTesting();
        int result = demoTest.sum();
        int a = 10;
        Assert.assertEquals(a,result);
    }

    public int sum() {
        return 10;
    }
}
