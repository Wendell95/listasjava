/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Entrada de dados
        Scanner entrada = new Scanner(System.in);
        //Declaracao de variaveis
        int n1,n2, v;
        //Entrar com os valores
        System.out.println("Digite o primerio numero");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = entrada.nextInt();
        //Troca de valores
        v = n1;
        n1 = n2;
        n2 = v;
        //Imprimir os valores trocados
         System.out.println("valor:"+n1);
          System.out.println("Digite o primerio numero:"+n2);
        
    }
}
