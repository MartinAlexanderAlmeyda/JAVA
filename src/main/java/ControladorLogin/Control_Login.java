/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorLogin;

import BASEDATOS.ConexionMySql;
import ModeloLogin.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marti
 */
public class Control_Login {
    public Login validarLogin(String nombre, String password) {
        String sql = "SELECT idVendedor, nombreVendedor FROM "
                + "tabla_vendedor WHERE nombreVendedor = ? "
                + "AND password = ?";
        try (Connection conn = ConexionMySql.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nombre);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                Login L = new Login();
                L.setId(rs.getInt("idVendedor"));
                L.setNombre(rs.getString("nombreVendedor"));
                return L;
            }
        } catch (SQLException e) {
            System.out.println("Error en login: " + e.getMessage());
        }
        return null;
    }



}
