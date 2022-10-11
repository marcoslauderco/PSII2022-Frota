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
        System.out.println("Teste 5");
        if(gol.documentaoOk){
            System.out.println("OK");
        }else{
            System.out.println("Apreendido");
        }
    }
    
}
