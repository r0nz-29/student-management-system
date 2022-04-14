package com.raunit.studentmanagementsystem.models;

public class Formdata {
    private String name;
    private String address;
    private String email;
    private String contact;

    public Formdata() {

    }

    public Formdata(String name, String email, String address, String contact) {
        this.setName(name);
        this.setEmail(email);
        this.setAddress(address);
        this.setContact(contact);
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Formdata [address=" + address + ", contact=" + contact + ", email=" + email + ", name=" + name + "]";
    }
}
