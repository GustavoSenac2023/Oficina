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
import oficina.model.Mecanico;

/**
 *
 * @author 182210133
 */
public class MecanicoDAO {

    public void cad(Mecanico m) {
        String sql = "INSERT INTO mecanico (nome,telefone) VALUES ('" + m.getNome() + "','" + m.getTelefone() + "')";
        ConexaoBD.executar(sql);
    }

    public void edit(Mecanico m) {
        String sql = "UPDATE mecanico SET "
                + "nome='" + m.getNome() + "',"
                + "telefone ='" + m.getTelefone() + "'"
                + "WHERE codigo =" + m.getCodigo();
        ConexaoBD.executar(sql);
    }

    public static void exc(int c) {
        String sql = "DELETE FROM mecanico WHERE codigo=" + c;
        ConexaoBD.executar(sql);
    }

    public static ArrayList<Mecanico> getMecanicos() {
        ArrayList<Mecanico> ms = new ArrayList<>();
        String sql = "SELECT codigo,nome,telefone FROM mecanico";
        ResultSet rs = ConexaoBD.consultar(sql);
        if (rs != null) {
            try {
                while (rs.next()) {
                    String nome = rs.getString(2);
                    String telefone = rs.getString(3);
                    Mecanico m = new Mecanico(nome, telefone);
                    m.setCodigo(rs.getInt(1));
                    ms.add(m);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return ms;
    }

    public static ArrayList<Mecanico> searchMecanicos(String search) {
        ArrayList<Mecanico> ms = new ArrayList<>();
        String sql = "SELECT codigo,nome,telefone FROM mecanico WHERE nome LIKE '%" + search + "%'";
        ResultSet rs = ConexaoBD.consultar(sql);
        if (rs != null) {
            try {
                while (rs.next()) {
                    String nome = rs.getString(2);
                    String telefone = rs.getString(3);
                    Mecanico m = new Mecanico(nome, telefone);
                    m.setCodigo(rs.getInt(1));
                    ms.add(m);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return ms;
    }
}
