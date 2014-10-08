/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesbac;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author DIEGO
 */
public class frmIngresarCita extends javax.swing.JFrame {

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Recursos/bac_icono.png"));
        return retValue;
    }
    /**
     * Creates new form frmIngresarCita
     */
    public frmIngresarCita() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox();
        jTextFieldCorreo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Citas");
        setIconImage(getIconImage());
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Citas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 520, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Correo:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(97, 325, 170, 32);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(97, 250, 170, 32);

        jComboBoxTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Regular", "Adulto Mayor", "Corporativo", "Embarazada", "Discapacitado" }));
        getContentPane().add(jComboBoxTipo);
        jComboBoxTipo.setBounds(310, 180, 270, 32);
        getContentPane().add(jTextFieldCorreo);
        jTextFieldCorreo.setBounds(310, 320, 270, 32);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jButton1.setText("Procesar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(312, 403, 268, 65);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Tipo de Usuario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 180, 170, 32);

        jButton2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(730, 430, 110, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 90, 910, 10);
        getContentPane().add(jTextFieldNombre);
        jTextFieldNombre.setBounds(312, 250, 270, 32);

        setSize(new java.awt.Dimension(906, 582));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide(); this.dispose();
        frmMenuPrincipal f1 = new frmMenuPrincipal(); f1.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextFieldNombre.getText().equals("") || jTextFieldCorreo.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Faltan datos por completar","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        else{
            jTextFieldCorreo.setText("");
            jTextFieldNombre.setText("");
            JOptionPane.showMessageDialog(null, "Cita registrada correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        //Esta instruccion aplica el skin
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.NebulaSkin");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIngresarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
