package com.bridgelebz;

public class UserDetail {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public  void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setMobileNumber(String  mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
}
