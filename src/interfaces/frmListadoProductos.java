package interfaces;

import clases.producto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmListadoProductos extends javax.swing.JFrame {

    private ArrayList<Object> lstAuxProductos = new ArrayList<Object>();   
    //private String rutaArchPlano = System.getProperty("user.dir")+"\\DatosAplicacion\\";
    //Defino un modelo de tabla nuevo
    DefaultTableModel modelTabla = new DefaultTableModel();
        
    // Ruta del archivo plano en el PC
    private String ubicacnArchPlano = System.getProperty("user.dir")+"\\DatosAplicacion\\";
 
    public frmListadoProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
            //Lectura del archivo plano
            File archivo_plano = new File (ubicacnArchPlano+"productos.txt");
            FileReader fr = new FileReader(archivo_plano);
            
            //Para leer archivo plano con read line
            BufferedReader  br = new BufferedReader(fr);
            
            //Lectura Fichero
            String linea = "";
            
            modelTabla.addColumn("Codigo");
            modelTabla.addColumn("Producto");
            modelTabla.addColumn("Alias Producto");
            modelTabla.addColumn("Stock");
            modelTabla.addColumn("Precio");

            
            //Bucle mientras existan filas sacar datos
            while ((linea = br.readLine()) != null) {                
                String[]  aux_linea=linea.split("\\|",5);               
                modelTabla.addRow(aux_linea);
            }
            
           //Cargo datos a la tabla 
           jtblListaProds.setModel(modelTabla);
        } catch (IOException e) {  
        }   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblListaProds = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnCancelarList = new javax.swing.JButton();
        btnEliminarProd = new javax.swing.JButton();
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

        jtblListaProds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Referencia", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jtblListaProds);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("LISTADO DE PRODUCTOS");

        btnCancelarList.setText("Salir");
        btnCancelarList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarListActionPerformed(evt);
            }
        });

        btnEliminarProd.setText("Eliminar Producto");
        btnEliminarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProdActionPerformed(evt);
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
                .addGap(93, 93, 93)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(201, 201, 201))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnEliminarProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarList, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarList)
                    .addComponent(btnEliminarProd))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarListActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnCancelarListActionPerformed

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

    private void btnEliminarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProdActionPerformed
        
        int indice = JOptionPane.showConfirmDialog(jMenu1, "Esta seguro de eliminar el registro?");
        int aux ;
        
        //0 es el boton si
        if(indice == 0){
            File archivo_plano_prods = new File (ubicacnArchPlano+"productos.txt");
            try {
                //Obtenemos indice de la linea a borrar
                aux = jtblListaProds.getSelectedRow();
                //borramos del modelo de tabla
                modelTabla.removeRow(aux);
                //Cargo datos nuevos a la tabla 
               jtblListaProds.setModel(modelTabla);

                ///Cargamos datos en una lista
                for (int i = 0; i < modelTabla.getRowCount(); i++) {
                      for (int j = 0; j < modelTabla.getColumnCount(); j++) {
                           //System.out.println("DATOS"+modelTabla.getValueAt(i, j));
                            lstAuxProductos.add(modelTabla.getValueAt(i, j));
                      }
                }

                //Grabamos los nuevos datos en la BD
                producto auxProd;
                PrintWriter escribe;
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivo_plano_prods));
                PrintWriter pw = new PrintWriter(bw);
                escribe = new PrintWriter(archivo_plano_prods,"utf-8");

                for (int i = 0; i < lstAuxProductos.size(); i++) {
                    pw.print(lstAuxProductos.get(i));
                }
                pw.close();   

            } catch (Exception e) {
            }
        } 
        
    }//GEN-LAST:event_btnEliminarProdActionPerformed


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
            java.util.logging.Logger.getLogger(frmListadoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListadoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListadoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListadoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListadoProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarList;
    private javax.swing.JButton btnEliminarProd;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTable jtblListaProds;
    private javax.swing.JMenuItem mitmListadoClientes;
    private javax.swing.JMenuItem mitmListadoProductos;
    private javax.swing.JMenuItem mitmRegistroProductos;
    // End of variables declaration//GEN-END:variables
}
