/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aury
 */
public class TEST {
public static void main(String[] args) {
 int[] vector1 = new int[6];
        int[] vector2 = new int[6];

        // Solicitar al usuario que ingrese los valores para el vector1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los valores para el vector1:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            vector1[i] = scanner.nextInt();
        }

        // Solicitar al usuario que ingrese los valores para el vector2
        System.out.println("Ingrese los valores para el vector2:");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            vector2[i] = scanner.nextInt();
        }

        // Crear la matriz y llenarla con los valores de los vectores
        int[][] matrizValores = new int[3][4];
        int indiceVector1 = 0;
        int indiceVector2 = 0;
        for (int i = 0; i < matrizValores.length; i++) {
            for (int j = 0; j < matrizValores[i].length; j++) {
                if (indiceVector1 < vector1.length) {
                    matrizValores[i][j] = vector1[indiceVector1];
                    indiceVector1++;
                } else {
                    matrizValores[i][j] = vector2[indiceVector2];
                    indiceVector2++;
                }
            }
        }

        // Imprimir la matriz resultante
        System.out.println("Matriz de valores:");
        for (int i = 0; i < matrizValores.length; i++) {
            for (int j = 0; j < matrizValores[i].length; j++) {
                System.out.print(matrizValores[i][j] + "\t");
            }
            System.out.println();
        }

        // Realizar la multiplicación y mostrar los resultados
        System.out.println("Multiplicación:");
        for (int i = 0; i < vector1.length; i++) {
            int resultado = vector1[vector1.length - 1 - i] * vector2[i];
            System.out.println(resultado);
        }
    }
}


        //Jose Luis Narvaez
        //Narvaez Luiz Jose
        //jlnouasiresvaez
        // que de la opcion de modificar de las 3 
        // Generar las tres versiones del nombre
