/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RestauranteSena;

import entorno.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sopa.Sopa;
/**
 *
 * @author SENA
 */
public class frmSopa extends javax.swing.JFrame {
public static List <Sopa> sopitas = new ArrayList <>();


    public  void setSopitas(List<Sopa> sopitas) {
        frmSopa.sopitas = sopitas;
    }
    
    
    
private int registroModificarS;

    public void setRegistroModificarS(int registroModificarS) {
        this.registroModificarS = registroModificarS;
    }

    public static List<Sopa> getSopitas() {
        return sopitas;
    }
    public int seleccion;
    conectar con = new conectar();
    Connection cn = con.conexion();

    
    /** Creates new form Sopa */
    public frmSopa() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabelnombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabelprecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabelcantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnRegistraragregar = new javax.swing.JButton();
        jButtonverConsola = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Arial Black", 1, 40)); // NOI18N
        titulo.setText("Sopas");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 160, 50));

        jLabelnombre.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        jLabelnombre.setText("Nombre Sopa:");
        jPanel1.add(jLabelnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 230, 30));

        jLabelprecio.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        jLabelprecio.setText("Precio:");
        jPanel1.add(jLabelprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 180, 30));

        jLabelcantidad.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        jLabelcantidad.setText("Cantidad:");
        jPanel1.add(jLabelcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 110, 30));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("E:\\RestauranteSena_\\src\\main\\resource\\image 2\\back.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 100, 50));

        btnRegistraragregar.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        btnRegistraragregar.setText("Agregar");
        btnRegistraragregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraragregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistraragregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 140, 50));

        jButtonverConsola.setFont(new java.awt.Font("Arial Black", 0, 19)); // NOI18N
        jButtonverConsola.setText("Ver Consola");
        jButtonverConsola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonverConsolaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonverConsola, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, 50));

        fondo.setIcon(new javax.swing.ImageIcon("E:\\RestauranteSena_\\src\\main\\resource\\image 2\\fondo sopa.jpg")); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        Menu atras = new Menu();
        
        atras.cbxIdioma.setSelectedIndex(seleccion);
            atras.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistraragregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraragregarActionPerformed
       
        String Nombre = this.txtNombre.getText();
        int Precio = Integer.parseInt( this.txtPrecio.getText());
        int Cantidad = Integer.parseInt(this.txtCantidad.getText());
       Sopa sopita = new Sopa(Nombre, Precio, Cantidad);
       
       if (btnRegistraragregar.getText() == "Agregar" || btnRegistraragregar.getText() == "Add") {
           
        sopitas.add(sopita);
        
         try {
                PreparedStatement ps = cn.prepareStatement("INSERT INTO sopa (nombre,precio,cantidad,estado) VALUES (?,?,?,?)");
                ps.setString(1, Nombre);
                ps.setInt(2, Precio);
                ps.setInt(3, Cantidad);
                ps.setString(4, "A");
                ps.executeUpdate();
                JOptionPane.showMessageDialog( null , "Sopa Registrada ");
                
            } catch (SQLException ex) {
               System.err.println(ex);
               JOptionPane.showMessageDialog(null, "Error al registrar la sopa ");
            }
        
       } else if (btnRegistraragregar.getText() == "Modificar") {
           //sopitas.set(this.registroModificarS, sopita);
           
            try {

                PreparedStatement ps = cn.prepareStatement("UPDATE sopa SET nombre= '" + Nombre + "', precio= " + Precio + ", cantidad= " + Cantidad + " WHERE id=" + sopitas.get(registroModificarS).id);
                int respuesta = ps.executeUpdate();

                if (respuesta > 0) {
                    JOptionPane.showMessageDialog(null, "Actualización exitosa");
                }

            } catch (SQLException e) {

                System.err.println("Error al actualizar " + e);

            }
        }
       
     LimpiarCampos();
        
    }//GEN-LAST:event_btnRegistraragregarActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void jButtonverConsolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonverConsolaActionPerformed

        sopitas.forEach(sopitas -> {
            System.out.println("Nombre \t Precio \t Cantidad "); 
            System.out.println(sopitas.nombre + "\t" + sopitas.precio + "\t" + sopitas.cantidad);
        });
        
    }//GEN-LAST:event_jButtonverConsolaActionPerformed


    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmSopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSopa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSopa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistraragregar;
    public javax.swing.JLabel fondo;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButtonverConsola;
    public javax.swing.JLabel jLabelcantidad;
    public javax.swing.JLabel jLabelnombre;
    public javax.swing.JLabel jLabelprecio;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel titulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void LimpiarCampos() {
       this.txtNombre.setText("");
       this.txtPrecio.setText("");
       this.txtCantidad.setText("");
    }

    void modificarSopa() {
      btnRegistraragregar.setText("Modificar");
        System.out.println("Registro Sopa" + this.registroModificarS);
        
        sopitas.forEach(sopitas -> {
            System.out.println(sopitas.id + "\t" + sopitas.nombre + "\t" + sopitas.precio + "\t" + sopitas.cantidad);
        });
        
        this.txtNombre.setText((sopitas.get(this.registroModificarS).nombre));
        this.txtPrecio.setText(Integer.toString(sopitas.get(this.registroModificarS).precio));
        this.txtCantidad.setText(Integer.toString(sopitas.get(this.registroModificarS).cantidad));
    }

}
