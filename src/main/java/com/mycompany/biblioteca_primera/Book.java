package com.mycompany.biblioteca_primera;

public class Book extends Material implements JOptions {

    public Book(String identifier, String title, int registeredQuantity) {
        super(identifier, title, registeredQuantity);
    }

    @Override
    public void loan() {
        if (getCurrentQuantity() > 0) {
            System.out.println("Libro prestado: " + getTitle());
            decreaseCurrentQuantity();
        } else {
            System.out.println("No hay copias disponibles del libro: " + getTitle());
        }
    }

    @Override
    public void returnMaterial() {
        System.out.println("Libro devuelto: " + getTitle());
        increaseCurrentQuantity();
    }

    @Override
    public void renew() {
        System.out.println("El libro " + getTitle() + " ha sido renovado.");
    }

    @Override
    public void showOptions() {
        System.out.println("Opciones para el libro " + getTitle() + ":");
        System.out.println("1. Prestar libro");
        System.out.println("2. Devolver libro");
        System.out.println("3. Renovar libro");
        System.out.println("4. Salir");
    }

    @Override
    public void selectOption(int option) {
        switch (option) {
            case 1:
                loan();
                break;
            case 2:
                returnMaterial();
                break;
            case 3:
                renew();
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
        }
    }
}