//   Scanner sc =new Scanner(System.in);
//   
//    String nombreING = " ";
//        System.out.println(" INGRESA NAME");
//        nombreING=sc.nextLine();
//        while (true) { 
//            System.out.println("HOLA, INGRESA JOSE LUIZ NARVAEZ:");
//            nombreING = sc.nextLine();
//            
//            if (nombreING.equalsIgnoreCase("JOSE LUIZ NARVAEZ")) {
//                System.out.println("-------------------------");
//                break; 
//            } else {
//                System.out.println("Por favor, ingresa el nombre correcto.");
//            }
//        }
//        String[] tipoNombre = imprimirNombres(nombreING);
//        
//       
//        for (int i = 0; i < tipoNombre.length; i++) {
//            System.out.println("Nombre " + (i + 1) + ": " + tipoNombre[i]);
//        }
//        
//  
//        System.out.print("Name a cambiar 1,2,3: ");
//        int opcion = sc.nextInt();
//        sc.nextLine();
//        
//        
//        if (opcion >= 1 && opcion <= 3) {
//             System.out.print("Ingrese el nuevo name: ");
//            String modificacion = sc.nextLine();
//            
//          
//            tipoNombre[opcion - 1] = modificacion;
//            
//            System.out.println("-------------------------");
//            for (int i = 0; i < tipoNombre.length; i++) {
//                System.out.println("Nombre " + (i + 1) + ": " + tipoNombre[i]);
//            }
//        } else {
//            System.out.println("ERROR");
//        }
//        
//        sc.close();
//    }
//    
//   
//    private static String[] imprimirNombres(String nombre) { //metodo estatico tomo como argumento un String nombre y devuelve un arreglo de cadenas
//        String[] imprimirNom = new String[3];
//        
//        imprimirNom[0] = mezclaNombres(nombre);
//  
//        imprimirNom[1] = mezclarNombres(nombre);
//      
//        imprimirNom[2] = nombre;
//        return imprimirNom;
//    }
//    
//    
//    private static String mezclaNombres(String nombre) {
//        String res = "";//CADENA DE TEXTO VACIA PARA ALMACENAR LA RESPUESTA;
//        int inicioPalabra = 0; //Inicializa un indice que esta en 0
//        for (int i = 0; i < nombre.length(); i++) {
//            if (nombre.charAt(i) == ' ') { //Verifica si el caracter actual es un espacio en blanco,lo que indica el final de una palabra.
//                String palabra = nombre.substring(inicioPalabra, i);//substring es un método en Java utilizado para extraer una parte específica de una cadena de texto. Toma uno o dos parámetros
//                if (!res.isEmpty()) {//isEmpty() se utiliza en Java para verificar si una cadena de texto está vacía, es decir, si no contiene ningún caracter. Este método devuelve true si la cadena está vacía y fals
//                    res = palabra + " " + res;
//                } else {
//                    res = palabra;//
//                }
//                inicioPalabra = i + 1;//Actualiza el índice inicioPalabra para apuntar al siguiente caracter después del espacio en blanco.
//            } else if (i == nombre.length() - 1) {// Verifica si el caracter actual es el último caracter de la cadena nombre.
//                String palabra = nombre.substring(inicioPalabra);
//                res = palabra + " " + res;
//            }
//        }
//        return res;//Devuelve la cadena resultante después de mezclar las palabras en el nombre original en orden inverso.
//    }
//
//    
//        private static String mezclarNombres(String nombre) {
//        char[] letras = nombre.toCharArray();//El método toCharArray() se utiliza en Java para convertir una cadena 
//        int longitud = letras.length;        //e texto en un arreglo de caracteres. Devuelve un arreglo que 
//        for (int i = 0; i < longitud / 2; i++) {  //contiene todos los caracteres de la cadena en el mismo orden en que aparecen en la cadena original.
//            char temp = letras[i];
//            letras[i] = letras[longitud - 1 - i];
//            letras[longitud - 1 - i] = temp;
//        }
//        return new String(letras);
//    }
//}
//        Scanner sc = new Scanner(System.in);
//        System.out.println("INGRESA LA PRIMERA CADENA:");
//        String cadena1 = sc.nextLine();
//        System.out.println("INGRESE LA SEGUNDA CADENA:");
//        String cadena2 = sc.nextLine();
//        System.out.println("INGRESE LA TERCERA CADENA:");
//        String cadena3 = sc.nextLine();
//
//        System.out.println("INSERTE EL ORDEN EN EL QUE DESEA QUE SE IMPRIMAN LAS CADENAS:");
//        System.out.println("1. " + cadena1 + "  " + "2." + cadena2 + "  " + "3." + cadena3);
//        //System.out.println(" Ingrese el primer numero");
//        int num1 = sc.nextInt();
//        //System.out.println("Ingrese el segundo num");
//        int num2 = sc.nextInt();
//        // System.out.println("Ingrese el tercer num");
//        int num3 = sc.nextInt();
//        System.out.println("-----------------------");
//
//        if (num1 == 1) {
//            System.out.print(cadena1 + " ");
//        } else if (num1 == 2) {
//            System.out.print(cadena2 + " ");
//        } else if (num1 == 3) {
//            System.out.print(cadena3 + " ");
//        }
//
//        if (num2 == 1) {
//            System.out.print(cadena1 + " ");
//        } else if (num2 == 2) {
//            System.out.print(cadena2 + " ");
//        } else if (num2 == 3) {
//            System.out.print(cadena3 + " ");
//        }
//
//        if (num3 == 1) {
//            System.out.print(cadena1);
//        } else if (num3 == 2) {
//            System.out.print(cadena2);
//        } else if (num3 == 3) {
//            System.out.print(cadena3);
//        }
//        System.out.println("\n");
//        cadena1 = remplazo(cadena1);
//        cadena2 = remplazo(cadena2);
//        cadena3 = remplazo(cadena3);
//
//        System.out.println(cadena1 + " " + cadena2 + " " + cadena3);
//        System.out.println("DESEAS MODIFICAR ALGUNA(si/no)");
//        String res = sc.next();
//        if (res.equalsIgnoreCase("si")) {
//            System.out.println("ESCOJA LA CADENA A MODIFICAR (1, 2, 3):");
//            int cadenaModifi = sc.nextInt();
//            sc.nextLine();
//            System.out.println("INGRESE LA NUEVA CADENA:");
//            String nuevaCadena = sc.nextLine();
//           
//            if (cadenaModifi == 1) {
//                cadena1 = nuevaCadena;
//            } 
//             if (cadenaModifi == 2) {
//                cadena2 = nuevaCadena;
//            } 
//              if (cadenaModifi == 3) {
//                cadena3 = nuevaCadena;
//            }
//        } else if (res.equalsIgnoreCase("no")) {
//            System.out.println("ADIOS:)");
//        } else {
//            System.out.println("error");
//        }
//
//        // Imprimimos las cadenas actualizadas
//        System.out.println("CADENAS ACTUALIZADAS:");
//        System.out.println("---------------------");
//        cadena1 = remplazo( cadena1);
//        cadena2 = remplazo( cadena2);
//        cadena3 = remplazo( cadena3);
//        ////////////////////////////////
//        System.out.print("1." + cadena1+" ");
//        System.out.print("2." + cadena2+" ");
//        System.out.print("3." + cadena3+"\n");
//
//    }
//
//   public static String remplazo(String cadena) {
//    char[] caracteres = cadena.toCharArray(); 
//    for (int i = 0; i < caracteres.length; i++) {
//        if (caracteres[i] == 'a') {
//            caracteres[i] = 'x'; 
//        }
//    }
//    StringBuilder nuevaCadena = new StringBuilder();
//    for (char caracter : caracteres) {
//        nuevaCadena.append(caracter);
//    }
//
//    return nuevaCadena.toString(); 
//    
//}
//}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// cedena y vector y sawue el resultado en un vector saltandose uno j1s2o3e 
//asi luego dar un valor a cada letra y se multiple con el nuemro que sigue el resultado tambien se almacene en un vector
//
        //)   Scanner sc=new Scanner(System.in);
