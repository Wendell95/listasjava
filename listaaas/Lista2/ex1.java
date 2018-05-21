/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @wendell rodrigues viana  CPD: 42785
 */
public class ex1 {
     public static void main(String[] args) {
         //Entrada de dados
         Scanner e = new Scanner(System.in);
         //Declaracao de variaveis
         int num;
         //Entrar com o numero
         System.out.println("Digite o numero");
         num = e.nextInt();
         //Verificar se o numero digitado e par ou impar
         if (num % 2 == 0) {
             System.out.println("O numero e par");
         }else
           
              System.out.println("O numero e impar");
         //verificar se o numero digitado e positivo ou negativo
   if(num >= 0){
             System.out.println("O numero e positivo");
}
         else {
           System.out.println("O numero e negativo");
   }}}
         




     
