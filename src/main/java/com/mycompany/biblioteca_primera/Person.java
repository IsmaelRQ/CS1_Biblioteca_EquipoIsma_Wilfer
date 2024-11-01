package com.mycompany.biblioteca_primera;

interface Registrable {
    void displayInfo();
}

public class Person implements Registrable {
    private String idNumber;
    private String firstName;
    private String lastName;
    private String role;

    public Person(String idNumber, String firstName, String lastName, String role) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + role + ")";
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + idNumber + ", Nombre: " + firstName + " " + lastName + ", Rol: " + role);
    }
}
