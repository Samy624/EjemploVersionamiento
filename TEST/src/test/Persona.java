/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package test;

import java.awt.List;

/**
 *
 * @author Aury
 */
public class Persona{

    private int idPersona;

    private String nombre;

    private int altura;

 

    public Persona(int idPersona, String nombre, int altura) {

        this.idPersona = idPersona;

        this.nombre = nombre;

        this.altura = altura;}

 
public int getAltura() {
        // Validar que la altura no sea negativa
        if (altura < 0) {
            // Si la altura es negativa, devolver 0 o cualquier otro valor predeterminado
            return 0;
        }
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override

    public String toString() {

        return "Persona-> ID: "+idPersona+" Nombre: "+nombre+" Altura: "+altura+"\n";

    }

}