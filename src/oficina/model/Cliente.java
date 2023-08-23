/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.model;

import dao.ClienteDAO;
import java.util.ArrayList;

/**
 *
 * @author 182210133
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void cadCli(Cliente c){
        new ClienteDAO().cad(c);
    }
    public void excCli(int codigo){
        ClienteDAO.exc(codigo);
    }
    public void editCli(Cliente c){
        new ClienteDAO().edit(c);
    }
    public ArrayList<Cliente> searchCli(String nome){
        return ClienteDAO.searchClientes(nome);
    }
}
