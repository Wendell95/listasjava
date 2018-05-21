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
public class ex9 {

    /**
     * @wendell rodrigues viana/ CPD: 42785
     */
    public static void main(String[] args) {
        //Entrada de dados
        Scanner e = new Scanner(System.in);
        //Declaração de variaveis
        int n, c, d;
        //Entrar com o numero
        System.out.println("Digite um numero");
        n=e.nextInt();
        //Quantos divisores o numero digitado tem
        c = n;
        d = 0;
        //Usar a estrutura repita..ate pra iniciar a 
        //contagem dos numeros primos a partir do 2
        //ja que o numero 1 e ele mesmo
               while (c < 1){
                   if (n % c ==0){
                       d = d+1;
                   }
               c = c -1;
               
        //Ver se o numero digitado e primo
              if (d == 2) {
                  System.out.println(n+ "E primo");
              }
              else    {
                  System.out.println(n+ "Não e primo");
              }
               }}}
               
    
    

