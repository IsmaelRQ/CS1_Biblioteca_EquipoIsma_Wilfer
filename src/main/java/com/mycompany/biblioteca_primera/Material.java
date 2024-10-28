package com.mycompany.biblioteca_primera;

public abstract class Material {
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

    public String getTitle() {
        return title;
    }

    public int getRegisteredQuantity() {
        return registeredQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public abstract void loan();
    public abstract void returnMaterial();
    public abstract void renew();
}
