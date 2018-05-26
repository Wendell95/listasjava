/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1java;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner e = new Scanner(System.in);
       int valora, valorb;
       
       System.out.println("Digite o primeiro numero");
       valora = e.nextInt();
       System.out.println("Digite o segundo numero");
       valorb = e.nextInt();
       
            if (valora % valorb == 0){
                 System.out.println("E multiplo");
           
            }
            else
                System.out.println("Não e multilplo");
       
       
    }
    
}
