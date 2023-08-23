/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina.model;

import dao.CarroMecanicoDAO;
import java.util.ArrayList;

/**
 *
 * @author 182210133
 */
public class Carro_Mecanico {
    private int codigo;
    private int cod_carro;
    private int cod_mecanico;

    public Carro_Mecanico() {
    }

    public Carro_Mecanico(int cod_carro, int cod_mecanico) {
        this.cod_carro = cod_carro;
        this.cod_mecanico = cod_mecanico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCod_carro() {
        return cod_carro;
    }

    public void setCod_carro(int cod_carro) {
        this.cod_carro = cod_carro;
    }

    public int getCod_mecanico() {
        return cod_mecanico;
    }

    public void setCod_mecanico(int cod_mecanico) {
        this.cod_mecanico = cod_mecanico;
    }
    public void cadCM(Carro_Mecanico cm){
        new CarroMecanicoDAO().cad(cm);
    }
    public void excCM(int codigo){
        CarroMecanicoDAO.exc(codigo);
    }
    public void editCM(Carro_Mecanico cm){
        new CarroMecanicoDAO().edit(cm);
    }
    public ArrayList<Carro_Mecanico> searchCM(int codigo){
        return CarroMecanicoDAO.searchCarroMecanico(codigo);
    }
    public ArrayList<Carro_Mecanico> getCM(){
        return CarroMecanicoDAO.getCarroMecanico();
    }
}
