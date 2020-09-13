package interfaces;

import clases.producto;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class frmRegistroProductos extends javax.swing.JFrame {

    private ArrayList<producto> lstProductos = new ArrayList<producto>();   
    private String rutaArchPlano = System.getProperty("user.dir")+"\\DatosAplicacion\\";
    
    public frmRegistroProductos() {
        initComponents();
        //Centramos el jFrame
        this.setLocationRelativeTo(null);
        
        //Desactivamos botones 
        btnNuevoProd.setEnabled(false);
        btnGuardarProds.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoProd = new javax.swing.JTextField();
        txtNombreProd = new javax.swing.JTextField();
        txtReferProd = new javax.swing.JTextField();
        txtStockProd = new javax.swing.JTextField();
        btnAgregarProd = new javax.swing.JButton();
        btnCancelarP = new javax.swing.JButton();
        btnGuardarProds = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblProducto = new javax.swing.JTable();
        btnNuevoProd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioProd = new javax.swing.JTextField();
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
        jLabel3.setText("REGISTRO DE PRODUCTO");

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel4.setText("Referencia:");

        jLabel5.setText("Stock:");

        txtCodigoProd.setText("Ingrese el código");
        txtCodigoProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoProdFocusLost(evt);
            }
        });

        txtNombreProd.setText("Ingrese el nombre del producto");
        txtNombreProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreProdFocusLost(evt);
            }
        });

        txtReferProd.setText("Ingrese referencia");
        txtReferProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtReferProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtReferProdFocusLost(evt);
            }
        });
        txtReferProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReferProdActionPerformed(evt);
            }
        });

        txtStockProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStockProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStockProdFocusLost(evt);
            }
        });
        txtStockProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockProdKeyTyped(evt);
            }
        });

        btnAgregarProd.setText("Agregar Producto");
        btnAgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProdActionPerformed(evt);
            }
        });

        btnCancelarP.setText("Salir");
        btnCancelarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPActionPerformed(evt);
            }
        });

        btnGuardarProds.setText("Guardar Productos");
        btnGuardarProds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProdsActionPerformed(evt);
            }
        });

        jtblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Referencia", "Stock", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblProducto);

        btnNuevoProd.setText("Nuevo Producto ");
        btnNuevoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProdActionPerformed(evt);
            }
        });

        jLabel6.setText("Precio:");

        txtPrecioProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioProdKeyTyped(evt);
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
                        .addGap(191, 191, 191)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtReferProd, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCodigoProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStockProd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(btnAgregarProd))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnNuevoProd)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnGuardarProds)
                                        .addGap(32, 32, 32)
                                        .addComponent(btnCancelarP, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReferProd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtStockProd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(btnAgregarProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarP)
                    .addComponent(btnGuardarProds)
                    .addComponent(btnNuevoProd))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtReferProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReferProdActionPerformed

    }//GEN-LAST:event_txtReferProdActionPerformed

    private void btnAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProdActionPerformed
        
        String cod;
        String nombre;
        String referencia;
        int stock;
        float precio;
        
        try {
            cod = txtCodigoProd.getText();
            nombre = txtNombreProd.getText();
            referencia = txtReferProd.getText();
            stock = Integer.parseInt(txtStockProd.getText());
            precio = Float.parseFloat(txtPrecioProd.getText());
            
            //Agregamos los atributos a la lista
            lstProductos.add(new producto(cod, nombre, referencia, stock, precio));
            JOptionPane.showMessageDialog(null, "Registro de datos ingresado correctamente");
        } catch (Exception e) {
            System.out.println("el error es:"+e);
            JOptionPane.showMessageDialog(null, "Error en los datos ingresados de producto");
        }
        
        mostrarProductos();
        txtCodigoProd.setEnabled(false);
        txtNombreProd.setEnabled(false);
        txtReferProd.setEnabled(false);
        txtStockProd.setEnabled(false);
        txtPrecioProd.setEnabled(false);
        
        //Habilitamos botones
        btnNuevoProd.setEnabled(true);
        btnGuardarProds.setEnabled(true);
        btnAgregarProd.setEnabled(false);
        
    }//GEN-LAST:event_btnAgregarProdActionPerformed

    private void btnCancelarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnCancelarPActionPerformed

    private void btnGuardarProdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProdsActionPerformed
        try {
            guardarProdsEnArchPlano();
            guardarSoloProdsArchPlano();
            
            //mostramos mensajes
            JOptionPane.showMessageDialog(null, "Productos guardados en la DB");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error en la grabación del txt");
        }
    }//GEN-LAST:event_btnGuardarProdsActionPerformed

    private void txtCodigoProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoProdFocusGained
        if(txtCodigoProd.getText().equals("Ingrese el código")){
            txtCodigoProd.setText(" ");
        }
    }//GEN-LAST:event_txtCodigoProdFocusGained

    private void txtCodigoProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoProdFocusLost
        if(txtCodigoProd.getText().equals(" ")){
            txtCodigoProd.setText("Ingrese el código");
        }
    }//GEN-LAST:event_txtCodigoProdFocusLost

    private void txtNombreProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreProdFocusGained
        if(txtNombreProd.getText().equals("Ingrese el nombre del producto")){
            txtNombreProd.setText(" ");
        }
    }//GEN-LAST:event_txtNombreProdFocusGained

    private void txtNombreProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreProdFocusLost
        if(txtNombreProd.getText().equals(" ")){
            txtNombreProd.setText("Ingrese el nombre del producto");
        }
    }//GEN-LAST:event_txtNombreProdFocusLost

    private void txtReferProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReferProdFocusGained
        if(txtReferProd.getText().equals("Ingrese referencia")){
            txtReferProd.setText(" ");
        }
    }//GEN-LAST:event_txtReferProdFocusGained

    private void txtReferProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReferProdFocusLost
        if(txtReferProd.getText().equals(" ")){
            txtReferProd.setText("Ingrese referencia");
        }
    }//GEN-LAST:event_txtReferProdFocusLost

    private void txtStockProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStockProdFocusGained
      
    }//GEN-LAST:event_txtStockProdFocusGained

    private void txtStockProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStockProdFocusLost
     
    }//GEN-LAST:event_txtStockProdFocusLost

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new frmRegistroClientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mitmListadoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmListadoClientesActionPerformed

        new frmListadoClientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mitmListadoClientesActionPerformed

    private void mitmRegistroProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmRegistroProductosActionPerformed
 
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

    private void btnNuevoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProdActionPerformed
        txtCodigoProd.setEnabled(true);
        txtNombreProd.setEnabled(true);
        txtReferProd.setEnabled(true);
        txtStockProd.setEnabled(true);
        txtPrecioProd.setEnabled(true);
        btnAgregarProd.setEnabled(true);
        
        limpiar();
    }//GEN-LAST:event_btnNuevoProdActionPerformed

    private void txtStockProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockProdKeyTyped
         char validador = evt.getKeyChar();
        
        if(Character.isLetter(validador)){
            getToolkit().beep();
            evt.consume();
        
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números!  ");
            txtStockProd.setText("");
        }
    }//GEN-LAST:event_txtStockProdKeyTyped

    private void txtPrecioProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioProdKeyTyped
         char validador = evt.getKeyChar();
        
        if(Character.isLetter(validador)){
            getToolkit().beep();
            evt.consume();
        
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números!  ");
            txtPrecioProd.setText("");
        }
    }//GEN-LAST:event_txtPrecioProdKeyTyped
    
    public void limpiar(){
        txtCodigoProd.setText("");
        txtNombreProd.setText("");
        txtReferProd.setText("");
        txtStockProd.setText("");
        txtPrecioProd.setText("");
    }
    
    public void mostrarProductos(){
        String matriProductos[][] = new String[lstProductos.size()][5];
        producto aux;
        
        for( int i=0; i<lstProductos.size();i++){
            aux = lstProductos.get(i);
            matriProductos[i][0] = aux.getCodigoProd();
            matriProductos[i][1] = aux.getNombreProd();
            matriProductos[i][2] = aux.getReferenciaProd();
            matriProductos[i][3] = Integer.toString(aux.getStockProd());
            matriProductos[i][4] = Float.toString(aux.getPrecioProd());
        }
        
        jtblProducto.setModel(new javax.swing.table.DefaultTableModel(
            matriProductos,
            new String [] {
                "Código", "Nombre", "Referencia", "Stock" , "Precio"
            }
        ));
    }
    
    public void guardarProdsEnArchPlano(){
        String archivo=rutaArchPlano+"productos.txt";
        producto aux;
            for (int i = 0; i < lstProductos.size(); i++) {
                aux = lstProductos.get(i);
                aux.guardar(archivo);
            }
    };
    
    public void guardarSoloProdsArchPlano(){
        String archivo=rutaArchPlano+"nombresProductos.txt";
        producto aux;
            for (int i = 0; i < lstProductos.size(); i++) {
                aux = lstProductos.get(i);
                aux.guardarSoloNombres(archivo);
            }
    }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmRegistroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProd;
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnGuardarProds;
    private javax.swing.JButton btnNuevoProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JTable jtblProducto;
    private javax.swing.JMenuItem mitmListadoClientes;
    private javax.swing.JMenuItem mitmListadoProductos;
    private javax.swing.JMenuItem mitmRegistroProductos;
    private javax.swing.JTextField txtCodigoProd;
    private javax.swing.JTextField txtNombreProd;
    private javax.swing.JTextField txtPrecioProd;
    private javax.swing.JTextField txtReferProd;
    private javax.swing.JTextField txtStockProd;
    // End of variables declaration//GEN-END:variables
}
