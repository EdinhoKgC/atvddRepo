/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvddrepo;

/**
 *
 * @author edilson
 */
public class Cidade {
    
    private int codCid = 0;
    private String nomeCid = " ";
    
    public int getCodCid(){
        return this.codCid;
    }
    
    public String getNomeCid(){
        return this.nomeCid;
    }
    
    public void setCodCid(int codCid){
        this.codCid = codCid;
    }
    
    public void setNomeCid(String nomeCid){
        this.nomeCid = nomeCid;
    }

    @Override
    public String toString() {
        return "Cidade{" + "codCid=" + codCid + "\n nomeCid=" + nomeCid + '}';
    }
    
    
}
