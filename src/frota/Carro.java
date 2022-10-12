/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frota;

/**
 *
 * @author Lauder
 */
public class Carro {
    private boolean documentaoOk;
    private int anoModelo, anoFabricacao;
    private int numeroFrota = Integer.MAX_VALUE;
    private int quilometragemPercorrida = 0;

    public boolean isDocumentaoOk() {
        return documentaoOk;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getNumeroFrota() {
        return numeroFrota;
    }

    public int getQuilometragemPercorrida() {
        return quilometragemPercorrida;
    }

    public void setDocumentaoOk(boolean documentaoOk) {
        this.documentaoOk = documentaoOk;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setNumeroFrota(int numeroFrota) {
        this.numeroFrota = numeroFrota;
    }

    

    public void percorrer(int quilometragemPercorrida){
        this.quilometragemPercorrida += quilometragemPercorrida;
    }
    
    
    
}
