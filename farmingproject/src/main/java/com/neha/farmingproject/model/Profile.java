package com.neha.farmingproject.model;



public class Profile   {

    public int id;
    public String name;
    public String email;
    public String password;
    public String age;
    public String docId;


    public Profile() {
    }

    public Profile(int id, String name, String email, String password, String age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public Profile(int id, String name, String email, String password, String age, String docId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.docId = docId;
    }

    @Override
    public String toString() {
        String message = "Name: "+name+"\nEmail: "+email+"\nAge: "+age+"\nDocId: "+docId;

        return message;
    }
}
