/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Doris
 */
public class Conexion {
    public static Connection conectar(){
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/basedatodeas","root","");
            return cn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion" + e);
        }

            return (null);
    } 
    
    
}
