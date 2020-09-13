package interfaces;

import clases.detalleFactura;
import clases.producto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class frmDetalleFactura extends javax.swing.JFrame {

    //Lista para guardar los productos
    
    
    //Arraylist para guardar los objetos producto y datos de factura
    private ArrayList<detalleFactura> lstDetalleFact = new ArrayList<detalleFactura>();
    private String ubicacnArchPlano = System.getProperty("user.dir")+"\\DatosAplicacion\\";
    
    
    public frmDetalleFactura() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Desactivamos botones 
        btnNuevoDetalle.setEnabled(false);
        btnGuardarDetFact.setEnabled(false);
        
        //Desactivamos textBox
        txtSubtotal.setEnabled(false);
        txtIva.setEnabled(false);
        txtTotal.setEnabled(false);
        
        
         try {
            //Lectura del archivo plano
            File archivo_plano = new File (ubicacnArchPlano+"nombresProductos.txt");
            File archivo_plano_facts = new File (ubicacnArchPlano+"numerosFacturas.txt");

            FileReader fr = new FileReader(archivo_plano);
            FileReader fr2 = new FileReader(archivo_plano_facts);
            
            //Para leer archivo plano con read line
            BufferedReader  br = new BufferedReader(fr);
            BufferedReader  br2 = new BufferedReader(fr2);
            
            //Variablr para Lectura Fichero
            String linea = "";
            
            //Bucle mientras existan filas sacar datos
            while ((linea = br.readLine()) != null) {                
                cbmProducto.addItem(linea);
            }
            
            while ((linea = br2.readLine()) != null) {                
                cbmNumFac.addItem(linea);
            }            
        } catch (IOException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDetalleFact = new javax.swing.JTable();
        cbmNumFac = new javax.swing.JComboBox<>();
        cbmProducto = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        btnGuardarDetFact = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAgregarDetalle = new javax.swing.JButton();
        btnNuevoDetalle = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioFinal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("DETALLE DE FACTURA");

        jLabel1.setText("Número de Factura:");

        jLabel2.setText("Lista Productos - Codigo:");

        jLabel4.setText("Cantidad:");

        jtblDetalleFact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jtblDetalleFact);

        cbmNumFac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Factura" }));

        cbmProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un producto" }));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        btnGuardarDetFact.setText("Guardar Factura");
        btnGuardarDetFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDetFactActionPerformed(evt);
            }
        });

        btnCancelar.setText("Salir");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAgregarDetalle.setText("Agregar");
        btnAgregarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDetalleActionPerformed(evt);
            }
        });

        btnNuevoDetalle.setText("Nuevo Detalle");
        btnNuevoDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDetalleActionPerformed(evt);
            }
        });

        jLabel5.setText("Subtotal:");

        jLabel6.setText("Total:");

        txtSubtotal.setText("0.00");

        txtTotal.setText("0.00");

        jLabel7.setText("Precio Venta:");

        txtPrecioFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioFinalKeyTyped(evt);
            }
        });

        jLabel8.setText("IVA:");

        txtIva.setText("0.00");

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

        jMenuItem1.setText("Listado Detalle Facturas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar2.add(jMenu4);

        jMenu8.setText("Acerca De");

        jMenuItem6.setText("Créditos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem6);

        jMenuBar2.add(jMenu8);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnNuevoDetalle)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarDetFact)
                        .addGap(27, 27, 27)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(txtPrecioFinal))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAgregarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbmNumFac, 0, 300, Short.MAX_VALUE)
                                            .addComponent(cbmProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(455, 455, 455))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtIva, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbmNumFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbmProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDetalle))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarDetFact)
                    .addComponent(btnCancelar)
                    .addComponent(btnNuevoDetalle))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarDetFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDetFactActionPerformed
         try {
            guardarDetFactEnArchPlano();
            guardDetFactHorizArchPlano();
            JOptionPane.showMessageDialog(null, "Clientes guardados en la DB");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error en la grabación del txt");
        }
    }//GEN-LAST:event_btnGuardarDetFactActionPerformed

    private void btnAgregarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDetalleActionPerformed
        
        String numFactura;
        String productoFact;
        
        int cantidad;
        float precio;
        float subtotalFactura;
        float totalFactura;
        
        try {
            numFactura = cbmNumFac.getSelectedItem().toString();
            productoFact = cbmProducto.getSelectedItem().toString();
            
            cantidad = Integer.parseInt(txtCantidad.getText());
            precio = Float.parseFloat(txtPrecioFinal.getText());
            
            subtotalFactura = cantidad*precio;
            totalFactura = Float.parseFloat(txtTotal.getText());  
            
            //Agregamos los atributos a la lista
            lstDetalleFact.add(new detalleFactura(numFactura, productoFact, cantidad, precio, subtotalFactura,totalFactura));
            JOptionPane.showMessageDialog(null, "Registro de datos ingresado correctamente");
            
        } catch (Exception e) {
            System.out.println("el error es:"+e);
            JOptionPane.showMessageDialog(null, "Error en los datos ingresados de producto");
        }
        cbmNumFac.setEnabled(false);
        cbmProducto.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtPrecioFinal.setEnabled(false);
        
        mostrarDetallesFact();     
        
        //Desactivamos botones 
        btnNuevoDetalle.setEnabled(true);
        btnGuardarDetFact.setEnabled(true);
        btnAgregarDetalle.setEnabled(false);
    }//GEN-LAST:event_btnAgregarDetalleActionPerformed

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new frmListadoDetallesFacturas().setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new frmAcercaDe().setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btnNuevoDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDetalleActionPerformed
      
        cbmNumFac.setSelectedIndex(0);
        cbmNumFac.setEnabled(true);
        cbmProducto.setSelectedIndex(0);
        cbmProducto.setEnabled(true);
        txtCantidad.setEnabled(true);
        txtPrecioFinal.setEnabled(true);
        btnAgregarDetalle.setEnabled(true);

        limpiar();        
    }//GEN-LAST:event_btnNuevoDetalleActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char validador = evt.getKeyChar();
        
        if(Character.isLetter(validador)){
            getToolkit().beep();
            evt.consume();
        
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números!  ");
            txtCantidad.setText("");
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioFinalKeyTyped
        
        char validador = evt.getKeyChar();
        
        if(Character.isLetter(validador)){
            getToolkit().beep();
            evt.consume();
        
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números!  ");
            txtPrecioFinal.setText("");
        }
    }//GEN-LAST:event_txtPrecioFinalKeyTyped

     public void mostrarDetallesFact(){
        String[][] matrDetallesFact = new String[lstDetalleFact.size()][5];
        detalleFactura aux;
        float subtotalCalc = 0;
        float iva = 0;
        float total = 0;
        
        for( int i=0; i<lstDetalleFact.size();i++){
            aux = lstDetalleFact.get(i);
           //matrDetallesFact[i][0] = aux.getNumFactura();
            matrDetallesFact[i][0] = aux.getProducto();
            matrDetallesFact[i][1] = Integer.toString(aux.getCantidadVenta());
            matrDetallesFact[i][2] = Float.toString(aux.getPrecioVenta());
            matrDetallesFact[i][3] = Float.toString(aux.getCantidadVenta() * aux.getPrecioVenta());
            
             subtotalCalc += (aux.getCantidadVenta() * aux.getPrecioVenta());
             iva = (float) (subtotalCalc * 0.12);
             total = subtotalCalc + iva;
             
             txtSubtotal.setText(Float.toString(subtotalCalc));
             txtIva.setText(Float.toString(iva));
             txtTotal.setText(Float.toString(total));
        }
        
        jtblDetalleFact.setModel(new javax.swing.table.DefaultTableModel(
            matrDetallesFact,
            new String [] {
               "Producto", "Cantidad", "Valor Unitario", "Valor Total"
            }
        ));
    }
    public void guardarDetFactEnArchPlano(){
    
        File archivo_plano_prods = new File (ubicacnArchPlano+"detalleFacturas.txt");
        PrintWriter escribe;
        
        //comprobamos si existe el archivo sino creamos
        if(!archivo_plano_prods.exists()){
            try {
                archivo_plano_prods.createNewFile();
            } catch (Exception e) {
            }
        }
        
        try {
            detalleFactura aux;
            escribe = new PrintWriter(archivo_plano_prods,"utf-8");
            //lstDetalleFact.add()
            for (int i = 0; i < lstDetalleFact.size(); i++) {
                aux = lstDetalleFact.get(i);
                aux.guardarDetalleFact(escribe);
            }
            escribe.close();          
        } catch (Exception e) {
        }
    };
     
     //NO VA BIEN MOSTRAR EN LA FORMA ACTUAL ESTOS DATOS 
      public void guardDetFactHorizArchPlano(){
    
        File archivo_plano_prods = new File (ubicacnArchPlano+"facturasHoriz.txt");
        PrintWriter escribe;
        
        //comprobamos si existe el archivo sino creamos
        if(!archivo_plano_prods.exists()){
            try {
                archivo_plano_prods.createNewFile();
            } catch (Exception e) {
            }
        }
        
        try {
            detalleFactura aux;
            escribe = new PrintWriter(archivo_plano_prods,"utf-8");
            for (int i = 0; i < lstDetalleFact.size(); i++) {
                aux = lstDetalleFact.get(i);
                aux.guardarFactHoriz(escribe);
            }
            escribe.close();          
        } catch (Exception e) {
        }
    };


     public void limpiar(){
         
        cbmNumFac.setSelectedIndex(0);
        cbmProducto.setSelectedIndex(0);
        txtCantidad.setText("");
        txtPrecioFinal.setText("");
    }

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
            java.util.logging.Logger.getLogger(frmDetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDetalleFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDetalle;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarDetFact;
    private javax.swing.JButton btnNuevoDetalle;
    private javax.swing.JComboBox<String> cbmNumFac;
    private javax.swing.JComboBox<String> cbmProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblDetalleFact;
    private javax.swing.JMenuItem mitmListadoClientes;
    private javax.swing.JMenuItem mitmListadoProductos;
    private javax.swing.JMenuItem mitmRegistroProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtPrecioFinal;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
