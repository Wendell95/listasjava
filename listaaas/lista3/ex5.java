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
public class ex5 {

    /**
     * @wendell Rodrigues viana /CPD:42785
     */
    public static void main(String[] args) {
        //Entrada de dados
        Scanner e = new Scanner(System.in);
        
       
        //Declaracao de variaveis
        
        int x, i2, i3;
        //usando a estrutura enquanto para o programa para quando for digitado um numero maior ou igual a 1000  
        System.out.println("Digite um numero");
        x = e.nextInt();
        i2 = e.nextInt();
        i3 = e.nextInt();
            while(x < 1000){
        
         
      
        //Fazer a leitura dos  numeros pares e impares digitados
             if (x % 2 == 0) {
                 i2 = i2 + x;
             }
             else
                 i3 = i3 + x;
    }
        //Mostrar a soma dos numeros pares e impares
        System.out.println("A soma de todos os numeros pares e:"+i2); 
        
        System.out.println("A soma de todos os numeros impares e:"+i3);
                
}
}