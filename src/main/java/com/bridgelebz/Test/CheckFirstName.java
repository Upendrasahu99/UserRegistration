package com.bridgelebz.Test;

import com.bridgelebz.MatchPatter;
import org.junit.Assert;
import org.junit.Test;

public class CheckFirstName {
    @Test
    public void checkFirstNameTest1() {
        MatchPatter matchPatter = new MatchPatter();
        matchPatter.setFirstName("Ram");
        Assert.assertTrue(matchPatter.checkFirstName());
    }

    @Test
    public void checkLastNameTest2() {
        MatchPatter matchPatter = new MatchPatter();
        matchPatter.setLastName("Dube");
        Assert.assertTrue(matchPatter.checkLastName());
    }

    @Test
    public void checkMobileNumberTest(){
        MatchPatter matchPatter = new MatchPatter();
        matchPatter.setMobileNumber("91 2335484583");
        Assert.assertTrue(matchPatter.checkMobileNUmber());
    }

    @Test
    public void checkEmailTest(){
        MatchPatter matchPatter = new MatchPatter();
        matchPatter.setEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(matchPatter.checkEmail());
    }
    @Test
    public void checkPasswordTest(){
        MatchPatter matchPatter = new MatchPatter();
        matchPatter.setPassword("328971538357");
        Assert.assertTrue(matchPatter.checkPassword());
    }
}

