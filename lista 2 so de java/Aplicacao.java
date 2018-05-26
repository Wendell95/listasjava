/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2java;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Aplicacao {
    String origem, destino;
   String valor;
    String nomepassageiro;
    String cpf;
    String dataida;
    String datavolta;
    
    public Aplicacao(String origem, String destino, String valor, String nomepassageiro, String cpf,String dataida, String datavolta){
          this.origem=origem;
          this.destino=destino;
          this.valor=valor;
          this.cpf=cpf;
          this.nomepassageiro=nomepassageiro;
          this.dataida=dataida;
          this.datavolta=datavolta;
    }
        public String getOrigem(){
        return origem;
        }
        public String getDestino(){
            return destino;
        }
        public String getValor(){
            return valor;
        }
        public String getNomePassageiro(){
            return nomepassageiro;
        }
        public String getCpf(){
            return cpf;
        }    
        public String getDataida(){
            return dataida;
        }
        public String getDataVolta(){
            return datavolta;
        }
        public void setOrigem(String origem){
            this.origem=origem;
            
        }
        public void setDestino(String destino){
            this.destino=destino;
        }
        public void setValor(String valor){
            this.valor=valor;
        }
        public void setNomePassageiro(String NomePassageiro){
            this.nomepassageiro=nomepassageiro;
        }
        public void setCpf(String cpf){
            this.cpf=cpf;
        }
        public void setDataida(String dataida){
            this.dataida=dataida;
                    }
        public void setDatavolta(String datavolta){
            this.datavolta=datavolta;
}}


