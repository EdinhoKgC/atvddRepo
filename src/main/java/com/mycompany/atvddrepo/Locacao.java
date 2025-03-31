/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvddrepo;

import java.util.Date;

/**
 *
 * @author edilson
 */
public class Locacao {
    
    private Date dataInicio = new Date();
    private Date dataFim = new Date();
    private Proprietario proprietario;
    private Imovel imovel;
    
    public void validarEndereco(){
        if(proprietario != null && imovel != null &&
           proprietario.getEndereco().getRua().equals(imovel.getEndereco().getRua()) &&
           proprietario.getEndereco().getNum() == imovel.getEndereco().getNum()){
           System.out.println("Endereço do proprietário não pode ser o mesmo endereço do imovel");
        }
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}