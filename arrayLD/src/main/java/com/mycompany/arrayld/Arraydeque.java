/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
48872046+LiliethQuinc@users.noreply.github.com
 */
package com.mycompany.arrayld;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author 
 */
public class Arraydeque {
   
      
    
    static ArrayDeque<Integer> deque;
    
    public static void main(String[] args) {
        // Crea un array vacio
        deque = new ArrayDeque<>();
        
        // usa metodo add() para agregar elementos 
        deque.add(46);
        deque.add(28);
        deque.add(96);
        deque.add(20);        
        print("ArrayDeque");
                
        deque.addFirst(99);
        print("Se agrega elemento ["+99+"] al principio");

        deque.addLast(77);
        print("Se agrega elemento ["+77+"] al final");
  
        //obtiene primer elemento de la cola
        int a = deque.getFirst();        
        //obtiene ultimo elemento de la cola
        int b = deque.getLast();        
        print("Primer elemento ["+a+"] .:. Ultimo elemento ["+b+"]");
        
        //elimina elementos
        deque.removeFirst();
        deque.removeLast();
        print("Elimina primer y ultimo elemento");        
        
        //obtiene primer elemento de la cola
        a = deque.peekFirst();
        //obtiene ultimo elemnto de la cola
        b = deque.peekLast();
        print("Primer elemento ["+a+"] Ultimo elemento ["+b+"]");
        
        //elimina y obtiene el primer elemento de la cola
        a = deque.pop();
        print("elimina Primer elemento ["+a+"]");
        
        deque.push(69);
        print("agrega elemento ["+69+"]");
        
        deque.removeLastOccurrence(98);
        print("elimina elemento ["+98+"]");
        
        System.out.println("Tamaño de la cola " + deque.size());        
    }
    
    
    public static void print(String text){
        System.out.println(text);
        deque.stream().forEach((number) -> {
            System.out.print("| " + number + " |");
        });
        System.out.println("\n");
    }   
}

