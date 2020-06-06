package com.traveloffice;

import java.util.Objects;

public class User {

    private String email;
    private String name;
    private String surname;
    private String address;
    private String phone;

    public User(String email, String name, String surname, String address, String phone) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        User e = (User) o;
        return (this.email.equals(e.email)) && (this.name.equals(e.name)) && (this.surname.equals(e.surname))
                && (this.address.equals(e.address)) && (this.phone.equals(e.phone));
    }

    @Override
    public String toString() {
        return name + " " + surname + " : " + email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name, surname, address, phone);
    }

    public void showDetails() {
        System.out.println("========== USER DETAILS ==========");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("E-mail: " + email);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
