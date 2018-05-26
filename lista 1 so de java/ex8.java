/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1java;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner e = new Scanner (System.in);
  int n1, n2, n3, produto,media, soma, maior, menor;

System.out.println ("Digite o primeiro numero");
n1 = e.nextInt ();
System.out.println ("Digite o segundo numero");
n2 = e.nextInt ();
System.out.println ("Digite o terceiro numero");
n3 = e.nextInt ();

soma = n1 + n2 + n3;
System.out.println ("Soma:"+soma);
produto = n1 * n2 * n3;
System.out.println ("Multiplicacao:"+produto);
media = n1 * n2 * n3/3;
System.out.println ("media:"+ media);

        if (n1 > n2){
            System.out.println ("Maior:"+n1);
        }
        if (n1 > n3){
            System.out.println ("Maior:"+n2);
        }
        if (n2 > n1){
            System.out.println ("Maior:"+n3);
        }
        if (n2 > n3){
            System.out.println ("Maior:"+n1);
        }
        if (n3 > n2){
            System.out.println ("Maior:"+n2);
        }
        if (n3 > n1){
            System.out.println ("Maior:"+n3);
        }   
            
        if (n1 < n2){
            System.out.println ("Menor:"+n1);
        }   
        if (n1 < n3){
            System.out.println ("Menor:"+n2);
        }
        if (n2 < n1){
            System.out.println ("Menor:"+n3);
        }
        if (n2 < n3){
            System.out.println ("Menor:"+n1);
        }
        if (n3 < n2){
            System.out.println ("Menor:"+n2);
        }
        if (n3 < n1){
            System.out.println ("Menor:"+n3);
}}}