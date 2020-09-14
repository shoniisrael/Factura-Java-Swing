package interfaces;

import clases.cabecerasFact;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.BufferedWriter;
import javax.swing.text.JTextComponent;


public class frmCabecera extends javax.swing.JFrame {

    private ArrayList<cabecerasFact> lstCabeceras = new ArrayList<cabecerasFact>();
    private String ubicacnArchPlano = System.getProperty("user.dir")+"\\DatosAplicacion\\";
    public void leerClientes(String texto){
            try {
                    //Lectura del archivo plano
                    File archivo_plano = new File (ubicacnArchPlano+"nombresPersonas.txt");
                    FileReader fr = new FileReader(archivo_plano);
                    
                    //Para leer archivo plano con read line
                    BufferedReader  br = new BufferedReader(fr);
                    
                    //Lectura Fichero
                    String linea = "";
                    cmbClientesCab.removeAllItems();
                    // for(int i=cmbClientesCab.getItemCount()-1;i>=0;i--){
                    //     cmbClientesCab.removeItemAt(i);
                    // }
                    // String[] nombres;
                    int intIndex =0;
                    while ((linea = br.readLine()) != null) {                
                        intIndex = linea.indexOf(texto);
                        if(intIndex>=0){
                            cmbClientesCab.addItem(linea);
                        }  
                                               
                    }
                    
                } catch (IOException e) {
                }
    }
   
    public frmCabecera() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Desactivamos botones 
        btnNuevaCabecera.setEnabled(false);
        btnGuardarCabecera.setEnabled(false);
        this.leerClientes("");
       
