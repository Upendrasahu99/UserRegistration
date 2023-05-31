package com.bridgelebz;

import java.util.regex.Pattern;

public class CheckDetail extends UserDetail {

    public boolean checkFirstName(){
        return Pattern.matches("[A-Z][a-z]{2,}",getFirstName());
    }
    public boolean checkLastName(){
        return Pattern.matches("[A-Z][a-z]{2,}",getLastName());
    }
    public boolean checkEmail(){ //doubt
        return Pattern.matches("[a-z0-9].[a-z]?@[a-z].[co].[in]?",getEmail());
    }
}
