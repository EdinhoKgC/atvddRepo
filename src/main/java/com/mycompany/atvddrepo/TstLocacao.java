/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvddrepo;
import java.util.Date;

/**
 *
 * @author edilson
 */
public class TstLocacao {

    public static void main(String[] args) {
        
        Cidade cidade1 = new Cidade();
        cidade1.setCodCid(1);
        cidade1.setNomeCid("Natal");
        System.out.println(cidade1.getNomeCid());
        
        System.out.println("-----------------------------------------------------------------");
        
        Endereco enderecoProp1 = new Endereco();
        enderecoProp1.setCidade(cidade1);
        enderecoProp1.setRua("Rua teste prop");
        enderecoProp1.setNum(1);
        System.out.println(enderecoProp1.getRua());
        System.out.println(enderecoProp1.getNum());
        
        System.out.println("-----------------------------------------------------------------");
        
        Endereco enderecoImov1 = new Endereco();
        enderecoImov1.setCidade(cidade1);
        enderecoImov1.setRua("Rua teste prop");
        enderecoImov1.setNum(1);
        System.out.println(enderecoImov1.getRua());
        System.out.println(enderecoImov1.getNum());
        
        System.out.println("-----------------------------------------------------------------");
        
        Proprietario prop1 = new Proprietario();
        prop1.setCpfProp(1234);
        prop1.setNomeProp("Edolas");
        prop1.setEndereco(enderecoProp1);
        System.out.println(prop1.getNomeProp());
        System.out.println(prop1.getCpfProp());
        System.out.println(prop1.getEndereco());
        
        System.out.println("-----------------------------------------------------------------");
        
        Imovel imov1 = new Imovel();
        imov1.setTipoMaterial("Madeira podre");
        imov1.setValAluguel(500);
        imov1.setEndereco(enderecoImov1);
        System.out.println(imov1.getTipoMaterial());
        System.out.println(imov1.getValAluguel());
        System.out.println(imov1.getEndereco());

        System.out.println("-----------------------------------------------------------------");
        
        Locacao loc1 = new Locacao();
        Date inicial = new Date(2025,12,23);
        Date finalDate = new Date(2025,12,26);
        loc1.setProprietario(prop1);
        loc1.setImovel(imov1);
        loc1.setDataInicio(inicial);
        loc1.setDataFim(finalDate);
        System.out.println(loc1.getProprietario());
        System.out.println(loc1.getImovel());
        System.out.println(loc1.getDataInicio());
        System.out.println(loc1.getDataFim());
        loc1.validarEndereco();
        
        System.out.println("-----------------------------------------------------------------");
        
        System.out.println("-----------------------------------------------------------------");
        
        System.out.println("-----------------------------------------------------------------");
        
        Endereco enderecoProp2 = new Endereco();
        enderecoProp2.setCidade(cidade1);
        enderecoProp2.setRua("Rua teste prop2");
        enderecoProp2.setNum(2);
        System.out.println(enderecoProp2.getRua());
        System.out.println(enderecoProp2.getNum());
        
        System.out.println("-----------------------------------------------------------------");
        
        Endereco enderecoImov2 = new Endereco();
        enderecoImov2.setCidade(cidade1);
        enderecoImov2.setRua("Rua teste imov");
        enderecoImov2.setNum(3);
        System.out.println(enderecoImov2.getRua());
        System.out.println(enderecoImov2.getNum());
        
        System.out.println("-----------------------------------------------------------------");
        
        Proprietario prop2 = new Proprietario();
        prop2.setCpfProp(12344567);
        prop2.setNomeProp("Marcolas");
        prop2.setEndereco(enderecoProp2);
        System.out.println(prop2.getNomeProp());
        System.out.println(prop2.getCpfProp());
        System.out.println(prop2.getEndereco());
        
        System.out.println("-----------------------------------------------------------------");
        
        Imovel imov2 = new Imovel();
        imov2.setTipoMaterial("Madeira");
        imov2.setValAluguel(1000);
        imov2.setEndereco(enderecoImov2);
        System.out.println(imov2.getTipoMaterial());
        System.out.println(imov2.getValAluguel());
        System.out.println(imov2.getEndereco());

        System.out.println("-----------------------------------------------------------------");
        
        Locacao loc2 = new Locacao();
        Date inicialloc2 = new Date();
        Date finalDateloc2 = new Date();
        loc1.setProprietario(prop2);
        loc1.setImovel(imov2);
        loc1.setDataInicio(inicialloc2);
        loc1.setDataFim(finalDateloc2);
        System.out.println(loc2.getProprietario());
        System.out.println(loc2.getImovel());
        System.out.println(loc2.getDataInicio());
        System.out.println(loc2.getDataFim());
        loc2.validarEndereco();
        
        System.out.println("-----------------------------------------------------------------");
    }
}
