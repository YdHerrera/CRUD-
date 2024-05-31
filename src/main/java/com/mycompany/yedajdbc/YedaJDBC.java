/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yedajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Felipe
 */
public class YedaJDBC {

    public static void main(String[] args) {
        String usuario= "root";
        String password="";
        String url= "jdbc:mysql://localhost:3306/yedadb";
        Connection conexion;
        Statement statement;
        
        
        try {
            conexion=DriverManager.getConnection(url, usuario, password);
            statement=conexion.createStatement();
            
           //INSERT
           
            statement.execute("INSERT INTO `administrador` "
                    + "(`Nombre`, `Apellidos`, `Telefono`, `Direccion`, `Fecha_Nacimiento`, `Cedula_Ciudadania`, `Email`) "
                    + "VALUES ('Luis', 'Rengifo', '312566', 'carrera59 #10-21', '19/03/1984', '1087952', 'Luis11@gmail.com');");
            System.out.println("Se agrego un nuevo administrador, realiza la consulta para verificar el ingreso ");
            
             statement.execute("INSERT INTO `empleado` "
                    + "(`Nombre`, `Apellidos`, `Telefono`, `Direccion`, `Fecha_Nacimiento`, `Cedula_Ciudadania`)"
                    + "VALUES ('Luz', 'Serna', '3124677', 'Carrera 12#52-63', '2000-02-20', '1369845');");
            System.out.println("Se agrego un nuevo empleado, realiza la consulta para verificar el ingreso ");
            
            statement.execute("INSERT INTO `cliente` "
                    + "(`Nombre`, `Telefono`, `Email`)"
                    + "VALUES ('Camilo', '3123645789','camilo11u@gmail.com');");
            System.out.println("Se agregó un nuevo cliente, realiza la consulta para verificar el ingreso ");
            
            statement.execute("INSERT INTO `negocio` "
                    + "(`Nombre`,`Ciudad`, `Direccion`, `Telefono`) "
                    + "VALUES ('Store Li', 'Medellin', 'Calle 54 #46-27', '3125554779'),('Bendita', 'Cali', 'Cr22 A 72 B-86', '333698745');");
            System.out.println("Se agregó un nuevo negocio, realiza la consulta para verificar el ingreso ");
            
            statement.execute("INSERT INTO `productos` "
                    + "(`Nombre_P`, `Descripcion`,`Precio`,`Proveedor`,`ID_negocio`) "
                    + "VALUES ('Camisetas', 'marca GUCCI', '35.000 c/u','Carlos Ropa',1),('Caja cerveza', 'Marca pilsen', '61.000', 'Licoreria Miguel', 2) ;");
            System.out.println("Se agregó un nuevo producto, realiza la consulta para verificar el ingreso ");
            
            statement.execute("INSERT INTO `proveedor` "
                    + "(`Nombre`, `Email`, `Telefono`,`Cedula_Ciudadania`, `Fecha_Nacimiento`) "
                    + "VALUES ('Carlos', 'Carlos1010@gmail.com', '4328569', '04850', '02/03/2000');");
            System.out.println("Se agrego un nuevo proveedor, realiza la consulta para verificar el ingreso ");
            
            
            //UPDATE
            
            statement.execute("UPDATE `negocio` SET `Direccion` = 'Calle 54 #41-50' WHERE `negocio`.`ID_Negocio` = 1; ");
            System.out.println("Se actualizo un negocio, realiza la consulta para verificar la actualizacion");
            
            statement.execute("UPDATE `administrador` SET `apellidos` = 'Alvarez Ruiz' WHERE `administrador`.`ID_Administrador` = 9; ");
            System.out.println("Se actualizo un administrador, realiza la consulta para verificar la actualizacion");
            
            //DELETE
            
            statement.execute("DELETE FROM administrador WHERE `administrador`.`ID_Administrador` = 21 ");
            System.out.println("Se eliminó un administrador, realiza la consulta para verificar la eliminación ");
            
            statement.execute("DELETE FROM productos WHERE `productos`.`ID_Productos` = 6 ");
            System.out.println("Se eliminó un productos, realiza la consulta para verificar la eliminación ");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(YedaJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
}
