/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pila;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int tamanio;
        
        System.out.print("Ingrese el tamanio de la pila -->");
        tamanio = leer.nextInt();
        Pila pila = new Pila(tamanio);
        
        for (int i = 0; i < tamanio; i++) {
            pila.push(aleatorio.nextInt(100));
        }
        
        pila.verPila();
        
        System.out.println("pila llena ="+pila.pilaLlena());
        System.out.println("pila vacia ="+pila.pilaVacia());
        
        System.out.println("ultimo elemento ="+pila.verElemento());
        
//        for (int i = 0; i < tamanio; i++) {
//            System.out.println(pila.pop());
//        }
        
//        System.out.println("pila llena ="+pila.pilaLlena());
//        System.out.println("pila vacia ="+pila.pilaVacia());
// 
//        
        pila.invierteSimple();
        
//        pila.invierteEficiente();
        pila.verPila();
    }

}
