/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ex6 {

    /**
     * @wendell rodrigues viana /CPD: 42785
     */
    public static void main(String[] args) {
        //Entrada de dados
        Scanner e = new Scanner(System.in);
        //Declaracao de variaveis
        int n1, n2, n3, nu, x;
        double s, d, m;
        //Entrar com os valores
        System.out.println("Escreva quantas vezes deseja fazer");
        System.out.println("A soma, a subtração e a divisão de tres numeros em ordem crescente");
        x = e.nextInt();
        nu = 0;
        //Ler os valores
            while (nu == x){ 
            System.out.println("Primeiro numero");
            n1= e.nextInt();
            System.out.println("Segundo numero");
            n2 = e.nextInt();
            System.out.println("Terceiro numero");
            n3 = e.nextInt();
            //Efetuar os calculos
                if (n1 < n2 && n2 < n3 && n3 > n1) {
                    s = n1 + n2 + n3;
                    d = n1 + n2 + n3/3;
                    m = n1 * n2 * n3;
                
                //Mostrar a soma, subtracao e multiplicacao na tela e 
                //caso os valores entrem em ordem decrescente encerrar
                //o programa
          System.out.println("Resultado da soma é:"+s);
          System.out.println("Resultado da multiplicacao é:"+m);
          System.out.println("Resultado da divisao é:"+d);
                }
          else{
             System.out.println("Os numeros não estao em ordem crescente ");
                  //contar os valores digitados
                  nu = nu + 1;
                
            
            }}}}
            