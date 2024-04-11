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
    private int tamanio;
    
    public Pila(int tamanio){
        arreglo = new int[tamanio];
        tope = -1;
        this.tamanio = tamanio;
        
    }
    
    public void push(int nro){
        if (!pilaLlena()) {
            tope ++;
            arreglo[tope] = nro;
            
        }
        else System.out.println("El arreglo esta completo, no se puede insertar el nro.");
    }
    
    public int pop(){
        int retorno;
        if (!pilaVacia()) {
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
    
    public void invierteSimple(){
        Pila temp1 = new Pila(tamanio);
        Pila temp2 = new Pila(tamanio);
        
        if (!pilaVacia()) {
            
            while (!this.pilaVacia()) {                
                temp1.push(this.pop());
            }
            while (!temp1.pilaVacia()) { 
                temp2.push(temp1.pop());
            }
            while (!temp2.pilaVacia()) { 
                this.push(temp2.pop());
            }
        }
    }
    
    public void invierteEficiente(){
        Pila temp = new Pila(tamanio);
        int valor;
        
        for (int i = 0; i <= this.tope; i++) {
            
            valor = this.verElemento();
            this.pop();
            
            while((this.tope-i) >=0){
                temp.push(this.pop());
            }
        
            this.push(valor);
            
            while(!temp.pilaVacia()) {
                this.push(temp.pop());
            }
        }
    }
    
    public void verPila(){
        for (int i = 0; i <= this.tope; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
