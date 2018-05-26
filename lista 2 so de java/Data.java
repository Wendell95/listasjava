/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2java;



import java.util.Scanner;





/**
 *
 * @author PC
 */
public class Data {
Scanner e = new Scanner(System.in);
private int data;
    private int mes;
    private int dia;
    private int ano;
    
    
         Data(int mes, int dia, int ano){
             this.mes=mes;
             this.dia=dia;
             this.ano=ano;
         }
             {
                 
             }
           
        public int getMes()
        {
            return mes;
        }
        public int getDia(){
            return dia;
        }
        public int getAno(){
            return ano;
        }
        public void setMes(int mes){
        this.mes=mes;
        }
        public void setDia(int dia){
        this.dia=dia;
        }
        public void setAno(int ano) {
            this.ano=ano;
        }
        public int getDate(){
            {
                data=((dia)/(mes)/(ano));
            }
        return mes;
        
         }}
        
            
        
        
                
        

