/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;


import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author Aury
 */
public class ESTUDIANTE implements Serializable { 
    private String cedula;
    private String nombre;
     private String apellido;
    private int edad;
    private String grado;
    private String paralelo;

    public ESTUDIANTE() {
    }

    public ESTUDIANTE(String cedula, String nombre, String apellido, int edad, String grado,String paralelo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.grado = grado;
        this.paralelo = paralelo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
      public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }
   // Sobrescribir equals y hashCode para evitar duplicados en el Set
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ESTUDIANTE that = (ESTUDIANTE) o;
        return cedula.equals(that.cedula);
    }
// Sobrescribir el método hashCode para generar un código hash basado en la cédula
    @Override
    public int hashCode() {
        return Objects.hash(cedula); // Devuelve el código hash basado en la cédula
    }
}