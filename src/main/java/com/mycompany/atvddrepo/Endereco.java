/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvddrepo;

/**
 *
 * @author edilson
 */
public class Endereco {
    
    private String rua = "";
    private int num = 0;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + "\nnum=" + num + '}';
    }
    
    
    
}
