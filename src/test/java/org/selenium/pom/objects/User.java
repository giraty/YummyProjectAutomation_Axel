package org.selenium.pom.objects;

public class User {
    private String name;
    private String phoneNumber;
    private String email;

    public User(){}

    public User(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;

    }
    public User(String name, String phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
