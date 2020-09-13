
package clases;

import java.io.PrintWriter;


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
    
    

    public void guardarDetalleFact(PrintWriter escribe) {
       
        escribe.println("--------------------");
        escribe.println(numFactura);
        escribe.println(" "+producto);
        escribe.println(" "+cantidadVenta);
        escribe.println(" "+subtotal);
        escribe.println("--------------------");
    }
    
    public void guardarFactHoriz(PrintWriter escribe) {
       
        escribe.print(numFactura);
        escribe.print(" | "+producto);
        escribe.print(" | "+cantidadVenta);
        escribe.print(" | "+subtotal);
        escribe.println(" ");
    }
   
}
