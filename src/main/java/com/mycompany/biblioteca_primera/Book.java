package com.mycompany.biblioteca_primera;

public class Book extends Material {

    public Book(String identifier, String title, int registeredQuantity) {
        super(identifier, title, registeredQuantity);
    }

    @Override
    public void loan() {

        if (getCurrentQuantity() > 0) {

            System.out.println("Libro prestado: " + getTitle());
        } else {
            System.out.println("No hay copias disponibles del libro: " + getTitle());
        }
    }

    @Override
    public void returnMaterial() {

        System.out.println("Libro devuelto: " + getTitle());
    }

    @Override
    public void renew() {
        System.out.println("El libro " + getTitle() + " ha sido renovado.");
    }
}
