/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @wendell rodrigues viana  / CPD:42785
 */
public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Entrada de dados
        Scanner entrada = new Scanner(System.in);
        //Declaracao de variaveis
        double n1, r;
        //Calcular o quadrado do numero digitado
        System.out.println("Digite o numero");
        n1 = entrada.nextDouble();
        r = n1*n1;
        //Imprimir na tela
        System.out.println("o quadrado é:"+r);
                
    }
}
