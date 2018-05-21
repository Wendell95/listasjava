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
public class ex7 {

    /**
     * @wendell rodrigues viana / CPD: 42785
     */
    public static void main(String[] args) {
        //Entrada de dados
        Scanner e = new Scanner(System.in);
        //Declaracao de variaveis
        int n1, n2, n3, n4, cot, x;
        double m, m1, m2, m3;
        m1 = 5;
        cot = 1;
        //Entrar com a quantidade de alunos
        System.out.println("Digite a quantidade de alunos");
        x = e.nextInt();
        m2 = e.nextDouble();
        m3 = e.nextDouble();
        //Entrar e ler as notas das quantidades de alunos fornecidos
                while (cot > x){
                    System.out.println("Digite a nota do primeiro bimestre");
                    n1 = e.nextInt();
                    System.out.println("Digite a nota do segundo bimestre");
                    n2 = e.nextInt();
                    System.out.println("Digite a nota do terceiro bimestre");
                    n3 = e.nextInt();
                    System.out.println("Digite a nota do quarto bimestre");
                    n4 = e.nextInt();
                    //Efetuar a media dos alunos fornecidps
                    m = (n1+n2+n3+n4)/4;
                        if (m1 < m){
                            m2 = m;
                        }
                        if (m1 > m){
                            m3 = m;
                        }
                        //Comando que ira fazer o programa parar se   
                        //a media for menor que 0
                        if (m > 0){
                            
                        }   
                        //Contar a media dos alunos fornecidos
                                cot = cot +1;
                
                    //Caso a media nao for negativa mostrar na tela
              System.out.println("A maior media da sala foi:"+m2);
                
              System.out.println("A menor media da sala foi:"+m3);
                
                        }}}
                
    
    

