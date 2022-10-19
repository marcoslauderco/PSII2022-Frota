/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frota;

/**
 *
 * @author Lauder
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro gol = new Carro();
        gol.setQuantidadeDePassageiro(5);
        if(gol.isDocumentaoOk()){
            System.out.println("OK");
        }else{
            System.out.println("Apreendido");
        }
        
        System.out.println("km "+gol.getQuilometragemPercorrida());
        gol.percorrer(1000);
        System.out.println("km "+gol.getQuilometragemPercorrida());
        gol.percorrer(500);
        System.out.println("km "+gol.getQuilometragemPercorrida());
    
        System.out.println("Caminhão");
        Caminhao caminhao = new Caminhao();
        caminhao.setCapacidadeDeCarga(5000);
        caminhao.percorrer(400);
        System.out.println("Caminhão km "+caminhao.getQuilometragemPercorrida());

    }
    
}
