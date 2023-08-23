/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 182210133
 */
public class ConexaoBD {

    public static void executar(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina", "root", "");
            java.sql.Statement st = cnn.createStatement();
            st.execute(sql);
            cnn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static ResultSet consultar(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oficina", "root", "");
            java.sql.Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

}
