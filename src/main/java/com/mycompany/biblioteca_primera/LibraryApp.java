package com.mycompany.biblioteca_primera;

import javax.swing.JOptionPane;

public class LibraryApp {

    public static void main(String[] args) {
        Library library = new Library();

      
        Person student = new Person("123456789", "Juan", "Perez", "Estudiante");
        Person teacher = new Person("987654321", "Paula", "Correa", "Docente");

        library.registerPerson(student);
        JOptionPane.showMessageDialog(null, "Persona registrada: " + student);
        
        library.registerPerson(teacher);
        JOptionPane.showMessageDialog(null, "Persona registrada: " + teacher);


        Material book = new Book("PO123", "Polimorfismo", 7);
        Material course = new Course("HE234", "Clases de Herencias", 5);

        library.registerMaterial(book);
        JOptionPane.showMessageDialog(null, "Material registrado: " + book.getTitle());

        library.registerMaterial(course);
        JOptionPane.showMessageDialog(null, "Material registrado: " + course.getTitle());

    
        library.showMaterials();


        String loanMaterialId = JOptionPane.showInputDialog("Ingrese el ID del material para prestar:");
        library.loanMaterial(loanMaterialId);

        String returnMaterialId = JOptionPane.showInputDialog("Ingrese el ID del material para devolver:");
        library.returnMaterial(returnMaterialId);

        String renewMaterialId = JOptionPane.showInputDialog("Ingrese el ID del material para renovar:");
        library.renewMaterial(renewMaterialId);

        String removePersonId = JOptionPane.showInputDialog("Ingrese la cédula de la persona a eliminar:");
        library.removePerson(removePersonId);
        
 
        JOptionPane.showMessageDialog(null, "Materiales actuales en la biblioteca:");
        library.showMaterials();


        library.displayActivityLog();
    }
}
