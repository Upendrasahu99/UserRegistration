package com.bridgelebz;

public class Display extends CheckDetail{
    public  void displayValidFirstName(){
        if(checkFirstName() == true){
            System.out.println("First name is valid");
        }else {
            System.out.println("First name not valid");
        }
    }
}
