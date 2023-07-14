/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteSena;

import entorno.conectar;
import java.io.Serial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import platoPrincipal.PlatoPrincipal;

/**
 *
 * @author SENA
 */
public class frmPlatoPricipal extends javax.swing.JFrame {

    public static List<PlatoPrincipal> platosPrincipales = new ArrayList<>();
    private int registroModificar;
    
    

    public void setPlatosPrincipales(List<PlatoPrincipal> platosPrincipales) {
        frmPlatoPricipal.platosPrincipales = platosPrincipales;
    }
    
    

    public void setRegistroModificar(int registroModificar) {
        this.registroModificar = registroModificar;
    }

    public static List<PlatoPrincipal> getPlatosPrincipales() {
        return platosPrincipales;

    }
    public int seleccion;
    conectar con = new conectar();
    Connection cn = con.conexion();

    /**
     * Creates new form PlatoPricipal
     */
    public frmPlatoPricipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nombreplato = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        precioplato = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        cantidadplato = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jButtonverconsola = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Arial Black", 1, 27)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Platos Principales");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, 80));

        nombreplato.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        nombreplato.setForeground(new java.awt.Color(255, 255, 255));
        nombreplato.setText("Nombre Plato:");
        jPanel1.add(nombreplato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, 30));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 210, 30));

        precioplato.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        precioplato.setForeground(new java.awt.Color(255, 255, 255));
        precioplato.setText("Precio:");
        jPanel1.add(precioplato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 170, 30));

        cantidadplato.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        cantidadplato.setForeground(new java.awt.Color(255, 255, 255));
        cantidadplato.setText("Cantidad:");
        jPanel1.add(cantidadplato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 130, 30));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 130, 30));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("E:\\RestauranteSena_\\src\\main\\resource\\image 2\\back.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 110, 50));

        btnRegistrar.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        btnRegistrar.setText("Agregar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 140, 50));

        jButtonverconsola.setFont(new java.awt.Font("Arial Black", 0, 19)); // NOI18N
        jButtonverconsola.setText("Ver Consola");
        jButtonverconsola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonverconsolaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonverconsola, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, 50));

        fondo.setIcon(new javax.swing.ImageIcon("E:\\RestauranteSena_\\src\\main\\resource\\image 2\\fondo plato.jpg")); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Menu atras = new Menu();
        
        atras.cbxIdioma.setSelectedIndex(seleccion);
       
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String Nombre = this.txtNombre.getText();
        int Precio = Integer.parseInt(this.txtPrecio.getText());
        int Cantidad = Integer.parseInt(this.txtCantidad.getText());
        PlatoPrincipal plato = new PlatoPrincipal(Nombre, Precio, Cantidad);

        if (btnRegistrar.getText() == "Agregar" || btnRegistrar.getText() == "Add" ) {
            platosPrincipales.add(plato);

            try {
                
                PreparedStatement ps = cn.prepareStatement("INSERT INTO platoprincipal (nombre,precio,cantidad,estado) VALUES (?,?,?,?)");
                ps.setString(1, Nombre);
                ps.setInt(2, Precio);
                ps.setInt(3, Cantidad);
                ps.setString(4, "A");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Plato Registrado ");

            } catch (SQLException ex) {
                System.err.println(ex);
                JOptionPane.showMessageDialog(null, "Error al registrar el plato");
            }

        } else if (btnRegistrar.getText() == "Modificar") {

//platosPrincipales.set(this.registroModificar, plato);  **************Eliminada**************

            try {

                PreparedStatement ps = cn.prepareStatement("UPDATE platoprincipal SET nombre= '" + Nombre + "', precio= " + Precio + ", cantidad= " + Cantidad + " WHERE id=" + platosPrincipales.get(registroModificar).id);
                int respuesta = ps.executeUpdate();

                if (respuesta > 0) {
                    JOptionPane.showMessageDialog(null, "Actualización exitosa");
                }

            } catch (SQLException e) {

                System.err.println("Error al actualizar " + e);

            }
        }

        limpiarCampos();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButtonverconsolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonverconsolaActionPerformed

        platosPrincipales.forEach(platosPrincipales -> {
            System.out.println("Nombre \t Precio \t Cantidad");
            System.out.println(platosPrincipales.nombrePlato + "\t" + platosPrincipales.precio + "\t" + platosPrincipales.cantidad);
        });


    }//GEN-LAST:event_jButtonverconsolaActionPerformed

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
            java.util.logging.Logger.getLogger(frmPlatoPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPlatoPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPlatoPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPlatoPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPlatoPricipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JLabel cantidadplato;
    public javax.swing.JLabel fondo;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButtonverconsola;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel nombreplato;
    public javax.swing.JLabel precioplato;
    public javax.swing.JLabel titulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        this.txtNombre.setText("");
        this.txtPrecio.setText("");
        this.txtCantidad.setText("");

    }

    void modificarPlato() {
        btnRegistrar.setText("Modificar");
        System.out.println("Registro plato" + this.registroModificar);

        platosPrincipales.forEach(platosPrincipales -> {
            System.out.println(platosPrincipales.id + "\t" + platosPrincipales.nombrePlato + "\t" + platosPrincipales.precio + "\t" + platosPrincipales.cantidad);
        });

        this.txtNombre.setText(platosPrincipales.get(this.registroModificar).nombrePlato);
        this.txtPrecio.setText(Integer.toString(platosPrincipales.get(this.registroModificar).precio));
        this.txtCantidad.setText(Integer.toString(platosPrincipales.get(this.registroModificar).cantidad));
    }
}