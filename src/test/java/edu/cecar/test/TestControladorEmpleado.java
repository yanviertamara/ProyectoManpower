/**
 * Clase: TestControladorEmpleado
 * 
 * @version: 0.2
 *  
 * @since: 12/08/2019
 * 
 * Fecha de Modificación:22/
 * 
 * @author: Yanvier Tamara Meriño
 * 
 * Copyrigth: CECAR
 */
package edu.cecar.test;

import edu.cecar.controladores.ControladorEmpleado;
import edu.cecar.modelos.Empleado;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1102884264
 */
public class TestControladorEmpleado {
    
   @Test
   public void testConexionBaseDatos(){
       
       try{
           ControladorEmpleado controladorEmpleado =
               new ControladorEmpleado();
           System.out.println("Conexion exitosa ");
           
       } catch(Exception ex) {
           
           fail("Error de conexion");
           Logger.getLogger(TestControladorEmpleado.class.getName()) // log para saber donde ha estado el error (historial :v)
                   .log(Level.SEVERE,null,ex);
       }
       
       
   }
   
   @Test
   public void testGuardar(){
       Empleado empleado1 = new Empleado("1234","yanvier","tamara","1998-09-25");
       Empleado empleado2 = new Empleado("4567","juan","meriño","1999-10-29");
       Empleado empleado3 = new Empleado("7890","cristian","martinez","2000-12-15");
       Empleado empleado4 = new Empleado("1011","santiago","lopez","1990-01-02");
       Empleado empleado5 = new Empleado("1213","pedro","perez","1993-04-06");
       
      ControladorEmpleado controladorEmpleado = new ControladorEmpleado(); 
      try{
          
         controladorEmpleado.guardar(empleado1);
         controladorEmpleado.guardar(empleado2);
         controladorEmpleado.guardar(empleado3);
         controladorEmpleado.guardar(empleado4);
         controladorEmpleado.guardar(empleado5);
          
          Empleado empleadoBaseDatos1 =  controladorEmpleado.consultar(empleado1.getCodigo());
          Empleado empleadoBaseDatos2 =  controladorEmpleado.consultar(empleado2.getCodigo());
          Empleado empleadoBaseDatos3 =  controladorEmpleado.consultar(empleado3.getCodigo());
          Empleado empleadoBaseDatos4 =  controladorEmpleado.consultar(empleado4.getCodigo());
          Empleado empleadoBaseDatos5 =  controladorEmpleado.consultar(empleado5.getCodigo());
          
          
                      
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado1.getCodigo(), empleadoBaseDatos1.getCodigo());
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado2.getCodigo(), empleadoBaseDatos2.getCodigo());
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado3.getCodigo(), empleadoBaseDatos3.getCodigo());
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado4.getCodigo(), empleadoBaseDatos4.getCodigo());
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado5.getCodigo(), empleadoBaseDatos5.getCodigo());
          
          assertEquals("El nombre esperado no coincide con el insertado",
                  empleado1.getNombres(), empleadoBaseDatos1.getNombres());
          assertEquals("El nombre esperado no coincide con el insertado",
                  empleado2.getNombres(), empleadoBaseDatos2.getNombres());
          assertEquals("El nombre esperado no coincide con el insertado",
                  empleado3.getNombres(), empleadoBaseDatos3.getNombres());
          assertEquals("El nombre esperado no coincide con el insertado",
                  empleado4.getNombres(), empleadoBaseDatos4.getNombres());
          assertEquals("El nombre esperado no coincide con el insertado",
                  empleado5.getNombres(), empleadoBaseDatos5.getNombres());
          
          assertEquals("Los apellidos esperados no coinciden con los insertados",
                  empleado1.getApellidos(), empleadoBaseDatos1.getApellidos());
          assertEquals("Los apellidos esperados no coinciden con los insertados",
                  empleado2.getApellidos(), empleadoBaseDatos2.getApellidos());
          assertEquals("Los apellidos esperados no coinciden con los insertados",
                  empleado3.getApellidos(), empleadoBaseDatos3.getApellidos());
          assertEquals("Los apellidos esperados no coinciden con los insertados",
                  empleado4.getApellidos(), empleadoBaseDatos4.getApellidos());
          assertEquals("Los apellidos esperados no coinciden con los insertados",
                  empleado5.getApellidos(), empleadoBaseDatos5.getApellidos());
          
          assertEquals("El fecha esperada no coincide con la insertada",
                  empleado1.getFechaNacimiento(), empleadoBaseDatos1.getFechaNacimiento());
          assertEquals("El fecha esperada no coincide con la insertada",
                  empleado2.getFechaNacimiento(), empleadoBaseDatos2.getFechaNacimiento());
          assertEquals("El fecha esperada no coincide con la insertada",
                  empleado3.getFechaNacimiento(), empleadoBaseDatos3.getFechaNacimiento());
          assertEquals("El fecha esperada no coincide con la insertada",
                  empleado4.getFechaNacimiento(), empleadoBaseDatos4.getFechaNacimiento());
          assertEquals("El fecha esperada no coincide con la insertada",
                  empleado5.getFechaNacimiento(), empleadoBaseDatos5.getFechaNacimiento());
         
          
          
          
      }catch(SQLException ex){
          
         Logger.getLogger(TestControladorEmpleado.class.getName()) // log para saber donde ha estado el error (historial :v)
                   .log(Level.SEVERE,null,ex); 
          
      }
       
       
   }
   
  @Test
  public void testActualizar(){
       Empleado empleado1 = new Empleado("1234","juan","tamara","1990-10-26");
       Empleado empleado2 = new Empleado("4567","yanvier","meriño","1991-11-30");
       Empleado empleado3 = new Empleado("7890","santiago","martinez","2002-12-16");
       Empleado empleado4 = new Empleado("1011","pedro","lopez","1993-01-03");
       Empleado empleado5 = new Empleado("1213","cristian","perez","1994-05-07");
       
      ControladorEmpleado controladorEmpleado = new ControladorEmpleado(); 
      try{
          
         controladorEmpleado.actualizar(empleado1);
         controladorEmpleado.actualizar(empleado2);
         controladorEmpleado.actualizar(empleado3);
         controladorEmpleado.actualizar(empleado4);
         controladorEmpleado.actualizar(empleado5);
          
          Empleado empleadoBaseDatos1 =  controladorEmpleado.consultar(empleado1.getCodigo());
          Empleado empleadoBaseDatos2 =  controladorEmpleado.consultar(empleado2.getCodigo());
          Empleado empleadoBaseDatos3 =  controladorEmpleado.consultar(empleado3.getCodigo());
          Empleado empleadoBaseDatos4 =  controladorEmpleado.consultar(empleado4.getCodigo());
          Empleado empleadoBaseDatos5 =  controladorEmpleado.consultar(empleado5.getCodigo());
          
          
                      
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado1.getCodigo(), empleadoBaseDatos1.getCodigo());
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado2.getCodigo(), empleadoBaseDatos2.getCodigo());
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado3.getCodigo(), empleadoBaseDatos3.getCodigo());
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado4.getCodigo(), empleadoBaseDatos4.getCodigo());
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado5.getCodigo(), empleadoBaseDatos5.getCodigo());
          
          
          
          
      }catch(SQLException ex){
          
         Logger.getLogger(TestControladorEmpleado.class.getName()) // log para saber donde ha estado el error (historial :v)
                   .log(Level.SEVERE,null,ex); 
          
      }
       
       
   }
  
   @Test
    public void testEliminar(){
       Empleado empleado1 = new Empleado("1234","juan","tamara","1990-10-26");
       Empleado empleado2 = new Empleado("4567","yanvier","meriño","1991-11-30");
       Empleado empleado3 = new Empleado("7890","santiago","martinez","2002-12-16");
       Empleado empleado4 = new Empleado("1011","pedro","lopez","1993-01-03");
       Empleado empleado5 = new Empleado("1213","cristian","perez","1994-05-07");
       
      ControladorEmpleado controladorEmpleado = new ControladorEmpleado(); 
      try{
          
         controladorEmpleado.eliminar(empleado1);
         controladorEmpleado.eliminar(empleado2);
         controladorEmpleado.eliminar(empleado3);
         controladorEmpleado.eliminar(empleado4);
         controladorEmpleado.eliminar(empleado5);
          
          Empleado empleadoBaseDatos1 =  controladorEmpleado.consultar(empleado1.getCodigo());
          Empleado empleadoBaseDatos2 =  controladorEmpleado.consultar(empleado2.getCodigo());
          Empleado empleadoBaseDatos3 =  controladorEmpleado.consultar(empleado3.getCodigo());
          Empleado empleadoBaseDatos4 =  controladorEmpleado.consultar(empleado4.getCodigo());
          Empleado empleadoBaseDatos5 =  controladorEmpleado.consultar(empleado5.getCodigo());
          
          
                      
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado1.getCodigo(), empleadoBaseDatos1.getCodigo());
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado2.getCodigo(), empleadoBaseDatos2.getCodigo());
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado3.getCodigo(), empleadoBaseDatos3.getCodigo());
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado4.getCodigo(), empleadoBaseDatos4.getCodigo());
          assertEquals("El codigo esperado no coincide con el insertado",
                  empleado5.getCodigo(), empleadoBaseDatos5.getCodigo());
              


          }catch(SQLException ex){

             Logger.getLogger(TestControladorEmpleado.class.getName()) // log para saber donde ha estado el error (historial :v)
                       .log(Level.SEVERE,null,ex); 

          }


       }
       
   
}
