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
public class ex10 {

    /**
     * wendell rodrigues viana /CPD: 42785
     */
    public static void main(String[] args) {
        //Entrada de dados
        Scanner e = new Scanner(System.in);
        //Declaracao de variaveis
        int numero, contador, numeroprimo, divisor;
        //Entrar com o numero
        System.out.println("Digite um numero");
        numero = e.nextInt();
        //Se o numero digitado for zero ou menor encerrar
        //o programa
            if (numero <=0){
                System.out.println("Zero e numero negativo nao sao primos");
                
            }
         //Iniciar a contagem do numero a partir do 1 
         //ate o numero digitado pelo usuario
                for (numeroprimo=1; numero==numero; numeroprimo++){
                    contador = 0;
                    
         //Fazer a contagem dos numeros primos
               for(divisor=1; numeroprimo==numeroprimo; divisor++ ){
                   if (numeroprimo % divisor == 0){
                                        
                   contador = contador + 1;
               }   
               }
                
                //mostrar os numeros primos na tela ate o valor
                //digitado pelo usuario
                if (contador == 2){
                    System.out.println("numero primo:"+ numeroprimo);
                            
                }}
        
    }
    
}
