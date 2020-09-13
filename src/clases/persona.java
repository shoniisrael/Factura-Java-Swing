package clases;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;

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

    public void guardar(String archivo) {
        try {
            File archivo_plano = new File (archivo);

            if(!archivo_plano.exists() )
            {
                archivo_plano.createNewFile();           
            }
            
            FileWriter fw = new FileWriter(archivo_plano,true);
            BufferedWriter bw = new BufferedWriter(fw);    
            PrintWriter escribe = new PrintWriter(bw);
            escribe.print(this.codigoPer);
            escribe.print(" | "+this.cedula);
            escribe.print(" | "+this.nombre);
            escribe.print(" | "+this.direccion);
            escribe.print(" | "+this.telefono);
            escribe.println();
            escribe.close();    
        } catch (IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
    
     public void guardarSoloNombresClientes (String archivo) {
        try {
            File archivo_plano = new File (archivo);

            if(!archivo_plano.exists() ){
               archivo_plano.createNewFile();           
            }
            
            FileWriter fw = new FileWriter(archivo_plano,true);
            BufferedWriter bw = new BufferedWriter(fw);    
            PrintWriter escribe = new PrintWriter(bw);
            escribe.print(this.nombre);
            escribe.println();
            escribe.close();    
        } catch (IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
    
}
