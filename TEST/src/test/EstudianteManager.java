/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

//import java.util.Set;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aury
 */
public class EstudianteManager {
    private Set<ESTUDIANTE> estudiantes;

    public EstudianteManager() {
        estudiantes = new HashSet<>();
    }

    public boolean addEstudiante(ESTUDIANTE estudiante) {
        return estudiantes.add(estudiante);
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (ESTUDIANTE estudiante : estudiantes) {
                writer.write(estudiante.getCedula() + "," + estudiante.getNombre() + "," +
                        estudiante.getApellido() + "," + estudiante.getEdad() + "," + estudiante.getGrado() + "," + estudiante.getParalelo());
                writer.newLine();
            }
            System.out.println("Estudiantes guardados en " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  public void loadFromFile(String filename) {
    estudiantes.clear();
    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            // Verificar que el número de partes sea correcto (6 en total)
            if (parts.length == 6) {
                try {
                    String cedula = parts[0];
                    String nombre = parts[1];
                    String apellido = parts[2];
                    int edad = Integer.parseInt(parts[3]);
                    String grado = parts[4];
                    String paralelo = parts[5];

                    // Crear el objeto ESTUDIANTE y añadirlo al conjunto
                    ESTUDIANTE estudiante = new ESTUDIANTE(cedula, nombre, apellido, edad, grado, paralelo);
                    estudiantes.add(estudiante);
                } catch (NumberFormatException e) {
                    System.err.println("Error de formato en la edad: " + e.getMessage() + " para la línea: " + line);
                }
            } else {
                System.err.println("Formato de línea incorrecto: " + line);
            }
        }
        System.out.println("Estudiantes cargados de " + filename);
    } catch (FileNotFoundException e) {
        System.out.println("Archivo no encontrado, iniciando con un conjunto vacío.");
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public void showEstudiantes() {
        for (ESTUDIANTE estudiante : estudiantes) {
            System.out.println(estudiante.getCedula() + " - " + estudiante.getNombre() + " " + estudiante.getApellido());
        }
    }
}