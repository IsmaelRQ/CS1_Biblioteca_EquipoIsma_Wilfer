package com.mycompany.biblioteca_primera;

public class Course extends Material {

    public Course(String identifier, String title, int registeredQuantity) {
        super(identifier, title, registeredQuantity);
    }

    @Override
    public void loan() {

        if (getCurrentQuantity() > 0) {

            System.out.println("Curso prestado: " + getTitle());
        } else {
            System.out.println("No hay copias disponibles del curso: " + getTitle());
        }
    }

    @Override
    public void returnMaterial() {
 
        System.out.println("Curso devuelto: " + getTitle());
    }

    @Override
    public void renew() {
        System.out.println("El curso " + getTitle() + " ha sido renovado.");
    }
}
