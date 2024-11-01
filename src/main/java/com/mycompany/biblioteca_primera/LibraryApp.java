package com.mycompany.biblioteca_primera;

import javax.swing.JOptionPane;

public class LibraryApp {

    public static void main(String[] args) {
        Library library = new Library();
        ActivityLog activityLog = new ActivityLog();
        boolean running = true;

        while (running) {
            String menu = "Seleccione una opción:\n" +
                          "1. Registrar Persona\n" +
                          "2. Registrar Material\n" +
                          "3. Prestar Material\n" +
                          "4. Devolver Material\n" +
                          "5. Renovar Material\n" +
                          "6. Eliminar Persona\n" +
                          "7. Mostrar Materiales\n" +
                          "8. Mostrar Historial de Actividades\n" +
                          "9. Salir";

            String choice = JOptionPane.showInputDialog(menu);
            
            switch (choice) {
                case "1":
                 
                    String idNumber = JOptionPane.showInputDialog("Ingrese la cédula:");
                    String firstName = JOptionPane.showInputDialog("Ingrese el nombre:");
                    String lastName = JOptionPane.showInputDialog("Ingrese el apellido:");
                    String role = JOptionPane.showInputDialog("Ingrese el rol (Estudiante/Docente):");
                    Person person = new Person(idNumber, firstName, lastName, role);
                    library.registerPerson(person);
                    JOptionPane.showMessageDialog(null, "Persona registrada: " + person);
                    activityLog.addLog("Registrada persona: " + person);
                    break;

                case "2":
                  
                    String materialType = JOptionPane.showInputDialog("Ingrese el tipo de material (Libro/Curso):");
                    String identifier = JOptionPane.showInputDialog("Ingrese el ID del material:");
                    String title = JOptionPane.showInputDialog("Ingrese el título del material:");
                    int registeredQuantity = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad registrada:"));

                    Material material;
                    if ("Libro".equalsIgnoreCase(materialType)) {
                        material = new Book(identifier, title, registeredQuantity);
                    } else if ("Curso".equalsIgnoreCase(materialType)) {
                        material = new Course(identifier, title, registeredQuantity);
                    } else {
                        JOptionPane.showMessageDialog(null, "Tipo de material no válido.");
                        continue; 
                    }
                    library.registerMaterial(material);
                    JOptionPane.showMessageDialog(null, "Material registrado: " + material.getTitle());
                    activityLog.addLog("Registrado material: " + material.getTitle());
                    break;

                case "3":
                   
                    String loanMaterialId = JOptionPane.showInputDialog("Ingrese el ID del material para prestar:");
                    library.loanMaterial(loanMaterialId);
                    activityLog.addLog("Material prestado: " + loanMaterialId);
                    break;

                case "4":
                  
                    String returnMaterialId = JOptionPane.showInputDialog("Ingrese el ID del material para devolver:");
                    library.returnMaterial(returnMaterialId);
                    activityLog.addLog("Material devuelto: " + returnMaterialId);
                    break;

                case "5":
                  
                    String renewMaterialId = JOptionPane.showInputDialog("Ingrese el ID del material para renovar:");
                    library.renewMaterial(renewMaterialId);
                    activityLog.addLog("Material renovado: " + renewMaterialId);
                    break;

                case "6":
                   
                    String removePersonId = JOptionPane.showInputDialog("Ingrese la cédula de la persona a eliminar:");
                    library.removePerson(removePersonId);
                    activityLog.addLog("Persona eliminada con cédula: " + removePersonId);
                    break;

                case "7":
                
                    library.showMaterials();
                    break;

                case "8":
                    
                    activityLog.displayLogs();
                    break;

                case "9":
                    
                    running = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        }

        JOptionPane.showMessageDialog(null, "Saliendo de la aplicación. ¡Gracias!");
    }
}
