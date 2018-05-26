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
public class TesteAplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Obrigado por escolher a nossa agencia aerea!!");
        Aplicacao a = new Aplicacao(" Origem: Orlando ", " Destino: Brasilia ", 
                " valor: 1000,00" , 
                " Nome do passageiro: Jõao ", 
                " CPF: 2222 ",
                " Data de ida: 02/03/2017 ", 
                " Data de volta: 01/04/2017 ");
        
        System.out.print(""+a.getOrigem() + "" + a.getDestino()+
                ""+a.getValor()+""
                +a.getNomePassageiro()+""
                +a.getCpf()+""
                +a.getDataida()+""
                 +a.getDataVolta());
        
        System.out.println("Desejamos que tenha um excelente voo!");
                
    }
    
}
