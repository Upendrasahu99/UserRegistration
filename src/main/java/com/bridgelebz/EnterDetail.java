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
        user1.setEmail("adn@sahu");
        user1.displayValidEmail();
    }
}