//        System.out.println("INGRESE UNA CADENA DE TEXTO SIN ESPACIOS:");
//        String cadena1=sc.nextLine();
//        System.out.print("INGRESE EL TAMANO DEL VECTOR: ");
//        int tamaño = sc.nextInt();
//         List<Object> datosMezclados = new ArrayList<>();
//
//        int cadenaNueva = 0;
//        for (int i = 0; i < tamaño; i++) {
//            if (cadenaNueva < cadena1.length()) {
//                datosMezclados.add(cadena1.charAt(cadenaNueva++));
//            }
//            if (i < tamaño) {
//                System.out.print("PON VALORES" + i + " del vector: ");
//                datosMezclados.add(sc.nextInt());
//            }
//        }
//        
//        System.out.println("-------------------------------------");
//        System.out.println("DATOS MEZCLADOS:");
//        for (Object dato : datosMezclados) {
//            System.out.print(dato + " ");
//            
//        }
//         int multiplicacion = 1;
//       for (int i = 0; i < cadena1.length(); i++) {
//           System.out.println("\n");
//            System.out.println("INGRESE VALORES PARA LAS LETRAS:" + cadena1.charAt(i) + "': ");
//            int valor = sc.nextInt();
//            datosMezclados.add(valor);
//             multiplicacion *= valor;
//        }
//       datosMezclados.add(multiplicacion);
//        System.out.println("\n");
//        
//        System.out.println("-------------------------------------");
//        System.out.println("DATOS ACTUALIZADOS:");
//        for (Object dato : datosMezclados) {
//            System.out.println("\n");
//            System.out.print(dato + " ");
//        }
      



