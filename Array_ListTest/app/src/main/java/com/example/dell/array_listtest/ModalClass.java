package com.example.dell.array_listtest;

/**
 * Created by DELL on 9/13/2018.
 */

public class ModalClass {
    public String id;
    public String firstname;
    private String lastname;
    public int age;

    public ModalClass() {
    }

    public ModalClass(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public ModalClass(String id, String firstname, String lastname, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
