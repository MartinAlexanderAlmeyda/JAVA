/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primera_unidad;

import VistaLogin.frmLogin;
import javax.swing.SwingUtilities;

/**
 *
 * @author marti
 */
public class PRIMERA_UNIDAD {

    public static void main(String[] args) {
        // Usando la buena práctica con SwingUtilities 
        SwingUtilities.invokeLater(() -> {
            // Suponiendo que tienes una clase llamada frmLogin 
            frmLogin login = new frmLogin();
            login.setVisible(true);
            
      }); 
    }
}
