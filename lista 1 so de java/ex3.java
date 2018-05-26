/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1java;



/**
 *
 * @author PC
 */
public class ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int numero, x, y, z ;
       int num1 = 5467;
       numero = num1 % 10;
       x = (num1 % 100 - numero)/10;
       y = (num1 % 1000 - x - numero)/100;
       z = (num1 % 10000 - x - y - numero)/1000;
       
      
       
       System.out.println("Inversao:"+numero +x + y+z);   

    }}

    
    