        int num_fact=0;
        try {
            //Lectura del archivo plano
            File archivo_plano2 = new File (ubicacnArchPlano+"cabecerasHoriz.txt");
            FileReader fr2 = new FileReader(archivo_plano2);
            
            //Para leer archivo plano con read line
            BufferedReader  br2 = new BufferedReader(fr2);
            
            //Lectura Fichero
            String linea2 = "";
            
            
            //Bucle mientras existan filas sacar datos
            while ((linea2 = br2.readLine()) != null) {                
                num_fact++;                
            }
            num_fact++;
            txtNumFact.setText(String.valueOf(num_fact));
        } catch (IOException e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumFact = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        cmbClientesCab = new javax.swing.JComboBox<String>();
        btnGuardarCabecera = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblProducto = new javax.swing.JTable();
        btnAgregarCabec = new javax.swing.JButton();
        btnNuevaCabecera = new javax.swing.JButton();
        button1 = new java.awt.Button();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mitmListadoClientes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mitmRegistroProductos = new javax.swing.JMenuItem();
        mitmListadoProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("N° Factura:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("REGISTRO DE CABECERA");

        jLabel2.setText("Cliente:");

        jLabel5.setText("Fecha:");

        txtNumFact.setEditable(false);
        txtNumFact.setText("Ingrese número de factura");
        txtNumFact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumFactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumFactFocusLost(evt);
            }
        });

        txtFecha.setText("dd/mm/yyyy");
        txtFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFechaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaFocusLost(evt);
            }
        });

        cmbClientesCab.setEditable(true);
        cmbClientesCab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un cliente" }));
        cmbClientesCab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientesCabActionPerformed(evt);
            }
        });

        btnGuardarCabecera.setText("Guardar Cabecera");
        btnGuardarCabecera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCabeceraActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jtblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N° Factura", "Fecha", "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblProducto);

        btnAgregarCabec.setText("Agregar Cabecera");
        btnAgregarCabec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCabecActionPerformed(evt);
            }
        });

        btnNuevaCabecera.setText("Nueva Cabecera");
        btnNuevaCabecera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCabeceraActionPerformed(evt);
            }
        });

        button1.setLabel("Buscar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jMenu3.setText("Archivo");

        jMenu6.setText("Clientes");

        jMenuItem2.setText("Registro Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        mitmListadoClientes.setText("Listado Clientes");
        mitmListadoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmListadoClientesActionPerformed(evt);
            }
        });
        jMenu6.add(mitmListadoClientes);

        jMenu3.add(jMenu6);

        jMenu1.setText("Productos");

        mitmRegistroProductos.setText("Registro Productos");
        mitmRegistroProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmRegistroProductosActionPerformed(evt);
            }
        });
        jMenu1.add(mitmRegistroProductos);

        mitmListadoProductos.setText("Listado Productos");
        mitmListadoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmListadoProductosActionPerformed(evt);
            }
        });
        jMenu1.add(mitmListadoProductos);

        jMenu3.add(jMenu1);

        jMenuBar2.add(jMenu3);

        jMenu2.setText("Cabeceras");

        jMenuItem4.setText("Registro Cabeceras");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Listado Cabeceras");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar2.add(jMenu2);

        jMenu4.setText("Facturas");

        jMenuItem3.setText("Detalle Facturas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem6.setText("Listado Detalle Facturas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar2.add(jMenu4);

        jMenu8.setText("Acerca De");

        jMenuItem7.setText("jMenuItem7");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem7);

        jMenuBar2.add(jMenu8);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnNuevaCabecera)
                                .addGap(38, 38, 38)
                                .addComponent(btnGuardarCabecera)
                                .addGap(44, 44, 44)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNumFact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cmbClientesCab, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(19, 19, 19)
                                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(24, 24, 24)
                                    .addComponent(btnAgregarCabec))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtNumFact, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cmbClientesCab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregarCabec))
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnGuardarCabecera)
                    .addComponent(btnNuevaCabecera))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void cmbClientesCabActionPerformed(java.awt.event.ActionEvent evt) {        
        // JTextComponent editor = (JTextComponent) cmbClientesCab.getEditor().getEditorComponent();
        // System.out.println(editor.getText());
        // this.leerClientes(editor.getText());
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAgregarCabecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCabecActionPerformed

        String numFact;
        String Fecha;
        String cliente;

        try {
            numFact = txtNumFact.getText();
            Fecha = txtFecha.getText();
            cliente = cmbClientesCab.getSelectedItem().toString();

            //Agregamos los atributos a la lista
            lstCabeceras.add(new cabecerasFact(numFact, Fecha, cliente));
            JOptionPane.showMessageDialog(null, "Registro de datos ingresado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en los datos ingresados de producto");
        }
        txtNumFact.setEnabled(false);
        txtFecha.setEnabled(false);
        cmbClientesCab.setEnabled(false);
        btnAgregarCabec.setEnabled(false);
        mostrarCabeceras();
        
        //Activamos botones 
        btnNuevaCabecera.setEnabled(true);
        btnGuardarCabecera.setEnabled(true);
    }//GEN-LAST:event_btnAgregarCabecActionPerformed

    private void btnGuardarCabeceraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCabeceraActionPerformed
         try {
            guardSoloNumFactArchPlano();
            guardarCabecEnArchPlano();
            guardarCabeHorizArchPlano();
            JOptionPane.showMessageDialog(null, "Clientes guardados en la DB");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error en la grabación del txt");
        }
    }//GEN-LAST:event_btnGuardarCabeceraActionPerformed

    private void txtNumFactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumFactFocusGained
        if(txtNumFact.getText().equals("Ingrese número de factura")){
            txtNumFact.setText(" ");
        }
    }//GEN-LAST:event_txtNumFactFocusGained

    private void txtNumFactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumFactFocusLost
        if(txtNumFact.getText().equals(" ")){
            txtNumFact.setText("Ingrese número de factura");
        }
    }//GEN-LAST:event_txtNumFactFocusLost

    private void txtFechaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFocusGained
        if(txtFecha.getText().equals("dd/mm/yyyy")){
            txtFecha.setText(" ");
        }
    }//GEN-LAST:event_txtFechaFocusGained

    private void txtFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFocusLost
         if(txtFecha.getText().equals(" ")){
            txtFecha.setText("dd/mm/yyyy");
        }
    }//GEN-LAST:event_txtFechaFocusLost

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new frmRegistroClientes().setVisible(true);
        this.dispose();                        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mitmListadoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmListadoClientesActionPerformed
        new frmListadoClientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mitmListadoClientesActionPerformed

    private void mitmRegistroProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmRegistroProductosActionPerformed
        new frmRegistroProductos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mitmRegistroProductosActionPerformed

    private void mitmListadoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmListadoProductosActionPerformed
        new frmListadoProductos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mitmListadoProductosActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new frmCabecera().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new frmListadoCabeceras().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new frmDetalleFactura().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new frmListadoDetallesFacturas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new frmAcercaDe().setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void btnNuevaCabeceraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCabeceraActionPerformed
        
        txtNumFact.setEnabled(true);
        txtFecha.setEnabled(true);
        cmbClientesCab.setSelectedIndex(0);
        cmbClientesCab.setEnabled(true);
        btnAgregarCabec.setEnabled(true);
         limpiar();
        
    }//GEN-LAST:event_btnNuevaCabeceraActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        JTextComponent editor = (JTextComponent) cmbClientesCab.getEditor().getEditorComponent();
        System.out.println(editor.getText());
        this.leerClientes(editor.getText());
    }//GEN-LAST:event_button1ActionPerformed
    
    public void limpiar(){
        txtNumFact.setText("");
        txtFecha.setText("");
        //selecciona cmb posicion inicial
    }
    
    public void mostrarCabeceras(){
        //revisar indice 2
        String[][] matriCabeceras = new String[lstCabeceras.size()][4];
        cabecerasFact aux;
        
        for( int i=0; i<lstCabeceras.size();i++){
            aux = lstCabeceras.get(i);
            matriCabeceras[i][0] = aux.getNumeroFactu();
            matriCabeceras[i][1] = aux.getFechaFact();
            matriCabeceras[i][2] = aux.getCliente();
        }
        
        jtblProducto.setModel(new javax.swing.table.DefaultTableModel(
            matriCabeceras,
            new String [] {
                 "N° Factura", "Fecha", "Cliente"
            }
        ));
    }

     public void guardarCabecEnArchPlano(){
        try {
            File archivo_plano_prods = new File (ubicacnArchPlano+"cabeceras.txt");

            if(!archivo_plano_prods.exists() ){//|| !archivo_plano_horiz.exists()){
                
                archivo_plano_prods.createNewFile();           
            }
            
            FileWriter fw = new FileWriter(archivo_plano_prods,true);
            BufferedWriter bw = new BufferedWriter(fw);    
            PrintWriter escribe = new PrintWriter(bw);     
            cabecerasFact aux;                
            
            for (int i = 0; i < lstCabeceras.size(); i++) {
                aux = lstCabeceras.get(i);               
                escribe.println("--------------------");
                escribe.println(""+aux.getNumeroFactu());
                escribe.println(""+aux.getFechaFact());
                escribe.println(""+aux.getCliente());
                escribe.println("--------------------");
               
                }
                escribe.close();    
        } catch (IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    };
     
     public void guardSoloNumFactArchPlano(){
        //  String archivo=ubicacnArchPlano+"numerosFacturas.txt";
        try {
            File arch_soloNumFacts = new File (ubicacnArchPlano+"numerosFacturas.txt");

            if(!arch_soloNumFacts.exists() ){//|| !archivo_plano_horiz.exists()){
                
                        arch_soloNumFacts.createNewFile();           
            }
            
            FileWriter fw = new FileWriter(arch_soloNumFacts,true);
            BufferedWriter bw = new BufferedWriter(fw);   
            PrintWriter escribe = new PrintWriter(bw);
            cabecerasFact aux;                
            
            for (int i = 0; i < lstCabeceras.size(); i++) {
                aux = lstCabeceras.get(i);
                escribe.print(aux.getNumeroFactu());
                escribe.println();
                    // aux.guardarSoloNumFacts(escribe);
                // aux.guardarHoriz(escribe2);
                }
                escribe.close();    
        } catch (IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
    
      public void guardarCabeHorizArchPlano(){
        try {
            File archivo_plano_cabec = new File (ubicacnArchPlano+"cabecerasHoriz.txt");

            if(!archivo_plano_cabec.exists() ){//|| !archivo_plano_horiz.exists()){
                
                archivo_plano_cabec.createNewFile();           
            }
            
            FileWriter fw = new FileWriter(archivo_plano_cabec,true);
            BufferedWriter bw = new BufferedWriter(fw);      
            PrintWriter escribe = new PrintWriter(bw);   
            cabecerasFact aux;                
            
            for (int i = 0; i < lstCabeceras.size(); i++) {
                aux = lstCabeceras.get(i);
                escribe.print(aux.getNumeroFactu());
                escribe.print(" | "+aux.getFechaFact());
                escribe.print(" | "+aux.getCliente());
                escribe.println(" ");
              
                    // aux.guardarSoloNumFacts(escribe);
                // aux.guardarHoriz(escribe2);
                }
                escribe.close();    
        } catch (IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    };
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCabecera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCabecera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCabecera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCabecera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCabecera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCabec;
    private javax.swing.JButton btnGuardarCabecera;
    private javax.swing.JButton btnNuevaCabecera;
    private java.awt.Button button1;
    private javax.swing.JComboBox<String> cmbClientesCab;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblProducto;
    private javax.swing.JMenuItem mitmListadoClientes;
    private javax.swing.JMenuItem mitmListadoProductos;
    private javax.swing.JMenuItem mitmRegistroProductos;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNumFact;
    // End of variables declaration//GEN-END:variables
}
