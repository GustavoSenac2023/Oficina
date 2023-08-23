/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.model;

import dao.CarroDAO;
import java.util.ArrayList;

/**
 *
 * @author 182210133
 */
public class Carro {
    private int codigo;
    private String tipo;
    private String modelo;
    private String placa;
    private String marca;
    private int cliente;
    private ArrayList<Mecanico> mecanicos; 

    public Carro() {
    }

    public Carro(int cod_cliente,String tipo, String modelo, String placa, String marca) {
        this.cliente=cod_cliente;
        this.tipo = tipo;
        this.modelo = modelo;
        this.placa = placa;
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }


    public ArrayList<Mecanico> getMecanicos() {
        return mecanicos;
    }

    public void setMecanicos(ArrayList<Mecanico> mecanicos) {
        this.mecanicos = mecanicos;
    }
    public void cadCarro(Carro c){
       new CarroDAO().cad(c);
    }
    
    public ArrayList<Carro> searchC(int codigo){
        return CarroDAO.searchCarroMecanico(codigo);
    }

    public ArrayList<Carro> getCarro() {
        return CarroDAO.getCarros();
    }

    public void editCarro(Carro cr) {
        new CarroDAO().edit(cr);
    }
    
}
