
package proyectoprogra;

public class Registro {
    
    private String nombre, Apellido, email, fechaCita, horaCita, tipoSangre;
    private int cedula, numeroCelular;
    //pongo aca el registro de los doctores y que en clase doctores se ingresen los datos?
    public Registro(){
        nombre = "";
        Apellido = "";
        email = "";
        fechaCita = "";
        cedula = 0;
        numeroCelular = 0;
        horaCita = "";
        tipoSangre= "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }
    
     public String gettipoSangre() {
        return horaCita;
    }

    public void settipoSangre(String horaCita) {
        this.horaCita = horaCita;
    
    }
    
}
