package com.mycompany.biblioteca_primera;

<<<<<<< HEAD

interface Registrable {
    void displayInfo();
}

public class Person implements Registrable {
    private String idNumber;
    private String firstName;
    private String lastName;
    private String role;
=======
public class Person {
    private String idNumber;
    private String firstName;
    private String lastName;
    private String role; 
>>>>>>> 284040ecbdaa8e54401915380f6c5194f52854fc

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
<<<<<<< HEAD
        return firstName + " " + lastName + " (" + role + ")";
    }


    @Override
    public void displayInfo() {
        System.out.println("ID: " + idNumber + ", Nombre: " + firstName + " " + lastName + ", Rol: " + role);
=======
        return firstName + " " + lastName + " " + role;
>>>>>>> 284040ecbdaa8e54401915380f6c5194f52854fc
    }
}
