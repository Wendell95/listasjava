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
public class ex4 {

    /**
     * wendell rodrigues / CPD: 42785
     */
    public static void main(String[] args) {
        //Entrada de dados
        Scanner e = new Scanner(System.in);
        //Declaracao de variaveis
        int v1, v2, v3;
        String cod;
        //Entrar com os valores
        System.out.println("Digite um valor");
        v1 = e.nextInt();
        System.out.println("Digite um valor");
        v2 = e.nextInt();
        System.out.println("Digite um valor");
        v3 = e.nextInt();
        System.out.println("Digite o codigo");
        cod = e.next();
        switch(cod)
        {
            //Ler na tela os valores digitados em decrescente
            case "d":
                    if (v1 > v2 && v2 > v3){
                        System.out.println("Ordem decrescente:"+v1 +v2 +v3);
                        break;
                    }
                    if (v1 > v3 && v3 > v2) {
                        System.out.println("Ordem decrescente:"+v1 + v3 +v2);
                        break;
                    }
                    if (v2 > v1 && v1 > v3){
                        System.out.println("Ordem decrescente:"+v2 +v1 +v3);
                        break;
                    }
                    if (v2 > v3 && v3 > v1){
                        System.out.println("Ordem decrescente:"+v2 + v3 +v1);
                        break;
                    }    
                    if (v3 > v1 && v1 > v2){
                        System.out.println("Ordem decrescente:"+v3 + v1 +v2);
                        break;
                    }
                     //Ler na tela os valores digitados em crescente 
                    case "c":
                    if (v1 < v2 && v2 < v3){
                        System.out.println("Ordem crescente:"+v1 + v2 +v3);
                        break;
                    }
                    if (v1 < v3 && v3 < v2){
                        System.out.println("Ordem crescente:"+v1 + v3 +v2);
                        break;
                    }
                    if  (v2 < v1 && v1 < v3){
                        System.out.println("Ordem crescente:"+v2 + v1 +v3);
                        break;
                    }   
                    if (v2 < v3 && v3 < v1){
                        System.out.println("Ordem crescente:"+v2 + v3 +v1);
                        break;
                    }
                    if (v3 < v1 && v1 < v2){
                        System.out.println("Ordem crescente:"+v3 + v1 +v2);
                        break;
                    }
                    }
        }
                        
    
    
}
