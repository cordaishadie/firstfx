package edu.guilford;

public class Individual {
    // three attrubutes for the name, email, and phone
    private String name;
    private String email;
    private String phone;

    // constructor that gives default values to the attributes
    public Individual() {
        this.name = "John Doe";
        this.email = "jdoe@guilford.edu";
        this.phone = "555-555-5555";
    }

    // constructor that takes three String parameters
    public Individual(String name, String email, String phone) {
        // set the name attribute
        this.name = name;
        // set the email attribute
        this.email = email;
        // set the phone attribute
        this.phone = phone;
    }

    // getters and setters for the name, email, and phone attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // set the name attribute
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // set the email attribute
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        // set the phone attribute
        this.phone = phone;
    }

    // toString method
    @Override
    public String toString() {
        return "Individual{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

