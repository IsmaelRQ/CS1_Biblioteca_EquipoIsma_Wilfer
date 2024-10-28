package com.mycompany.biblioteca_primera;

<<<<<<< HEAD
public abstract class Material {
=======
public class Material {
>>>>>>> 284040ecbdaa8e54401915380f6c5194f52854fc
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

<<<<<<< HEAD
=======
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

>>>>>>> 284040ecbdaa8e54401915380f6c5194f52854fc
    public String getTitle() {
        return title;
    }

<<<<<<< HEAD
=======
    public void setTitle(String title) {
        this.title = title;
    }

>>>>>>> 284040ecbdaa8e54401915380f6c5194f52854fc
    public int getRegisteredQuantity() {
        return registeredQuantity;
    }

<<<<<<< HEAD
=======
    public void setRegisteredQuantity(int registeredQuantity) {
        this.registeredQuantity = registeredQuantity;
    }

>>>>>>> 284040ecbdaa8e54401915380f6c5194f52854fc
    public int getCurrentQuantity() {
        return currentQuantity;
    }

<<<<<<< HEAD
    public abstract void loan();
    public abstract void returnMaterial();
    public abstract void renew();
=======
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
>>>>>>> 284040ecbdaa8e54401915380f6c5194f52854fc
}
