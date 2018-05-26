/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2java;

/**
 *
 * @author PC
 */
public class FaturaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura(" 18 "," arroz ", 0 ,0);
        
      
        
       
          System.out.println("fatura 1: " + fatura1.getNumero() + " " +
            fatura1.getDescricao() + " " + fatura1.getQuantidadeComprada()
          + " " + fatura1.getprecoItem() + " " +fatura1.getvalor());     
    
}}
