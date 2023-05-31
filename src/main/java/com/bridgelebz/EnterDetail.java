package com.bridgelebz;

public class EnterDetail {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Display user1 = new Display();
        user1.setFirstName("Rohan");
        user1.checkFirstName();
        user1.displayValidFirstName();
        user1.setLastName("Jha");
        user1.checkLastName();
        user1.displayValidLastName();
        user1.setEmail("abc.xyz@sdf.co.in");
        user1.displayValidEmail();
        user1.setMobileNumber("91 9845673245");
        user1.displayValidMobNumber();
        user1.setPassword("3485093286254");
        user1.displayValidPassword();
    }
}
