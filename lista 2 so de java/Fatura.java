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
public class Fatura {
    String numero, descricao;
   int quantidadeComprada;
    double precoitem, valor;
    


Fatura(String numero, String descricao, int quantidadeComprada, double precoitem){
    this.numero=numero;
    this.descricao=descricao;
    this.quantidadeComprada=quantidadeComprada;
    this.precoitem=precoitem;
}
public String getNumero(){
    return numero;
}
public String getDescricao(){
    return descricao;
}
public int getQuantidadeComprada(){
    return quantidadeComprada;
}
public double getprecoItem(){
    return precoitem;
}
public void setNumero(String numero){
    this.numero=numero;
}
public void setDescricao(String descricao){
    this.descricao=descricao;
}
public void setQuantidadeComprada(int quantidadeComprada){
    this.quantidadeComprada=quantidadeComprada;
}
public void precoItem(double precoitem){
    this.precoitem=precoitem;
    
}
public double getvalor(){
    return valor;
}
public void setvalor(double valor){
    this.valor=valor;
   valor=quantidadeComprada * precoitem;
    System.out.println("O valor é:"+valor);
    if (quantidadeComprada < 0) {
        System.out.println("Quantidade nao positiva");
    if (precoitem < 0.0){
        System.out.println("Preco nao positivo");
    }    
    }
}}
