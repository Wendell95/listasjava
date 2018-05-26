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
public class Conta {
    Scanner e = new Scanner(System.in);

     String nome, endereco, rg, cpf, tipodeconta; 
     float valor;

     public Conta(String nome, String endereco, String rg, String cpf,String tipodeconta, float valor){
          this.nome=nome;
          this.endereco=endereco;
          this.rg=rg;
          this.cpf=cpf;
          this.tipodeconta=tipodeconta;
                   this.valor=valor;
              
            
          if (valor < 1){
             System.out.println("Saldo insuficiente");
          }
     }
          
       
       
        public String getNome(){
        return nome;
        }
        public String getEndereco(){
            return endereco;
        }
        public String getRg(){
            return rg;
        }
        public String getCpf(){
            return cpf;
        }
        public String gettipodeconta(){
            return tipodeconta;
        }    
        public float getvalor(){
            return valor;
        }
        public void setNome(String nome){
            this.nome=nome;
            
        }
        public void setEndereco(String endereco){
            this.endereco=endereco;
        }
        public void setRg(String RG){
            this.rg=rg;
        }
        public void setCpf(String cpf){
            this.cpf=cpf;
        }
        public void settipodeconta(String tipodeconta){
            this.tipodeconta=tipodeconta;
        }
        public void setvalor(float valor){
            this.valor=valor;
           // if (valor < 1){
           //   System.out.println("Saldo insuficiente");
          //}
        }    
         
}
        
