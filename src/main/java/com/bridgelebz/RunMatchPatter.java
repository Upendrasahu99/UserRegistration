package com.bridgelebz;

public class RunMatchPatter extends MatchPatter {
    public void runCheckFirstName() {
        try {
            if (checkFirstName() == false) {
                throw new InvalidDataException("Invalid first name");
            }
        } catch (InvalidDataException e) {
            System.out.println(e);
        }
    }

    public void runCheckLastName() {
        try {
            if (checkLastName() == false) {
                throw new InvalidDataException("Invalid last name");
            }
        } catch (InvalidDataException e) {
            System.out.println(e);
        }
    }

    public void runCheckEmail() {
        try {
            if (checkEmail() == false) {
                throw new InvalidDataException("Invalid email");
            }
        } catch (InvalidDataException e) {
            System.out.println(e);
        }
    }
    public void runCheckMobileNumber(){
        try {
            if (checkMobileNUmber() == false) {
                throw new InvalidDataException("Invalid mobile number");
            }
        } catch (InvalidDataException e) {
            System.out.println(e);
        }
    }
    public void runCheckPassword(){
        try {
            if (checkPassword() == false) {
                throw new InvalidDataException("Invalid password");
            }
        } catch (InvalidDataException e) {
            System.out.println(e);
        }
    }
}

class InvalidDataException extends Exception {
    InvalidDataException(String message) {
        super(message);
    }
}