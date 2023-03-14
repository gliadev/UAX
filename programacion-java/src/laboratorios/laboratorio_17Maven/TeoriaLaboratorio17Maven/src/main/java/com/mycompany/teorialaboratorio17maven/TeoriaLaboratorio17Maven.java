/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teorialaboratorio17maven;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gliat
 */
public class TeoriaLaboratorio17Maven {

    public static void main(String[] args) throws SQLException {
        // grant all privileges on alumnosdam.* to 'user-dam'@localhost identified by 'alumnosdam@';
        
        // configuracion de la conexion a la base de datos en local
        String url = "jdbc:mysql://localhost:3306/alumnosdam";
        String user = "user-dam";
        String password = "alumnosdam@";
        
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión correcta");
            
           // vamos a crear una tabla dentro de la BD que tengo selecionada
           // que la puedo llamar sql como si le llamo patata
           Statement sql = con.createStatement();
           System.out.println(sql.execute("CREATE TABLE IF NOT EXISTS `alumnosDAM`.`aviones` ( `id` INT NOT NULL AUTO_INCREMENT , `tipo` VARCHAR(255) NOT NULL , `peso` INT NOT NULL , `fabricante` VARCHAR(255) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;"));
           System.out.println("Tabla creada");
           
           //Insertamos un avion
           int n = sql.executeUpdate("INSERT INTO `aviones` (`id`, `tipo`, `peso`, `fabricante`) "
                + "VALUES (NULL, 'BOING 747', '17', 'BOING')");
            n = sql.executeUpdate("INSERT INTO `aviones` (`id`, `tipo`, `peso`, `fabricante`) "
                + "VALUES (NULL, 'A330', '19', 'AIRBUS')");
            n = sql.executeUpdate("INSERT INTO `aviones` (`id`, `tipo`, `peso`, `fabricante`) "
                + "VALUES (NULL, 'B52', '15', 'AIRBUS')");
             n = sql.executeUpdate("INSERT INTO `aviones` (`id`, `tipo`, `peso`, `fabricante`) "
                + "VALUES (NULL, 'BALLENA', '23', 'AIRBUS')");
            System.out.println("Aviones insertados correctamente"); 
           
           
            
            

        } catch (SQLException e) {
            System.out.println("Error de SQL");
        }

       
    }
}
