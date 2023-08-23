/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oficina.model.Carro_Mecanico;
import oficina.model.Mecanico;

/**
 *
 * @author 182210133
 */
public class CarroMecanicoDAO {

    public void cad(Carro_Mecanico cm) {
        String sql = "INSERT INTO carro_mecanico (cod_carro,cod_mecanico) VALUES (" + cm.getCod_carro() + "," + cm.getCod_mecanico() + ")";
        ConexaoBD.executar(sql);
    }

    public void edit(Carro_Mecanico cm) {
        String sql = "UPDATE carro_mecanico SET "
                + "cod_carro=" + cm.getCod_carro() + ","
                + "cod_mecanico =" + cm.getCod_mecanico() + ""
                + "WHERE codigo =" + cm.getCodigo();
        ConexaoBD.executar(sql);
    }

    public static void exc(int c) {
        String sql = "DELETE FROM carro_mecanico WHERE codigo=" + c;
        ConexaoBD.executar(sql);
    }

    public static ArrayList<Carro_Mecanico> getCarroMecanico() {
        ArrayList<Carro_Mecanico> cms = new ArrayList<>();
        String sql = "SELECT codigo,cod_carro,cod_mecanico FROM carro_mecanico";
        ResultSet rs = ConexaoBD.consultar(sql);
        if (rs != null) {
            try {
                while (rs.next()) {
                    int codCarro = rs.getInt(2);
                    int codMecanico = rs.getInt(3);
                    Carro_Mecanico cm = new Carro_Mecanico(codCarro, codMecanico);
                    cm.setCodigo(rs.getInt(1));
                    cms.add(cm);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return cms;
    }

    public static ArrayList<Carro_Mecanico> searchCarroMecanico(int search) {
        ArrayList<Carro_Mecanico> cms = new ArrayList<>();
        String sql = "SELECT codigo,cod_carro,cod_mecanico FROM carro_mecanico WHERE cod_carro LIKE " + search;
        ResultSet rs = ConexaoBD.consultar(sql);
        if (rs != null) {
            try {
                while (rs.next()) {
                    int codCarro = rs.getInt(2);
                    int codMecanico = rs.getInt(3);
                    Carro_Mecanico cm = new Carro_Mecanico(codCarro, codMecanico);
                    cm.setCodigo(rs.getInt(1));
                    cms.add(cm);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return cms;
    }
}
