/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @wendell rodrigues viana /CPD: 42785
 */
public class ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Entrada de dados
        Scanner e = new Scanner(System.in);
        //Declaracao de variaveis
        double n1, n2, n3, m;
        //Entrar com os valores
        System.out.println("Digite a primeira nota");
        n1 = e.nextDouble();
        System.out.println("Digite a segunda nota");
        n2 = e.nextDouble();
        System.out.println("Digite a terceira nota");
        n3 = e.nextDouble();
        //Calcular a media dos valores digitados
            m = (n1 + n2 + n3)/3;
        //imprimir a media na tela
        System.out.println("Media:"+ m);
        //Verificar qual os maiores numeros digitados
        if (n1 > n2){
            System.out.println("Maior:"+ n1);
        }
        else
           System.out.println("Maior:"+n2);
        if (n1 > n3){
            System.out.println("Maior:"+n1);
            
        }
        else
            System.out.println("Maior:"+n3);
        if (n2 > n3){
            System.out.println("Maior:"+n2);
                    }
        else
            System.out.println("Maior:"+n3);
    }   
    
    
    
}
