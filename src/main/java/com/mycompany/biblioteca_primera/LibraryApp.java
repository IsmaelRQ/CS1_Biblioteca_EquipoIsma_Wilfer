package com.mycompany.biblioteca_primera;

public class LibraryApp {

    public static void main(String[] args) {
        Library library = new Library();

        Person student = new Person("123456789", "Juan", "Perez", "Estudiante");
        Person teacher = new Person("987654321", "Paula", "Correa", "Docente");

        library.registerPerson(student);
        library.registerPerson(teacher);

        Material book = new Material("PO123", "Polimorfismo", 7);
        Material course = new Material("HE234", "Clases de Herencias", 5);

        library.registerMaterial(book);
        library.registerMaterial(course);

        library.loanMaterial("PO123");
        library.returnMaterial("PO123");
        library.renewMaterial("PO123");

        library.loanMaterial("HE234");
        library.returnMaterial("HE234");
        library.renewMaterial("HE234");
        
        library.removePerson("123456789");
        
    }
}
