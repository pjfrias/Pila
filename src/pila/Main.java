/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pila;

public class Main {

    public static void main(String[] args) {
     
        Pila pila = new Pila(10);
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        pila.push(7);
        pila.push(8);
        pila.push(9);
        pila.push(10);
        pila.push(11);
        pila.push(12);
        
        pila.verPila();
        
        System.out.println("pila llena ="+pila.pilaLlena());
        System.out.println("pila vacia ="+pila.pilaVacia());
        
        System.out.println("ultimo elemento ="+pila.verElemento());
        
//        for (int i = 0; i < 10; i++) {
//            System.out.println(pila.pop());
//        }
        
        System.out.println("pila llena ="+pila.pilaLlena());
        System.out.println("pila vacia ="+pila.pilaVacia());
        
        Pila pila2 = new Pila(10);
        Pila pila3 = new Pila(10);
        
        pila.invierteEficiente(pila2);
        pila.verPila();
    }

}
