
package proyectoprogra;
//medicina general, ginecologia, pediatria, cardiologia, cirugia, fisioterapia//
import javax.swing.JOptionPane;

public class RegistroCitas {
    Registro paciente=new Registro();
    
    public void citaPaciente(){
        
        int opcion =0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1.Pediatria"
            +"\n2. Medicina General"
            +"\n3. Ginecologia"
            +"\n4. Cardiologia"
            +"\n5. Cirugia"
            +"\n6. Fisioterapia"
            +"\n7. Visualizar Cita\n0.Salir"));
            switch (opcion){
                case 1: {
                    almacenarInformación1();break;
                }
                case 2: {
                    almacenarInformación2();break;
                }
                case 3: {
                    almacenarInformación3();break;  
                }
                case 4: {
                    almacenarInformación4();break;
                }
                case 5: {
                    almacenarInformación5();break;
                } 
                case 6:{
                    almacenarInformación6();break;
                }
                case 7: {
                    informaciónCita();break;
                }
            }
            
        }while (opcion !=0);
        
    }
    
    public void almacenarInformación1(){
        paciente.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre:"));
        paciente.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su numero de cedula:")));
        paciente.setNumeroCelular(Integer.parseInt(JOptionPane.showInputDialog(null, "digite su numero de celular:")));
        paciente.setEmail(JOptionPane.showInputDialog(null, "digite su correo electronico:"));
        paciente.setFechaCita(JOptionPane.showInputDialog(null,"ingrese fecha para su cita:" ));
        paciente.setHoraCita(JOptionPane.showInputDialog(null, "ingrese la hora para su cita:"));
    }
    
    public void almacenarInformación2(){
        paciente.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre:"));
        paciente.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su numero de cedula:")));
        paciente.setNumeroCelular(Integer.parseInt(JOptionPane.showInputDialog(null, "digite su numero de celular:")));
        paciente.setEmail(JOptionPane.showInputDialog(null, "digite su correo electronico:"));
        paciente.setFechaCita(JOptionPane.showInputDialog(null,"ingrese fecha para su cita:" ));
        paciente.setHoraCita(JOptionPane.showInputDialog(null, "ingrese la hora para su cita:"));
    }
     public void almacenarInformación3(){
        paciente.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre:"));
        paciente.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su numero de cedula:")));
        paciente.setNumeroCelular(Integer.parseInt(JOptionPane.showInputDialog(null, "digite su numero de celular:")));
        paciente.setEmail(JOptionPane.showInputDialog(null, "digite su correo electronico:"));
        paciente.setFechaCita(JOptionPane.showInputDialog(null,"ingrese fecha para su cita:" ));
        paciente.setHoraCita(JOptionPane.showInputDialog(null, "ingrese la hora para su cita:"));
     }
      public void almacenarInformación4(){
        paciente.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre:"));
        paciente.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su numero de cedula:")));
        paciente.setNumeroCelular(Integer.parseInt(JOptionPane.showInputDialog(null, "digite su numero de celular:")));
        paciente.setEmail(JOptionPane.showInputDialog(null, "digite su correo electronico:"));
        paciente.setFechaCita(JOptionPane.showInputDialog(null,"ingrese fecha para su cita:" ));
        paciente.setHoraCita(JOptionPane.showInputDialog(null, "ingrese la hora para su cita:"));
      }
       public void almacenarInformación5(){
        paciente.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre:"));
        paciente.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su numero de cedula:")));
        paciente.setNumeroCelular(Integer.parseInt(JOptionPane.showInputDialog(null, "digite su numero de celular:")));
        paciente.setEmail(JOptionPane.showInputDialog(null, "digite su correo electronico:"));
        paciente.setFechaCita(JOptionPane.showInputDialog(null,"ingrese fecha para su cita:" ));
        paciente.setHoraCita(JOptionPane.showInputDialog(null, "ingrese la hora para su cita:"));
      }
        public void almacenarInformación6(){
        paciente.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre:"));
        paciente.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su numero de cedula:")));
        paciente.setNumeroCelular(Integer.parseInt(JOptionPane.showInputDialog(null, "digite su numero de celular:")));
        paciente.setEmail(JOptionPane.showInputDialog(null, "digite su correo electronico:"));
        paciente.setFechaCita(JOptionPane.showInputDialog(null,"ingrese fecha para su cita:" ));
        paciente.setHoraCita(JOptionPane.showInputDialog(null, "ingrese la hora para su cita:"));
      }
        public void informaciónCita(){
            JOptionPane.showMessageDialog(null,
                    "Paciente "+paciente.getNombre()+", cedula:" +paciente.getCedula()+", celular: "+paciente.getNumeroCelular()+
                            ", correo electronico: "+paciente.getEmail()+".\n"+
                                    "La fecha de su cita es el: "+paciente.getFechaCita()+" a las: "+paciente.getHoraCita());
            
        }
}
