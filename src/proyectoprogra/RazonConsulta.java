
package proyectoprogra;

import javax.swing.JOptionPane;

public class RazonConsulta {
    RazonConsul consulta=new RazonConsul();
    
    public void Consulta(){
        
        int opcion =0;
        
        do {
            opcion= Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "1. Urgencia"
                  + "\n2. Cita control"
                  + "\n3. Cita programada\n4. Salir"));
        
            switch (opcion){
                case 1: {
                    llenarFormulario();break;
                }
                
                case 2: {
                    menu1();break;
                    
                }
                
                case 3: {

                    menu2();break;
            }
            
            }      
        }while (opcion !=0);
        
            
        }
 public void llenarFormulario(){


}
 public void menu1(){
     
 }
 public void menu2(){
     
 }
}