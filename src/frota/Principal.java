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
    }
    
}
