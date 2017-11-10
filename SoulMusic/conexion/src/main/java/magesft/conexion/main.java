/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magesft.conexion;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gonzalo
 */
public class main {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Conexion_BBDD c=new Conexion_BBDD();
        String [] insertar={"ivan","ivan","ivan","0"};
        String [] campos={"Nombre_user","Contrasenia","Correo","saldo"};
        c.insertar("usuarios",campos,insertar);
    }
}
