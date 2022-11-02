/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frota;

/**
 *
 * @author Lauder
 */
public class Carro extends Veiculo{
   private int quantidadeDePassageiro;

    @Override
    public void percorrer(int quilometragemPercorrida) {
        super.percorrer(quilometragemPercorrida);
        float litrosConsumidos = quilometragemPercorrida / 10;
        System.out.println("Foram consumidos "+litrosConsumidos+" litros");
    }
   
   

    public int getQuantidadeDePassageiro() {
        return quantidadeDePassageiro;
    }

    public void setQuantidadeDePassageiro(int quantidadeDePassageiro) {
        this.quantidadeDePassageiro = quantidadeDePassageiro;
    }
   
  
}
