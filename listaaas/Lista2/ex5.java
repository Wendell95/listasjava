/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ex5 {

    /**
     * @wendell Rodrigues Viana CPD: 42785
     */
    public static void main(String[] args) {
        //Entrada de dados
        Scanner e = new Scanner(System.in);
        //Declaracao de variaveis
        int n1, n2, n3, opcao, resultado;
        //Entrar com os valores
        System.out.println("Digite o numero");
        n1 = e.nextInt();
        System.out.println("Digite o numero");
        n2 = e.nextInt();
        System.out.println("Digite o numero");
        n3 = e.nextInt();
        System.out.println("Digite a opcao");
        opcao = e.nextInt();
        switch(opcao)
        {
        case 1:
            resultado = n1 + n2 + n3;
            System.out.println("resultado:"+resultado);
            break;
        
        
        case 2:
             resultado = n1 * n2 * n3/3;
             System.out.println("resultado:"+resultado);
             break;
        
        case 3:   
        
              resultado = n1 * n2 * n3;
              System.out.println("resultado:"+resultado);
              break;
                    
              
        }
       
}}
