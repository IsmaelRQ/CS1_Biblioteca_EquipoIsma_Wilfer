package com.mycompany.biblioteca_primera;

public class LibraryApp {

    public static void main(String[] args) {
        Library library = new Library();

<<<<<<< HEAD

        Person student = new Person("123456789", "Juan", "Perez", "Estudiante");
        Person teacher = new Person("987654321", "Paula", "Correa", "Docente");


        library.registerPerson(student);
        library.registerPerson(teacher);


        Material book = new Book("PO123", "Polimorfismo", 7);
        Material course = new Course("HE234", "Clases de Herencias", 5);

=======
        Person student = new Person("123456789", "Juan", "Perez", "Estudiante");
        Person teacher = new Person("987654321", "Paula", "Correa", "Docente");

        library.registerPerson(student);
        library.registerPerson(teacher);

        Material book = new Material("PO123", "Polimorfismo", 7);
        Material course = new Material("HE234", "Clases de Herencias", 5);
>>>>>>> 284040ecbdaa8e54401915380f6c5194f52854fc

        library.registerMaterial(book);
        library.registerMaterial(course);

<<<<<<< HEAD

        library.showMaterials();


=======
>>>>>>> 284040ecbdaa8e54401915380f6c5194f52854fc
        library.loanMaterial("PO123");
        library.returnMaterial("PO123");
        library.renewMaterial("PO123");

        library.loanMaterial("HE234");
        library.returnMaterial("HE234");
        library.renewMaterial("HE234");
        
        library.removePerson("123456789");
        
<<<<<<< HEAD

        library.showMaterials();
=======
>>>>>>> 284040ecbdaa8e54401915380f6c5194f52854fc
    }
}
