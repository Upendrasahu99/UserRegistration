package com.bridgelebz;

public class Display extends CheckDetail{
    public  void displayValidFirstName(){
        if(checkFirstName() == true){
            System.out.println("First name is valid");
        }else {
            System.out.println("First name not valid");
        }
    }
    public void displayValidLastName(){
        if(checkLastName() == true){
            System.out.println("Last name is valid");
        }else {
            System.out.println("Last name is not valid");
        }
    }
}
