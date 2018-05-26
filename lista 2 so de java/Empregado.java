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
public class Empregado {
       private String nome, sobrenome;
   double salario;
   
    Empregado(String nome, String sobrenome, double salario){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.salario=salario;
        
        
    }
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
   
    public double getSalario() {
        return salario+salario*0.10;
        
    }
    public void setSalario(double salario) {
        this.salario=salario;
    
       if (salario > 0){
       }
      else{
          System.out.println("Salario invalido");
       }
        
    }
    }

