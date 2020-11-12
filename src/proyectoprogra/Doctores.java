
package proyectoprogra;

import javax.swing.JOptionPane;

public class Doctores {
    //hola a todos//
    private String Nombre, Apellido, ID, Especialidad;
    
    public void registroDoctores(){
       
        Nombre= JOptionPane.showInputDialog(null,
                "Digite su nombre:");
        Apellido= JOptionPane.showInputDialog(null, 
                "Digite su apellido:");
        ID= JOptionPane.showInputDialog(null, 
                "Digite su ID:");
        Especialidad= JOptionPane.showInputDialog(null, 
                "Digite su especialidad:");
        
        JOptionPane.showMessageDialog(null, "Doctor "+Nombre+" "+Apellido+", "+ID+", especializado en "+Especialidad);
    }
}
