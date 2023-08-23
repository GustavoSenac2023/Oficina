/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.controller;

import java.util.ArrayList;
import oficina.model.Mecanico;

/**
 *
 * @author 182210133
 */
public class MecanicoController {

    public boolean validaMecanico(String nome, String telefone) {
        if (!nome.isEmpty() && !telefone.isEmpty()) {
            Mecanico m = new Mecanico(nome, telefone);
            m.cadMec(m);
            return true;
        }
        return false;
    }

    public void excMecanico(int cod) {
        new Mecanico().excMec(cod);
    }

    public void editMecanico(Mecanico m) {
        if (m != null) {
            m.editMec(m);
        }
    }

    public ArrayList<Mecanico> getMecanicos() {
        return new Mecanico().getMec();
    }
    
    public ArrayList<Mecanico> searchMecanicos(String nome){
        return new Mecanico().searchMec(nome);
    }
}
