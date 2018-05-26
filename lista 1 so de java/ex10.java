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
public class ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);

        float raio, diametro, circunferencia, area;
        double PI;
        
        System.out.println("Digite o raio");
        raio = e.nextInt();
        
        diametro = 2 * raio;
        System.out.println("Raio"+raio);
        
        circunferencia = (float) (2*raio* Math.PI);
        System.out.println("Circunferencia:"+circunferencia);
        
        area = (float) (Math.PI * raio * 2);
        System.out.println("Area:"+area);
       
}}
    
    

