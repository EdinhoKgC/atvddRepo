/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvddrepo;

/**
 *
 * @author edilson
 */
public class Proprietario {
    
    private int cpfProp = 0;
    private String nomeProp = " ";

    public int getCpfProp() {
        return cpfProp;
    }

    public void setCpfProp(int cpfProp) {
        this.cpfProp = cpfProp;
    }

    public String getNomeProp() {
        return nomeProp;
    }

    public void setNomeProp(String nomeProp) {
        this.nomeProp = nomeProp;
    }

    @Override
    public String toString() {
        return "Proprietario{" + "cpfProp=" + cpfProp + "\nnomeProp=" + nomeProp + '}';
    }

}
