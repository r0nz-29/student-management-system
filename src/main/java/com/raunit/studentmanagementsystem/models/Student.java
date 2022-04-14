package com.raunit.studentmanagementsystem.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("students")
public class Student {
    @Id
    private String id;

    private String name;
    private String email;
    private String address;
    private String contact;

    public Student() {

    }

    public Student(String name, String email, String address, String contact) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.contact = contact;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Student [address=" + address + ", contact=" + contact + ", email=" + email + ", id=" + id + ", name="
                + name + "]";
    }
}
