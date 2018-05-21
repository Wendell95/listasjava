/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * wendel rodrigues viana /CPD:42785
 */
public class ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Entrada de dados
       Scanner entrada = new Scanner(System.in);
       //Declaracao de variaveis
       double p,r,a,v;
       //Entrar com os valores
       System.out.println("Digite o pi");
       p = entrada.nextDouble();
       System.out.println("Digite o raio");
       r = entrada.nextDouble();
       System.out.println("Digite a altura");
       a = entrada.nextDouble();
       //Calcular os valores digitados
       v = p * r * r * a;
        //imprimir na tela
       System.out.println("O volume é: "+v);
               
    }
}
