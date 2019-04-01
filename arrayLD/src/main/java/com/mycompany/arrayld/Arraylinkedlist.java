/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrayld;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author 
 */
public class Arraylinkedlist {
    
     static LinkedList<String> planeta;
     
     public static void main(String[] args) { 
         
        System.out.println("NOTA: El primer elemento de la lista empieza en 0\n\n");  
        //LinkedList planeta = new LinkedList();
        
        planeta = new LinkedList<>();      
        
        planeta.add("Mercurio");
        planeta.add("Venus");
        planeta.add("Tierra");
        planeta.add("Marte");
        planeta.add("Jupiter");
        planeta.add("Saturno");
        planeta.add("Urano");
        planeta.add(7,"Neptuno");
        print("Planetas: ");
        
        
        //primer elemento de la lista
        planeta.remove(2);
        print("Borra el elemento 2 [Tierra] de la lista: ");
        
        planeta.remove("Saturno");
        print("Borra el Saturno de la lista: ");
        
        planeta.removeFirst();
        print("Borra el primer elemento de la lista:");
        
        planeta.removeLast();
        print("Borra el ultimo elemento de la lista: ");
        
       planeta.set(0, "un planeta");
       print("Cambia la primera posicion por otro nombre: ");
       }
       
       public static void print(String text){
       System.out.println(text);         
       
       for(int x=0; x<planeta.size(); x++){
           System.out.println(planeta.get(x));
       }
       System.out.println("Tamaño de la Lista " + planeta.size());      
       System.out.println("\n");
    }
         
    }