/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tp4_segundaversion;
import clases.*;
import java.awt.Color;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author salon
 */
public class Alumno extends javax.swing.JInternalFrame {
            HashSet<Alumnos> alumnoHash=new HashSet<>();
    /**
     * Creates new form Alumno
     */
    public Alumno(HashSet<Alumnos> alumnoHash) {
        initComponents();
         getContentPane().setBackground(Color.DARK_GRAY);
        this.alumnoHash=alumnoHash;
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtNombreA = new javax.swing.JTextField();
        jtApellidoA = new javax.swing.JTextField();
        jtLegajoA = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbTest = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("3270 Nerd Font", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Formulario Alumnos");

        jLabel2.setFont(new java.awt.Font("3270 Nerd Font", 0, 24)); // NOI18N
        jLabel2.setText("Nombre del Alumno:");

        jLabel3.setFont(new java.awt.Font("3270 Nerd Font", 0, 24)); // NOI18N
        jLabel3.setText("Apellido del Alumno:");

        jLabel4.setFont(new java.awt.Font("3270 Nerd Font", 0, 24)); // NOI18N
        jLabel4.setText("Numero de legajo:");

        jtNombreA.setBackground(new java.awt.Color(51, 51, 51));
        jtNombreA.setFont(new java.awt.Font("3270 Nerd Font", 0, 24)); // NOI18N
        jtNombreA.setForeground(new java.awt.Color(0, 204, 0));

        jtApellidoA.setBackground(new java.awt.Color(51, 51, 51));
        jtApellidoA.setFont(new java.awt.Font("3270 Nerd Font", 0, 24)); // NOI18N
        jtApellidoA.setForeground(new java.awt.Color(0, 204, 0));

        jtLegajoA.setBackground(new java.awt.Color(51, 51, 51));
        jtLegajoA.setFont(new java.awt.Font("3270 Nerd Font", 0, 24)); // NOI18N
        jtLegajoA.setForeground(new java.awt.Color(0, 204, 0));

        jbGuardar.setFont(new java.awt.Font("3270 Nerd Font", 0, 24)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbTest.setFont(new java.awt.Font("3270 Nerd Font", 0, 24)); // NOI18N
        jbTest.setText("Test");
        jbTest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTestActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("3270 Nerd Font", 0, 24)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("3270 Nerd Font", 0, 24)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jbTest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtLegajoA, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(jtNombreA)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtApellidoA)))
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtApellidoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtLegajoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbTest)
                    .addComponent(jbGuardar)
                    .addComponent(jbNuevo)
                    .addComponent(jbSalir))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        try{
            String apellido = jtApellidoA.getText();
            String nombre = jtNombreA.getText();
            int legajo = Integer.parseInt(jtLegajoA.getText());
            Alumnos a = new Alumnos(legajo,apellido,nombre);
            alumnoHash.add(a);
            MenuPrincipal.setAlumno(alumnoHash);
            JOptionPane.showMessageDialog(this, "Alumno preparado para la inscripcion!");
        }
        catch(NumberFormatException e){
             JOptionPane.showMessageDialog(this, "Error. Legajo solo acepta valores numericos!", "Error",JOptionPane.ERROR_MESSAGE);   
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        jtNombreA.setText("");
        jtLegajoA.setText("");
        jtApellidoA.setText("");
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTestActionPerformed
        // TODO add your handling code here:
        for(Alumnos a: alumnoHash){
            System.out.println(a);
        }
    }//GEN-LAST:event_jbTestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbTest;
    private javax.swing.JTextField jtApellidoA;
    private javax.swing.JTextField jtLegajoA;
    private javax.swing.JTextField jtNombreA;
    // End of variables declaration//GEN-END:variables
}
