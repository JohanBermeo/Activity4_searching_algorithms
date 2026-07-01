package co.edu.udistrital.controller;

import co.edu.udistrital.view.View;
import co.edu.udistrital.model.*;

public class Controller {
    private final View view;
    
    public Controller() {
        this.view = new View();
    }
    
    public void run() {
        boolean salida = false;
        
        while(!salida) {
            view.mostrarMenu();
            int opcion = view.leer();
            
            switch(opcion) {
                case 1, 2, 3, 4:
                    // Pasamos la opción elegida para saber qué algoritmo ejecutar más adelante
                    correrCaso(opcion); 
                    break; // Evita que pase directo a la opción 5
                case 5:
                    System.out.println("Saliendo del programa.");
                    salida = true;
                    break;
                default:
                    System.out.println("Opción inválida, revise las opciones del menu.");
                    break;
            }
        }
    }
    
    // Modificado para recibir el tipo de algoritmo
    private void correrCaso(int opcionAlgoritmo) {
        view.mostrarTamaños();
        int opcion = view.leer();
        int n = 0;
        
        switch(opcion) {
            case 1: n = 4000; break;
            case 2: n = 40000; break;
            case 3: n = 400000; break;
            case 4: n = 4000000; break;
            case 5: n = 40000000; break;
            default:
                System.out.println("La opción escogida es inválida.");
                return; // Rompe el flujo si la opción no es válida
        }
        
        // Pasamos tanto el tamaño como el algoritmo seleccionado
        escogerCaso(n, opcionAlgoritmo);
    }
    
    // Modificado para recibir el tipo de algoritmo
    private void escogerCaso(int n, int opcionAlgoritmo) {
        view.mostrarCasos();
        int opcion = view.leer();
        int[] arreglo = null;
        
        switch(opcion) {
            case 1:
                arreglo = GenerarArreglo.generarArregloOrdenado(n);
                break;
            case 2:
                arreglo = GenerarArreglo.generarArregloInvertido(n);
                break;
            case 3:
                arreglo = GenerarArreglo.generarArregloAleatorio(n);
                break;
            default:
                System.out.println("La opción escogida es inválida.");
                return; // Rompe el flujo si la opción no es válida
        }
        
        // Si el arreglo se generó correctamente, ejecutamos el algoritmo correspondiente
        if (arreglo != null) {
            ejecutarAlgoritmo(n, arreglo, opcionAlgoritmo);
        }
    }
    
    private void ejecutarAlgoritmo(int n, int[] arreglo, int opcionAlgoritmo) {
        // Declaramos una variable del tipo de la interfaz
        MetodoOrdenamiento algoritmo = null;

        switch(opcionAlgoritmo) {
            case 1:
                System.out.println("Ejecutando Bubble Sort...");
                algoritmo = new BubbleSort(); // Instanciamos el objeto
                break;
            case 2:
                System.out.println("Ejecutando Shell Sort...");
                algoritmo = new ShellSort();
                break;
            case 3:
                System.out.println("Ejecutando Radix Sort...");
                algoritmo = new RadixSort();
                break;
            case 4:
                System.out.println("Ejecutando Quick Sort...");
                algoritmo = new QuickSort();
                break;
            default:
                System.out.println("Algoritmo no reconocido.");
                return;
        }

        // Ejecución polimórfica
        if (algoritmo != null) {
        	long startTime = System.nanoTime();
            algoritmo.ordenar(arreglo);
            long endTime = System.nanoTime();
            
            long tiempo = (endTime-startTime);
            
            view.mostrarResultados(n, tiempo);
        }
    }
}
