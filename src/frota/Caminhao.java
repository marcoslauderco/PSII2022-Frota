/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frota;

/**
 *
 * @author Lauder
 */
public class Caminhao extends Veiculo{
    private int capacidadeDeCarga;
    
    @Override
    public void percorrer(int quilometragemPercorrida) {
        super.percorrer(quilometragemPercorrida);
        float litrosConsumidos = quilometragemPercorrida / 3;
        System.out.println("Foram consumidos "+litrosConsumidos+" litros");
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
    
    
}
