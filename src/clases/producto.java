package clases;

import java.io.PrintWriter;

public class producto {
    
    private String codigoProd;
    private String nombreProd;
    private String referenciaProd;
    private int stockProd;
    private float precioProd;
    
    //Constructor
    public producto() {
    }

    public producto(String codigoProd, String nombreProd, String referenciaProd, int stockProd, float precioProd ) {
        this.codigoProd = codigoProd;
        this.nombreProd = nombreProd;
        this.referenciaProd = referenciaProd;
        this.stockProd = stockProd;
        this.precioProd = precioProd;
    }
    
    //Getters & Setters
    public String getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(String codigoProd) {
        this.codigoProd = codigoProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public String getReferenciaProd() {
        return referenciaProd;
    }

    public void setReferenciaProd(String referenciaProd) {
        this.referenciaProd = referenciaProd;
    }

    public int getStockProd() {
        return stockProd;
    }

    public void setStockProd(int stockProd) {
        this.stockProd = stockProd;
    }

    public float getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(float precioProd) {
        this.precioProd = precioProd;
    }
    
    

    public void guardar(PrintWriter escribe) {
        escribe.print(" "+codigoProd);
        escribe.print(" | "+nombreProd);
        escribe.print(" | "+referenciaProd+" ");
        escribe.print(" | "+stockProd);
        escribe.print(" | "+precioProd);
        escribe.println();
    }

    public void guardarSoloNombres(PrintWriter escribe) { 
       escribe.print(nombreProd);
       escribe.print("  |  "+codigoProd);
       escribe.print("  |  "+precioProd);
       escribe.println();
    }
    
}
