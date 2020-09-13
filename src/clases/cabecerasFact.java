
package clases;

import java.io.PrintWriter;


public class cabecerasFact {
    
    private String numeroFactu;
    private String fechaFact;
    private String cliente;

    public cabecerasFact() {
    }

    public cabecerasFact(String numeroFactu, String fechaFact, String cliente) {
        this.numeroFactu = numeroFactu;
        this.fechaFact = fechaFact;
        this.cliente = cliente;
    }

    public String getNumeroFactu() {
        return numeroFactu;
    }

    public void setNumeroFactu(String numeroFactu) {
        this.numeroFactu = numeroFactu;
    }

    public String getFechaFact() {
        return fechaFact;
    }

    public void setFechaFact(String fechaFact) {
        this.fechaFact = fechaFact;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void guardar(PrintWriter escribe) {
        escribe.println("--------------------");
        escribe.println(numeroFactu);
        escribe.println(""+fechaFact);
        escribe.println(""+cliente);
        escribe.println("--------------------");
    }
    
    public void guardarHoriz(PrintWriter escribe) {
        escribe.print(numeroFactu);
        escribe.print(" | "+fechaFact);
        escribe.print(" | "+cliente);
        escribe.println(" ");
    }

    public void guardarSoloNumFacts(PrintWriter escribe) {
        escribe.print(numeroFactu);
        escribe.println();
    }
            
    
    
}
