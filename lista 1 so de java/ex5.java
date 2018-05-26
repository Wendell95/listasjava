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
public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);

int n1, n2, n3, n4;

System.out.println("Digte o primeiro numero");
n1 = entrada.nextInt ();
System.out.println("Digte o segundo numero");
n2 = entrada.nextInt ();
System.out.println("Digte o terceiro numero");
n3 = entrada.nextInt ();
System.out.println("Digte o quarto numero");
n4 = entrada.nextInt ();

System.out.println ("Os números são:"+n1 +n2 +n3 +n4);
System.out.print("Os numeros sao:"+n1 +n2 +n3 +n4);
System.out.printf ("Os números sao %d:" ,n1 ,n2 ,n3 ,n4);


    }}