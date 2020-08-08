/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.utp.controlcine.view;

import pe.utp.controlcine.entity.Personal;
import pe.utp.controlcine.utiles.Utiles;

/**
 *
 * @author Miguel
 */
public class MenuAdministracion extends javax.swing.JFrame {

    private final Personal AdmEmpleado;
    private final Utiles utiles;        
    
    public MenuAdministracion(Personal persona) {
        initComponents();
        utiles = new Utiles();
        this.AdmEmpleado = persona; 
        this.lblNomAdm.setText(this.AdmEmpleado.getNombre() +" "+this.AdmEmpleado.getApellido());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPersonal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblPeliculas = new javax.swing.JLabel();
        lblOrdenes = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblNomAdm = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNomAdm1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNomAdm2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblPersonal.setBackground(new java.awt.Color(255, 255, 255));
        lblPersonal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPersonal.setText("PERSONAL");
        lblPersonal.setOpaque(true);
        lblPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPersonalMouseExited(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblPeliculas.setBackground(new java.awt.Color(255, 255, 255));
        lblPeliculas.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblPeliculas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeliculas.setText("PELÍCULAS");
        lblPeliculas.setOpaque(true);
        lblPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPeliculasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPeliculasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPeliculasMouseExited(evt);
            }
        });

        lblOrdenes.setBackground(new java.awt.Color(255, 255, 255));
        lblOrdenes.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblOrdenes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrdenes.setText("ORDENES");
        lblOrdenes.setOpaque(true);
        lblOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrdenesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOrdenesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOrdenesMouseExited(evt);
            }
        });

        lblProductos.setBackground(new java.awt.Color(255, 255, 255));
        lblProductos.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductos.setText("PRODUCTOS");
        lblProductos.setOpaque(true);
        lblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblProductosMouseExited(evt);
            }
        });

        lblCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        lblCerrarSesion.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrarSesion.setText("CERRAR SESIÓN");
        lblCerrarSesion.setOpaque(true);
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel1.setText("<html> <p align=center>SISTEMA DE RESERVACIÓN DE PELÍCULAS </p>  </html>");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Administrador : ");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        lblNomAdm.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblNomAdm.setText("Administrador");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Fecha y Hora: ");

        lblNomAdm1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblNomAdm1.setText("FECHA");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("-");

        lblNomAdm2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblNomAdm2.setText("HORA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomAdm1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomAdm2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNomAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNomAdm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNomAdm2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPeliculasMouseClicked
       new PeliculaAdministracion(this.AdmEmpleado).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_lblPeliculasMouseClicked

    private void lblPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonalMouseClicked
        new PersonalAdministracion(this.AdmEmpleado).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_lblPersonalMouseClicked

    private void lblOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrdenesMouseClicked
        new OrdenesAdministracion().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_lblOrdenesMouseClicked

    private void lblPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonalMouseEntered
        utiles.ColorEntra(this.lblPersonal);
    }//GEN-LAST:event_lblPersonalMouseEntered

    private void lblPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonalMouseExited
        utiles.ColorSale(this.lblPersonal);
    }//GEN-LAST:event_lblPersonalMouseExited

    private void lblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseClicked
        new ProductosAdministracion(this.AdmEmpleado.getIdAdmEmp()).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_lblProductosMouseClicked

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        new Login().setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    private void lblPeliculasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPeliculasMouseEntered
         utiles.ColorEntra(this.lblPeliculas);
    }//GEN-LAST:event_lblPeliculasMouseEntered

    private void lblPeliculasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPeliculasMouseExited
        utiles.ColorSale(this.lblPeliculas);
    }//GEN-LAST:event_lblPeliculasMouseExited

    private void lblOrdenesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrdenesMouseEntered
        utiles.ColorEntra(this.lblOrdenes);
    }//GEN-LAST:event_lblOrdenesMouseEntered

    private void lblOrdenesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrdenesMouseExited
        utiles.ColorSale(this.lblOrdenes);
    }//GEN-LAST:event_lblOrdenesMouseExited

    private void lblProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseEntered
        utiles.ColorEntra(this.lblProductos);
    }//GEN-LAST:event_lblProductosMouseEntered

    private void lblProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMouseExited
         utiles.ColorSale(this.lblProductos);
    }//GEN-LAST:event_lblProductosMouseExited

    private void lblCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseEntered
        utiles.ColorEntra(this.lblCerrarSesion);
    }//GEN-LAST:event_lblCerrarSesionMouseEntered

    private void lblCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseExited
        utiles.ColorSale(this.lblCerrarSesion);
    }//GEN-LAST:event_lblCerrarSesionMouseExited
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblNomAdm;
    private javax.swing.JLabel lblNomAdm1;
    private javax.swing.JLabel lblNomAdm2;
    private javax.swing.JLabel lblOrdenes;
    private javax.swing.JLabel lblPeliculas;
    private javax.swing.JLabel lblPersonal;
    private javax.swing.JLabel lblProductos;
    // End of variables declaration//GEN-END:variables
}
