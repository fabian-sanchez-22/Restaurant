
package RestauranteSena;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

        
public class frmfactura extends javax.swing.JFrame {

  
   
    public frmfactura() {
        initComponents();
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelVALORUNITARIO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbxPRODUCTO = new javax.swing.JComboBox<>();
        jButtonAGREGAR = new javax.swing.JButton();
        spnCANTIDAD = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabelVALORTOTAL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelIVA = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelTOTALPAGAR2 = new javax.swing.JLabel();
        jButtonATRAS = new javax.swing.JButton();
        jButtonSALIR = new javax.swing.JButton();
        fondofactura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VALOR TOTAL:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabelVALORUNITARIO.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabelVALORUNITARIO.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVALORUNITARIO.setText("$ 0.00 COP");
        jPanel2.add(jLabelVALORUNITARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CANTIDAD:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCTO:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        cbxPRODUCTO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxPRODUCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPRODUCTOActionPerformed(evt);
            }
        });
        jPanel2.add(cbxPRODUCTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));
        jPanel2.add(jButtonAGREGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, 60));

        spnCANTIDAD.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));
        jPanel2.add(spnCANTIDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("VALOR UNITARIO:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabelVALORTOTAL.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabelVALORTOTAL.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVALORTOTAL.setText("$ 0.00 COP");
        jPanel2.add(jLabelVALORTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        jTable1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 160));

        jLabelIVA.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabelIVA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIVA.setText("$ 0.00");
        jPanel2.add(jLabelIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("IVA:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TOTAL A PAGAR: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        jLabelTOTALPAGAR2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabelTOTALPAGAR2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTOTALPAGAR2.setText("$ 0.00");
        jPanel2.add(jLabelTOTALPAGAR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

        jButtonATRAS.setIcon(new javax.swing.ImageIcon("E:\\RestauranteSena_\\src\\main\\resource\\image 2\\back.png")); // NOI18N
        jButtonATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonATRASActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonATRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 466, 70, 50));

        jButtonSALIR.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonSALIR.setText("SALIR");
        jButtonSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSALIRActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 110, 40));

        fondofactura.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        fondofactura.setIcon(new javax.swing.ImageIcon("E:\\RestauranteSena_\\src\\main\\resource\\image 2\\fondo factura.jpg")); // NOI18N
        jPanel2.add(fondofactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonATRASActionPerformed
      
        
        login_Admin menu = new login_Admin();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonATRASActionPerformed

    private void cbxPRODUCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPRODUCTOActionPerformed

        
        
    }//GEN-LAST:event_cbxPRODUCTOActionPerformed

    private void jButtonSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSALIRActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jButtonSALIRActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmfactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmfactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmfactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmfactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmfactura().setVisible(true);
            }
        });
         
////        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxPRODUCTO;
    private javax.swing.JLabel fondofactura;
    private javax.swing.JButton jButtonAGREGAR;
    private javax.swing.JButton jButtonATRAS;
    private javax.swing.JButton jButtonSALIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelIVA;
    private javax.swing.JLabel jLabelTOTALPAGAR2;
    private javax.swing.JLabel jLabelVALORTOTAL;
    private javax.swing.JLabel jLabelVALORUNITARIO;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner spnCANTIDAD;
    // End of variables declaration//GEN-END:variables

        }
