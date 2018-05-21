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
public class ex1 {

    /**
     * @wendell rodrigues viana/CPD: 42785
     */
    public static void main(String[] args) {
        //Entrada de dados
        Scanner e = new Scanner(System.in);
        //Declaracao de variaveis
        int i; 
        double valor,ma, me;
         
        ma = e.nextInt();
        me = e.nextInt();
        for (i=1; i <=15; i++){
        System.out.println("Digite um valor");
        valor = e.nextDouble();
        
        
        //Verificar os numeros maiores e menores digitados
        if (valor > ma){
            ma = valor;
            
        }
        else if (valor < me){
            me = valor;
            
        }
        //Mostrar o maior e menor numero digitado
        System.out.println("Valor maior:"+ma);
        System.out.println("Valor menor:"+me);
}}}
