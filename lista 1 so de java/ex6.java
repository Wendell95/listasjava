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
public class ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
int n1, n2, soma, mult, diferenca, quociente;
System.out.println("Digite o primeiro numero");
n1 = e.nextInt();
System.out.println("Digite o segundo numero");
n2 = e.nextInt();
soma = n1 + n2;
System.out.println ("Resultado:"+soma);
mult = n1 * n2;
System.out.println ("Resultado:"+mult);
diferenca = n1 - n2;
System.out.println ("Resultado:"+diferenca);
quociente = n1/n2;
System.out.println("Resultado:"+quociente);
}}
    
    

