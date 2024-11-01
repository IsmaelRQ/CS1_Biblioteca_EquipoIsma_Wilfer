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

    protected void decreaseCurrentQuantity() {
        if (currentQuantity > 0) {
            currentQuantity--;
        }
    }

    protected void increaseCurrentQuantity() {
        if (currentQuantity < registeredQuantity) {
            currentQuantity++;
        }
    }

    public abstract void loan();

    public abstract void returnMaterial();

    public abstract void renew();
}
