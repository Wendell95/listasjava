/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @Wendell rodrigues viana   /CPD: 42785
 */
public class ex1 {

    
    public static void main(String[] args) {
        //Entrada de dados
        Scanner entrada = new Scanner (System.in);
        //Declaracao de variaveis
        int n1, n2, soma, diferenca, produto;
                double media;
        System.out.println("Digite o primeiro numero");
        n1 = entrada.nextInt();
        System.out.println("Digite o primeiro numero");
        n2 = entrada.nextInt();
        //calculando os resultados
        soma = n1 + n2;
        diferenca = n1 - n2;
        produto = n1 * n2;
        media = n1/n2;
        //imprimindo os resultados na tela
        System.out.println("soma:"+ soma);
        System.out.println("diferenca:"+diferenca);
        System.out.println("produto:"+produto);
        System.out.println("media:"+media);
        
    }
    
}
