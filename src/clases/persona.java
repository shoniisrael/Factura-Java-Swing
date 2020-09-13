package clases;

import java.io.PrintWriter;

public class persona {
    
    private String codigoPer;
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    
    
    public persona(){}

    public persona(String codigoPer, String cedula, String nombre, String direccion, String telefono) {
        this.codigoPer = codigoPer;
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCodigoPer() {
        return codigoPer;
    }

    public void setCodigoPer(String codigoPer) {
        this.codigoPer = codigoPer;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void guardar(PrintWriter escribe) {
        escribe.print(codigoPer);
        escribe.print(" | "+cedula);
        escribe.print(" | "+nombre);
        escribe.print(" | "+direccion);
        escribe.print(" | "+telefono);
        escribe.println();
    }
    
     public void guardarSoloNombresClientes (PrintWriter escribe) {
        escribe.print(nombre);
        escribe.println();
    }
    
}
