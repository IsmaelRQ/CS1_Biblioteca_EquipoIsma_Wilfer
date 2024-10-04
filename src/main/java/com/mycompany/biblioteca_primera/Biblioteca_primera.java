
package com.mycompany.biblioteca_primera;

public class Biblioteca_primera {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Persona estudiante = new Persona("123456789", "Juan", "Perez", "Estudiante");
        Persona docente = new Persona("987654321", "Paula", "Correa", "Docente");

        biblioteca.registrarPersona(estudiante);
        biblioteca.registrarPersona(docente);

        Material libro = new Material("PO123", "Polimorfismo", 7);
        Material revista = new Material("HE234", "Clases de Herencias", 5);

        biblioteca.registrarMaterial(libro);
        biblioteca.registrarMaterial(revista);

        biblioteca.prestarMaterial("PO123");
        biblioteca.devolverMaterial("PO123");
        biblioteca.renovarMaterial("PO123");

        biblioteca.prestarMaterial("HE234");
        biblioteca.devolverMaterial("HE234");
        biblioteca.renovarMaterial("HE234");
    }
}
