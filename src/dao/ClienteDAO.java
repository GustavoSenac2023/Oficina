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
import oficina.model.Cliente;

/**
 *
 * @author 182210133
 */
public class ClienteDAO {

    public void cad(Cliente c) {
        String sql = "INSERT INTO cliente (nome,cpf,telefone) VALUES ('" + c.getNome() + "','" + c.getCpf() + "','" + c.getTelefone() + "')";

        ConexaoBD.executar(sql);
    }

    public void edit(Cliente c) {
        String sql = "UPDATE cliente SET "
                + "nome=" + c.getNome() + ","
                + "cpf ='" + c.getCpf() + "',"
                + "telefone ='" + c.getTelefone() + "'"
                + "WHERE codigo =" + c.getCodigo();
        ConexaoBD.executar(sql);
    }

    public static void exc(int c) {
        String sql = "DELETE FROM cliente WHERE codigo=" + c;
        ConexaoBD.executar(sql);
    }

    public static ArrayList<Cliente> getClientes() {
        ArrayList<Cliente> cls = new ArrayList<>();
        String sql = "SELECT codigo,nome,cpf,telefone FROM cliente";
        ResultSet rs = ConexaoBD.consultar(sql);
        if (rs != null) {
            try {
                while (rs.next()) {
                    String nome = rs.getString(2);
                    String cpf = rs.getString(3);
                    String telefone = rs.getString(4);
                    Cliente c = new Cliente(nome, cpf, telefone);
                    c.setCodigo(rs.getInt(1));
                    cls.add(c);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return cls;
    }

    public static ArrayList<Cliente> searchClientes(String search) {
        ArrayList<Cliente> cls = new ArrayList<>();
        String sql = "SELECT codigo,nome,cpf,telefone FROM cliente WHERE nome LIKE '%" + search + "%'";
        ResultSet rs = ConexaoBD.consultar(sql);
        if (rs != null) {
            try {
                while (rs.next()) {
                    String nome = rs.getString(2);
                    String cpf = rs.getString(3);
                    String telefone = rs.getString(4);
                    Cliente c = new Cliente(nome, cpf, telefone);
                    c.setCodigo(rs.getInt(1));
                    cls.add(c);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return cls;
    }
}
