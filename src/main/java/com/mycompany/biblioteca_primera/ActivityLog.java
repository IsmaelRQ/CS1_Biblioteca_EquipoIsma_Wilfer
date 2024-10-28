package com.mycompany.biblioteca_primera;

import java.util.ArrayList;
import java.util.List;

public class ActivityLog {
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
}
