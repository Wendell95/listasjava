/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import java.util.Scanner;

/**
 *wendell rodrigues viana  /CPD: 42785
 */
public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Entrada de dados
        Scanner e = new Scanner(System.in);
        //Declaracao de variaveis
        int l1,l2, l3;
        boolean t;
        //Entrar com os valores
        System.out.println("Digite o primeiro lado");
        l1 = e.nextInt();
        System.out.println("Digite o segundo lado");
        l2 = e.nextInt();
        System.out.println("Digite o terceiro lado");
        l3 = e.nextInt();
        //Verificar se os valores digitados formam triangulo
          if (l1+l2>l3 || l2+l3>l1  || l3+l1>l2){
            t = true;
            System.out.println("Forma um triangulo");
                }else
                System.out.println("Não forma um triangulo");
          //Caso formem triangulo verificar abaixo se e isosceles, escaleno ou equilaterio
           if (t = true){

            }
           if (l1 == l2 & l1 == l3 & l2 == l3){
                System.out.println("Triangulo equilatero");
    
            }
    
            if (l1 == l2 && l1 != l3 || l1 == l3 && l1 != l2 || l2 == l3 && l2 != l1){
                System.out.println("Triangulo isosceles");
    
            }
            if (l1 != l2 & l1 != l3 & l2 != l3) {
                System.out.println("Triangulo escaleno");
            }
    }}
    
    

