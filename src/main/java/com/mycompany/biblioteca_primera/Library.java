package com.mycompany.biblioteca_primera;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Person> people;
    private final List<Material> materials;

    public Library() {
        people = new ArrayList<>();
        materials = new ArrayList<>();
    }

    public void registerPerson(Person person) {
        people.add(person);
        System.out.println("Persona registrada: " + person);
    }

    public void removePerson(String id) {
        people.removeIf(person -> person.getIdNumber().equals(id));
        System.out.println("Persona con cedula " + id + " eliminada.");
    }

    public void registerMaterial(Material material) {
        materials.add(material);
        System.out.println("Material registrado: " + material.getTitle());
    }

    public void loanMaterial(String identifier) {
        for (Material material : materials) {
            if (material.getIdentifier().equals(identifier)) {
                material.loan();
                return;
            }
        }
        System.out.println("Material no encontrado.");
    }

    public void returnMaterial(String identifier) {
        for (Material material : materials) {
            if (material.getIdentifier().equals(identifier)) {
                material.returnMaterial();
                return;
            }
        }
        System.out.println("Material no encontrado.");
    }

    public void renewMaterial(String identifier) {
        for (Material material : materials) {
            if (material.getIdentifier().equals(identifier)) {
                material.renew();
                return;
            }
        }
        System.out.println("Material no encontrado.");
    }
}
