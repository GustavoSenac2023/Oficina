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
import oficina.model.Carro;

/**
 *
 * @author 182210133
 */
public class CarroDAO {

    public void cad(Carro c) {
        String sql = "INSERT INTO carro (cod_cliente,marca,modelo,tipo,placa) VALUES ('" + c.getCliente() + "','" + c.getMarca() + "','" + c.getModelo() + "','" + c.getTipo() + "','" + c.getPlaca() + "')";

        ConexaoBD.executar(sql);
    }

    public void edit(Carro c) {
        String sql = "UPDATE carro SET "
                + "cod_cliente=" + c.getCliente() + ","
                + "marca ='" + c.getMarca() + "',"
                + "modelo ='" + c.getModelo() + "',"
                + "tipo ='" + c.getTipo() + "',"
                + "placa ='" + c.getPlaca() + "'"
                + "WHERE codigo =" + c.getCodigo();
        ConexaoBD.executar(sql);
    }

    public static void exc(int c) {
        String sql = "DELETE FROM carro WHERE codigo=" + c;
        ConexaoBD.executar(sql);
    }

    public static ArrayList<Carro> getCarros() {
        ArrayList<Carro> cs = new ArrayList<>();
        String sql = "SELECT codigo,cod_cliente,marca,modelo,tipo,placa FROM carro";
        ResultSet rs = ConexaoBD.consultar(sql);
        if (rs != null) {
            try {
                while (rs.next()) {
                    int cod_cliente = rs.getInt(2);
                    String marca = rs.getString(3);
                    String modelo = rs.getString(4);
                    String tipo = rs.getString(5);
                    String placa = rs.getString(6);
                    Carro c = new Carro(cod_cliente, tipo, modelo, placa, marca);
                    c.setCodigo(rs.getInt(1));
                    cs.add(c);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return cs;
    }
}
