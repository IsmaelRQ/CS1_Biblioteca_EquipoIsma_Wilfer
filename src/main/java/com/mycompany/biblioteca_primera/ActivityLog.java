package com.mycompany.biblioteca_primera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActivityLog implements JOptions {
    private final List<String> logs;

    public ActivityLog() {
        logs = new ArrayList<>();
    }

    public void addLog(String activity) {
        logs.add(activity);
        System.out.println("Actividad registrada: " + activity);
    }

    public void displayLogs() {
        System.out.println("Historial de Actividades:");
        for (String log : logs) {
            System.out.println(log);
        }
    }

    @Override
    public void showOptions() {
        System.out.println("Opciones:");
        System.out.println("1. Agregar actividad");
        System.out.println("2. Mostrar historial de actividades");
        System.out.println("3. Salir");
    }

    @Override
    public void selectOption(int option) {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.print("Ingrese la actividad a registrar: ");
                String activity = scanner.nextLine();
                addLog(activity);
                break;
            case 2:
                displayLogs();
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
        }
    }
}
