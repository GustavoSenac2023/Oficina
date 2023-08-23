/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.controller;

import java.util.ArrayList;
import oficina.model.Carro_Mecanico;

/**
 *
 * @author 182210133
 */
public class CarroMecanicoController {
    public boolean validaCM(int codCarro,int codMecanico){
        Carro_Mecanico cm= new Carro_Mecanico(codCarro, codMecanico);
        cm.cadCM(cm);
        return true;
    }
    public void excCM(int codigo){
        new Carro_Mecanico().excCM(codigo);
    }
    public void editCM(Carro_Mecanico cm){
        new Carro_Mecanico().editCM(cm);
    }
    public ArrayList<Carro_Mecanico> searchCM(int codigo){
        return new Carro_Mecanico().searchCM(codigo);
    }
    public ArrayList<Carro_Mecanico> getCM(){
        return new Carro_Mecanico().getCM();
    }
}
