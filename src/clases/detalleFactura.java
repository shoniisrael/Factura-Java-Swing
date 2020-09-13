
package clases;

import java.io.PrintWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class detalleFactura {
    
    private String numFactura;
    private String producto;
    private int cantidadVenta;
    private float precioVenta;
    private float subtotal;
    private float total;
    
    public detalleFactura(){
        
    }

    public detalleFactura(String numFactura, String producto, int cantidadVenta, float precioVenta, float subtotal, float total) {
        this.numFactura = numFactura;
        this.producto = producto;
        this.cantidadVenta = cantidadVenta;
        this.precioVenta = precioVenta;
        this.subtotal = subtotal;
        this.total = total;
    }

    

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(int cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    

    public void guardarDetalleFact(String archivo) {

        try {
            File archivo_plano = new File (archivo);

            if(!archivo_plano.exists() ){//|| !archivo_plano_horiz.exists()){
                
                archivo_plano.createNewFile();           
            }
            
            FileWriter fw = new FileWriter(archivo_plano,true);
            BufferedWriter bw = new BufferedWriter(fw);    
            PrintWriter escribe = new PrintWriter(bw);
            
            escribe.println("--------------------");
            escribe.println(this.numFactura);
            escribe.println(" "+this.producto);
            escribe.println(" "+this.cantidadVenta);
            escribe.println(" "+this.subtotal);
            escribe.println("--------------------");
            escribe.close();    
        } catch (IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
    
    public void guardarFactHoriz(String archivo) {
       
        try {
            File archivo_plano = new File (archivo);

            if(!archivo_plano.exists() ){//|| !archivo_plano_horiz.exists()){
                
                archivo_plano.createNewFile();           
            }
            
            FileWriter fw = new FileWriter(archivo_plano,true);
            BufferedWriter bw = new BufferedWriter(fw);    
            PrintWriter escribe = new PrintWriter(bw);            
            escribe.print(numFactura);
            escribe.print(" | "+producto);
            escribe.print(" | "+cantidadVenta);
            escribe.print(" | "+subtotal);
            escribe.println(" ");
            escribe.close();    
        } catch (IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
   
}
