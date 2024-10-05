package com.mycompany.biblioteca_primera;

public class Material {
    private String identifier;
    private String title;
    private int registeredQuantity;
    private int currentQuantity;

    public Material(String identifier, String title, int registeredQuantity) {
        this.identifier = identifier;
        this.title = title;
        this.registeredQuantity = registeredQuantity;
        this.currentQuantity = registeredQuantity;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRegisteredQuantity() {
        return registeredQuantity;
    }

    public void setRegisteredQuantity(int registeredQuantity) {
        this.registeredQuantity = registeredQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void loan() {
        if (currentQuantity > 0) {
            currentQuantity--;
            System.out.println("Material prestado: " + title + ". Cantidad restante: " + currentQuantity);
        } else {
            System.out.println("No hay copias disponibles de " + title);
        }
    }

    public void returnMaterial() {
        if (currentQuantity < registeredQuantity) {
            currentQuantity++;
            System.out.println("Material devuelto: " + title + ". Cantidad disponible: " + currentQuantity);
        }
    }

    public void renew() {
        System.out.println("El material " + title + " ha sido renovado.");
    }
}
