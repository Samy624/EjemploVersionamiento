/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Aury
 */

import test.Interfase;
import test.Persona;
    import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class InterfaseImpl implements Interfase {
     // Declaración de las estructuras de datos
    private List<Persona> arrayList = new ArrayList<>();
    private List<Persona> linkedList = new LinkedList<>();
    private List<Persona> vector = new Vector<>();
    private Stack<Persona> stack = new Stack<>();
      // Implementación del método de la interfaz para añadir un elemento
// Añade la persona a todas las estructuras de datos
    @Override
    public void addElement(Persona persona) {
        arrayList.add(persona);
        linkedList.add(persona);
        vector.add(persona);
        stack.push(persona);
    }
 // Implementación del método de la interfaz para obtener los elementos
    @Override
    public List<String> getElements() {
         // Crea una lista para almacenar las representaciones en cadena de las estructuras de datos
         // Añade las representaciones en cadena de cada estructura de datos a la lista
        List<String> allElements = new ArrayList<>();
        allElements.add("ArrayList: " + arrayList.toString());
        allElements.add("LinkedList: " + linkedList.toString());
        allElements.add("Vector: " + vector.toString());
        allElements.add("Stack: " + stack.toString());
        return allElements;   // Retorna la lista con las representaciones en cadena
    }
    
    public void removeLastElement() {
        if (!arrayList.isEmpty() && !linkedList.isEmpty() && !vector.isEmpty() && !stack.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
            linkedList.remove(linkedList.size() - 1);
            vector.remove(vector.size() - 1);
            stack.pop();
        }
}
}

    

