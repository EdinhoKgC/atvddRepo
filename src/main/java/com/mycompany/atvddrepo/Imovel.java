/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvddrepo;

/**
 *
 * @author edilson
 */
public class Imovel {
    
    private int valAluguel = 0;
    private String tipoMaterial = "";

    public int getValAluguel() {
        return valAluguel;
    }

    public void setValAluguel(int valAluguel) {
        this.valAluguel = valAluguel;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public String toString() {
        return "Imovel{" + "valAluguel=" + valAluguel + "\ntipoMaterial=" + tipoMaterial + '}';
    }
    
    
    
}
