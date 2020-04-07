/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DellPC
 */
public class conexion {
    
    private static Connection conn;
    private static final String  driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password="";
    private static final String url="jdbc:mysql://localhost:3307/formulario?zeroDateTimeBehavior=convertToNull";
    //jdbc:mysql://localhost:3306/tienda?zeroDateTimeBehavior=convertToNull

    public conexion() {
        conn=null;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,password);
            if(conn!=null){
              JOptionPane.showMessageDialog(null,"conexccion exitosa");
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error  no  se conecto "+e);
            
        }
    }
    public Connection getConnection (){
        return conn;
        
    }
    public void desconectar(){
        conn=null;
        JOptionPane.showMessageDialog(null,"conecion terminada");
    }
    
}
