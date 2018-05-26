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
public class EmpregadoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Empregado e = new Empregado(" luiz ", "augusto", 0);
        Empregado ee = new Empregado(" mara ", " linda ", 0);
       
        
      System.out.println("Empregado 1: " + e.getNome() + " " +
            e.getSobrenome() +""+ e.getSalario());
 
    System.out.println("Empregado 2: " + ee.getNome() + " " +
            ee.getSobrenome() + " "+ ee.getSalario());
       
     
       
    
    }

}
    