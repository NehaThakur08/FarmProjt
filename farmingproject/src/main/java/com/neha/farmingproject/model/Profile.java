package com.neha.farmingproject.model;



public class Profile   {

    public String name;
    public String email;
    public String age;
    public String state;
    public String city;


    public Profile() {
    }



    public Profile(int id, String name, String email, String age, String state, String city) {

        this.name = name;
        this.email = email;
        this.age = age;
        this.state = state;
        this.city = city;

    }

    @Override
    public String toString() {
        String message = "Name: "+name+"\nEmail: "+email+"\nAge: "+age+ "\nState: "+state+"\nCity: "+city+ "\n";

        return message;
    }
}
