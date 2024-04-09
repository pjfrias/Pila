/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author 54265
 */
public class Pila {
    private int[] arreglo;
    private int tope;
    
    public Pila(int tamanio){
        arreglo = new int[tamanio];
        tope = -1;
    }
    
    public void push(int nro){
        if (tope < arreglo.length-1) {
            tope ++;
            arreglo[tope] = nro;
            
        }
        else System.out.println("El arreglo esta completo, no se puede insertar el nro.");
    }
    
    public int pop(){
        int retorno;
        if (tope >= 0) {
           retorno = arreglo[tope];
           tope --;
           return retorno;
        }
        else {
            System.out.println("El arreglo se encuentra vacio");
            return -1;
        }
    }
    
    public boolean pilaVacia(){
        return (tope == -1);
    }
    
    public boolean pilaLlena(){
        return (tope == arreglo.length-1);
    }
    
    public int verElemento(){
        return arreglo[tope];
    }
    
    public void invierteSimple(Pila temp1, Pila temp2){
        if (!pilaVacia()) {
            
         for (int i = 0; i < arreglo.length; i++) {
                temp1.push(this.pop());
            }
            for (int i = 0; i < arreglo.length; i++) {
                temp2.push(temp1.pop());
            }
            for (int i = 0; i < arreglo.length; i++) {
                this.push(temp2.pop());
            }
        }
    }
    
    public void invierteEficiente(Pila temp){
        int valor;
        
        for (int i = 0; i <= this.tope; i++) {
            
            valor = this.verElemento();
            this.pop();
            
            while((this.tope-i) >=0){
                temp.push(this.pop());
            }
        
            this.push(valor);
            
            while(temp.tope>=0) {
                this.push(temp.pop());
            }
        }
    }
    
    public void verPila(){
        for (int i = 0; i <= arreglo.length-1; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
