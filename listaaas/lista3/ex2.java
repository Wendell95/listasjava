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
public class ex2 {

    /**
     * @wendell rodrigues viana / CPD: 42785
     */
    public static void main(String[] args) {
        //entrada de dados
        Scanner e = new Scanner(System.in);
        //Declaracao de variaveis
        int num, contador, r;
        contador = 1;
        System.out.println("Digite um numero");
        num = e.nextInt();
        //contar ate 10
            while (contador <= 10){
             //Efetuar a multiplicacao do numero digitado
                r = num*contador;
       //Mostrar na tela a tabuada do numero digitado com a multiplicacao ate 10
        System.out.println(num+"x"+contador+"="+r)  ;
        contador = contador +1;
            }
    }
    
}
