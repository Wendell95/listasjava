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
public class DataTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data data = new Data(12 , 25 , 2017);
        System.out.println("Data:"+data.getMes() +"/" +data.getDia()+"/" 
                +data.getAno());
       
    }}

