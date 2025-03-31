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
    private Endereco endereco;
    private boolean isValidType;

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
        
        if("alvenaria".equals(tipoMaterial.toLowerCase()) || "madeira".equals(tipoMaterial.toLowerCase())){
            this.tipoMaterial = tipoMaterial;
            isValidType = true;
        }
        else{
            System.out.println("Erro: Tipo de material inválido");
            isValidType = false;
        }
        
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    
    @Override
    public  String toString() {
        
        if(isValidType != true){
            System.out.println("Tipo de material deve ser madeira ou alvenaria");
            
        }
        else{
            System.out.println("Valor do aluguel: " + this.valAluguel);
            System.out.println("Tipo de material: " + this.tipoMaterial);
        }
        return null;
    }
    
    
    
}
