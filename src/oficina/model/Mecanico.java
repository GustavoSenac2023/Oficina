/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.model;

import dao.MecanicoDAO;
import java.util.ArrayList;

/**
 *
 * @author 182210133
 */
public class Mecanico {
    private int codigo;
    private String nome;
    private String telefone;

    public Mecanico() {
    }

    public Mecanico(String nome, String telefone) {
        this.nome = nome;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void cadMec(Mecanico m){
        new MecanicoDAO().cad(m);
    }
    public void excMec(int cod){
        MecanicoDAO.exc(cod);
    }
    public void editMec(Mecanico m){
        new MecanicoDAO().edit(m);
    }
    public ArrayList<Mecanico> getMec(){
        return MecanicoDAO.getMecanicos();
    }
    public ArrayList<Mecanico> searchMec(String nome){
        return MecanicoDAO.searchMecanicos(nome);
    }
}
