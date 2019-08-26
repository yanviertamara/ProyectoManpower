package edu.cecar.controladores;


import edu.cecar.componentes.baseDeDatos.ConectarMySQL;
import edu.cecar.modelos.Empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 * Clase: ControladorEmpleado
 * 
 * @version: 0.1
 *  
 * @since: 12/08/2019
 * 
 * Fecha de Modificación:
 * 
 * @author: Yanvier Tamara Meriño
 * 
 * Copyrigth: CECAR
 */


/**
 *
 * clase que controla las operaciones CRUD de los empleados
 */
public class ControladorEmpleado {
    
    private ConectarMySQL conectarMySQL;
    
    public ControladorEmpleado(){
        
        conectarMySQL = new ConectarMySQL("127.0.0.1", "Manpower", "root", "");
    }
    
    public void guardar(Empleado empleado) throws SQLException{
        
        PreparedStatement preparedStatement = conectarMySQL.getConnection().prepareStatement("Insert into empleados value (?,?,?,?)");
        
        preparedStatement.setString(1, empleado.getCodigo());
        preparedStatement.setString(2, empleado.getNombres());
        preparedStatement.setString(3, empleado.getApellidos());
        preparedStatement.setString(4, empleado.getFechaNacimiento());
        preparedStatement.execute();
        
    }
    
    public Empleado consultar(String codigo) throws SQLException{
        Empleado empleado = null;
        PreparedStatement preparedStatement = conectarMySQL.getConnection().
                prepareStatement("Select nombres,apellidos,fechanacimiento from empleados where codigo = ?" );
        preparedStatement.setString(1,codigo);
        ResultSet resultado = preparedStatement.executeQuery();
        
        if(resultado.next()){
            
            empleado = new
                
                Empleado(codigo,resultado.getString(1),
                        resultado.getString(2),
                        resultado.getString(3));
        }
        return empleado;
        
    }
     public Empleado eliminar(String codigo) throws SQLException{
        Empleado empleado = null;
        PreparedStatement preparedStatement = conectarMySQL.getConnection().
                prepareStatement("Delete from empleados where codigo = ?" );
        preparedStatement.setString(1,codigo);
        ResultSet resultado = preparedStatement.executeQuery();
        
        if(resultado.next()){
            
            empleado = new
                
                Empleado(codigo,resultado.getString(1),
                        null,
                        null);
        }
        return empleado;
        
    }
            
    public void consultar(){
        
        
    }
    
    public void actualizar(){
        
        
    }
    
    public void eliminar(){
        
        
    }
    

}
