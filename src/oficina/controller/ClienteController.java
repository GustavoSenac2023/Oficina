/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.controller;

import dao.ClienteDAO;
import java.util.ArrayList;
import oficina.model.Cliente;

/**
 *
 * @author 182210133
 */
public class ClienteController {
    public boolean validaCliente(String nome,String cpf,String telefone){
        if(!nome.isEmpty()&&!cpf.isEmpty()&&!telefone.isEmpty()){
            Cliente c = new Cliente(nome, cpf, telefone);
            c.cadCli(c);
            return true;
        }
        return false;
    }
    public void excCliente(int codigo){
        new Cliente().excCli(codigo);
    }
    public void editCliente(Cliente c){
        new Cliente().editCli(c);
    }
    public ArrayList<Cliente> searchCliente(String search){
        return new Cliente().searchCli(search);
    }
}
