package com.mycompany.biblioteca_primera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library implements JOptions {
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
        boolean removed = people.removeIf(person -> person.getIdNumber().equals(id));
        if (removed) {
            System.out.println("Persona con cédula " + id + " eliminada.");
        } else {
            System.out.println("Persona con cédula " + id + " no encontrada.");
        }
    }

    public void registerMaterial(Material material) {
        materials.add(material);
        System.out.println("Material registrado: " + material.getTitle());
    }

    public void eliminarMaterial(String identifier) {
        boolean removed = materials.removeIf(material -> material.getIdentifier().equals(identifier));
        if (removed) {
            System.out.println("Material con identificador " + identifier + " eliminado.");
        } else {
            System.out.println("Material con identificador " + identifier + " no encontrado.");
        }
    }

    public void showMaterials() {
        System.out.println("Lista de materiales:");
        for (Material material : materials) {
            System.out.println("- " + material.getTitle() + " (ID: " + material.getIdentifier() + ")");
        }
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

    @Override
    public void showOptions() {
        System.out.println("Opciones de la Biblioteca:");
        System.out.println("1. Registrar persona");
        System.out.println("2. Eliminar persona");
        System.out.println("3. Registrar material");
        System.out.println("4. Eliminar material");
        System.out.println("5. Prestar material");
        System.out.println("6. Devolver material");
        System.out.println("7. Renovar material");
        System.out.println("8. Mostrar materiales");
        System.out.println("9. Salir");
    }

    @Override
    public void selectOption(int option) {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.print("Ingrese el nombre de la persona: ");
                String name = scanner.nextLine();
                System.out.print("Ingrese la cédula de la persona: ");
                String idNumber = scanner.nextLine();
                registerPerson(new Person(name, idNumber)); // Suponiendo que Person tiene un constructor que acepta nombre y cédula.
                break;
            case 2:
                System.out.print("Ingrese la cédula de la persona a eliminar: ");
                String idToRemove = scanner.nextLine();
                removePerson(idToRemove);
                break;
            case 3:
                System.out.print("Ingrese el título del material: ");
                String title = scanner.nextLine();
                System.out.print("Ingrese el identificador del material: ");
                String identifier = scanner.nextLine();
                System.out.print("Ingrese la cantidad registrada del material: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                registerMaterial(new Material(identifier, title, quantity)); // Suponiendo que Material tiene este constructor.
                break;
            case 4:
                System.out.print("Ingrese el identificador del material a eliminar: ");
                String idMaterial = scanner.nextLine();
                eliminarMaterial(idMaterial);
                break;
            case 5:
                System.out.print("Ingrese el identificador del material a prestar: ");
                String idLoan = scanner.nextLine();
                loanMaterial(idLoan);
                break;
            case 6:
                System.out.print("Ingrese el identificador del material a devolver: ");
                String idReturn = scanner.nextLine();
                returnMaterial(idReturn);
                break;
            case 7:
                System.out.print("Ingrese el identificador del material a renovar: ");
                String idRenew = scanner.nextLine();
                renewMaterial(idRenew);
                break;
            case 8:
                showMaterials();
                break;
            case 9:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
        }
    }
}
