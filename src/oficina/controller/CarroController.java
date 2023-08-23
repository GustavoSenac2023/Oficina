/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.controller;

import oficina.model.Carro;

/**
 *
 * @author 182210133
 */
public class CarroController {
    public boolean validaCarro(int cod_cliente,String tipo,String marca,String modelo,String placa){
        if(!tipo.isEmpty()&&!marca.isEmpty()&&!modelo.isEmpty()&&!placa.isEmpty()){
            Carro c= new Carro(cod_cliente,tipo, modelo, placa, marca);
            c.cadCarro(c);
            return true;
        }
        return false;
    }
}
