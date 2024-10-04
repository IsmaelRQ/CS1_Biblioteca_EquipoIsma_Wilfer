package com.mycompany.biblioteca_primera;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Persona> personas;
    private List<Material> materiales;

    public Biblioteca() {
        personas = new ArrayList<>();
        materiales = new ArrayList<>();
    }

    public void registrarPersona(Persona persona) {
        personas.add(persona);
        System.out.println("Persona registrada: " + persona);
    }

    public void eliminarPersona(String cedula) {
        personas.removeIf(persona -> persona.getCedula().equals(cedula));
        System.out.println("Persona con cédula " + cedula + " eliminada.");
    }

    public void registrarMaterial(Material material) {
        materiales.add(material);
        System.out.println("Material registrado: " + material.getTitulo());
    }

    public void prestarMaterial(String identificador) {
        for (Material material : materiales) {
            if (material.getIdentificador().equals(identificador)) {
                material.prestar();
                return;
            }
        }
        System.out.println("Material no encontrado.");
    }

    public void devolverMaterial(String identificador) {
        for (Material material : materiales) {
            if (material.getIdentificador().equals(identificador)) {
                material.devolver();
                return;
            }
        }
        System.out.println("Material no encontrado.");
    }

    public void renovarMaterial(String identificador) {
        for (Material material : materiales) {
            if (material.getIdentificador().equals(identificador)) {
                material.renovar();
                return;
            }
        }
        System.out.println("Material no encontrado.");
    }
}
