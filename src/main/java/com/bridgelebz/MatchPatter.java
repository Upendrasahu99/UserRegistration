package com.bridgelebz;

import java.util.regex.Pattern;

public class MatchPatter extends UserDetail {

    public boolean checkFirstName(){
        return Pattern.matches("[A-Z][a-z]{2,}",getFirstName());
    }

    public boolean checkLastName(){
        return Pattern.matches("[A-Z][a-z]{2,}",getLastName());
    }

    public boolean checkEmail(){ //doubt
        return Pattern.matches("[a-z0-9]+[.]?+[a-z]?+@+[a-z]+[.]+[co]+[.]+[in]?",getEmail());
    }

    public boolean checkMobileNUmber(){

        return Pattern.matches("[91]+[\\s]+[1-9]+[0-9]{9}",getMobileNumber());
    }

    public boolean checkPassword(){ //doubt
        return Pattern.matches("^.{8,}$",getPassword());

        // ^ and $ is used for starting and ending
    }
}
