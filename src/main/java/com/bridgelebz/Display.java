package com.bridgelebz;

public class Display extends MatchPatter {
    public  void displayValidFirstName(){
        if(checkFirstName()){
            System.out.println("First name is valid");
        }else {
            System.out.println("First name not valid");
        }
    }
    public void displayValidLastName(){
        if(checkLastName()){
            System.out.println("Last name is valid");
        }else {
            System.out.println("Last name is not valid");
        }
    }
    public void displayValidEmail(){
        if(checkEmail()){
            System.out.println("Email is valid");
        }else {
            System.out.println("Email is not valid");
        }
    }
    public void displayValidMobNumber(){
        if(checkMobileNUmber() == true){
            System.out.println("Mobile number is valid");
        }
        else{
            System.out.println("Mobile number is not valid");
        }
    }
    public void displayValidPassword(){
        if(checkPassword() == true){
            System.out.println("Password is valid ");
        }else{
            System.out.println("Password is not valid");
        }
    }
}
