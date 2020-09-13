package clases;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;

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
            escribe.print(" "+this.codigoProd);
            escribe.print(" | "+this.nombreProd);
            escribe.print(" | "+this.referenciaProd+" ");
            escribe.print(" | "+this.stockProd);
            escribe.print(" | "+this.precioProd);
            escribe.println();
            escribe.close();    
        } catch (IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }

    public void guardarSoloNombres(String archivo) { 
       
       try {
        File archivo_plano = new File (archivo);

        if(!archivo_plano.exists() )
        {
            archivo_plano.createNewFile();           
        }            
        FileWriter fw = new FileWriter(archivo_plano,true);
        BufferedWriter bw = new BufferedWriter(fw);    
        PrintWriter escribe = new PrintWriter(bw);
        escribe.print(this.nombreProd);
        escribe.print("  |  "+this.codigoProd);
        escribe.print("  |  "+this.precioProd);
        escribe.println();
        escribe.close();    
    } catch (IOException ioe){
        System.out.println("Exception occurred:");
        ioe.printStackTrace();
    }
    }
    
}
