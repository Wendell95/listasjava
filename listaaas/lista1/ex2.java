/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @wendell rodrigues viana / CPD:42785
 */
public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Entrada de dados
        Scanner entrada = new Scanner(System.in);
        //Declaracao de variaveis
        float c,f;
        //Converter a temperatura digitada
        c = entrada.nextFloat();
        f = 9*c + 160/5; 
        //Imprimir o resultado na tela
        System.out.println("A temperatura é:"+ f);
    }
}
