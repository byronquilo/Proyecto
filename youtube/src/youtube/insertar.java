/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;

/**
 *
 * @author DellPC
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import youtube.conexion;
public class insertar {
    
    
    conexion cn=new conexion();
    public int  guardar (String nombre, String Apellido){
        int resultado =0;
        Connection con=null;
        String query="insert into new_table(nombre,Apellido) values (?,?)";
        try{
          con=cn.getConnection();
          PreparedStatement sql=con.prepareStatement(query);
          sql.setString(1, nombre);
          sql.setString(2, Apellido);
          resultado=sql.executeUpdate();
          sql.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al guardar el nombre"+e, "Error en la operación", JOptionPane.ERROR_MESSAGE);
            }finally{
        try {
            if(con!=null){            
                con.close();                
            }            
        } catch (SQLException ex) {        
            JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n"
                                     + ex, "Error en la operación", JOptionPane.ERROR_MESSAGE);            
        }    
    }
    return resultado;    
}    
        }
    

