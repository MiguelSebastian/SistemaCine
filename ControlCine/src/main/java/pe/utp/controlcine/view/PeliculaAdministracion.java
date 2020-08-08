/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.utp.controlcine.view;

import javax.swing.table.DefaultTableModel;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import pe.utp.controlcine.controller.PeliculaController;
import pe.utp.controlcine.entity.Pelicula;
import pe.utp.controlcine.entity.Personal;
import pe.utp.controlcine.utiles.Utiles;

/**
 *
 * @author Miguel
 */
public class PeliculaAdministracion extends javax.swing.JFrame {

    private Utiles utiles;
    private PeliculaController peliControler;
//    private Pelicula pelicula;
    private Personal AdmEmpleado;
    DefaultTableModel modelotabla;
    LocalTime lcl = LocalTime.of(0, 0, 0);

    public PeliculaAdministracion(Personal persona) {
        initComponents();
        utiles = new Utiles();
        peliControler = new PeliculaController();
        this.AdmEmpleado = persona;
        actualizar();

    }

    final void iniTable() {
        modelotabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
    }

    public void actualizar() {
        iniTable();
        modelotabla.addColumn("idPelicula");
        modelotabla.addColumn("idAdmin");
        modelotabla.addColumn("Nombre");
        modelotabla.addColumn("Director");
        modelotabla.addColumn("Titulo");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("Duracion");
        jTblPelicula.setModel(modelotabla);
        peliControler.getListPelicula().forEach((persAux) -> {
            modelotabla.addRow(new Object[]{persAux.getIdPelicula(), persAux.getIdAdmin(), persAux.getNombre(), persAux.getDirector(), persAux.getTitulo(), persAux.getDescripcion(), persAux.getDuracion()});
        });
    }

    public void limpiar() {
        this.txtNombre.setText("");
        this.txtDirector.setText("");
        this.txtDescripcion.setText("");
        this.txtTitulo.setText("");
        this.txtDuracion.setText("");
    }

    boolean validador() {
        if (this.txtNombre.getText().equals("") || this.txtNombre.getText().isEmpty() || this.txtNombre.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese Nombre");
            return false;
        }
        if (this.txtDirector.getText().equals("") || this.txtDirector.getText().isEmpty() || this.txtDirector.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese Director");
            return false;
        }
        if (this.txtTitulo.getText().equals("") || this.txtTitulo.getText().isEmpty() || this.txtTitulo.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese Titulo");
            return false;
        }
        if (this.txtDescripcion.getText().equals("") || this.txtDescripcion.getText().isEmpty() || this.txtDescripcion.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese Descripcion");
            return false;
        }
        if (this.txtDuracion.getText().equals("") || this.txtDuracion.getText().isEmpty() || this.txtDuracion.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese Duracion");
            return false;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblBuscar = new javax.swing.JLabel();
        lblLimpiar = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDirector = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblPelicula = new javax.swing.JTable();
        lblAgregar = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblModificar = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JFormattedTextField();
        txtCodigo = new javax.swing.JTextField();
        txtCodigo1 = new javax.swing.JTextField();
        txtAdm = new javax.swing.JTextField();
        txtpeli = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Nombres : ");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Director : ");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PELICULA");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Título :");

        lblBuscar.setBackground(new java.awt.Color(255, 255, 255));
        lblBuscar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setText("BUSCAR");
        lblBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblBuscar.setOpaque(true);
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBuscarMouseExited(evt);
            }
        });

        lblLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        lblLimpiar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimpiar.setText("LIMPIAR");
        lblLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblLimpiar.setOpaque(true);
        lblLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLimpiarMouseExited(evt);
            }
        });

        jTblPelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Director o Franquicia", "Título", "Duración"
            }
        ));
        jTblPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblPeliculaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblPelicula);

        lblAgregar.setBackground(new java.awt.Color(255, 255, 255));
        lblAgregar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar.setText("AGREGAR");
        lblAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAgregar.setOpaque(true);
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAgregarMouseExited(evt);
            }
        });

        lblModificar.setBackground(new java.awt.Color(255, 255, 255));
        lblModificar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificar.setText("MODIFICAR");
        lblModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblModificar.setOpaque(true);
        lblModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblModificarMouseExited(evt);
            }
        });

        lblEliminar.setBackground(new java.awt.Color(255, 255, 255));
        lblEliminar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar.setText("ELIMINAR");
        lblEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblEliminar.setOpaque(true);
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEliminarMouseExited(evt);
            }
        });

        lblSalir.setBackground(new java.awt.Color(255, 255, 255));
        lblSalir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("SALIR");
        lblSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblSalir.setOpaque(true);
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Descripción : ");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Duración/H : ");

        try {
            txtDuracion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtCodigo.setVisible(false);
        txtCodigo.setEditable(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtCodigo.setVisible(false);
        txtCodigo1.setEditable(false);
        txtCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo1ActionPerformed(evt);
            }
        });

        txtAdm.setVisible(false);
        txtAdm.setEditable(false);
        txtAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmActionPerformed(evt);
            }
        });

        txtpeli.setVisible(false);
        txtpeli.setEditable(false);
        txtpeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpeliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txtAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDirector, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                        .addComponent(txtTitulo)
                        .addComponent(txtDescripcion)
                        .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtpeli, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(417, 417, 417))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addComponent(jSeparator1)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(504, 504, 504)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(505, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(504, 504, 504)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(505, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(lblLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(225, 225, 225)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(226, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(225, 225, 225)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(226, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseEntered
        utiles.ColorEntra(this.lblBuscar);
    }//GEN-LAST:event_lblBuscarMouseEntered

    private void lblBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseExited
        utiles.ColorSale(this.lblBuscar);
    }//GEN-LAST:event_lblBuscarMouseExited

    private void lblLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_lblLimpiarMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked

        iniTable();
        modelotabla.addColumn("idPelicula");
        modelotabla.addColumn("idAdmin");
        modelotabla.addColumn("Nombre");
        modelotabla.addColumn("Director");
        modelotabla.addColumn("Titulo");
        modelotabla.addColumn("Descripcion");
        modelotabla.addColumn("Duracion");
        jTblPelicula.setModel(modelotabla);
        peliControler.getListPelicula().forEach((persAux) -> {
            modelotabla.addRow(new Object[]{persAux.getIdPelicula(), persAux.getIdAdmin(), persAux.getNombre(), persAux.getDirector(), persAux.getTitulo(), persAux.getDescripcion(), persAux.getDuracion()});
        });
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        if (validador()) {
            peliControler.insertPelicula(new Pelicula(0, this.AdmEmpleado.getIdAdmEmp(), this.txtNombre.getText(), this.txtDirector.getText(), this.txtTitulo.getText(), this.txtDescripcion.getText(), LocalTime.parse(this.txtDuracion.getText())));
            JOptionPane.showMessageDialog(this, "Pelicula Registrado");
        }
        actualizar();
        limpiar();
    }//GEN-LAST:event_lblAgregarMouseClicked

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarMouseClicked
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de realizar esta acción?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            if (validador()) {
                if (peliControler.updatePelicula(new Pelicula(Integer.parseInt(this.txtpeli.getText()), Integer.parseInt(this.txtAdm.getText()), this.txtNombre.getText(), this.txtDirector.getText(), this.txtTitulo.getText(), this.txtDescripcion.getText(), LocalTime.parse(this.txtDuracion.getText())))) {
                    JOptionPane.showMessageDialog(this, "Se modificó correctamente");
                }

            }
        }
        actualizar();
        limpiar();
    }//GEN-LAST:event_lblModificarMouseClicked

    private void lblLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseEntered
        utiles.ColorEntra(this.lblLimpiar);
    }//GEN-LAST:event_lblLimpiarMouseEntered

    private void lblLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarMouseExited
        utiles.ColorSale(this.lblLimpiar);
    }//GEN-LAST:event_lblLimpiarMouseExited

    private void lblAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseEntered
        utiles.ColorEntra(this.lblAgregar);
    }//GEN-LAST:event_lblAgregarMouseEntered

    private void lblAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseExited
        utiles.ColorSale(this.lblAgregar);
    }//GEN-LAST:event_lblAgregarMouseExited

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        // TODO add your handling code here:
        int fila = this.jTblPelicula.getSelectedRow();
        if (fila >= 0) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de realizar esta acción?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                peliControler.deletePelicula(new Pelicula(Integer.parseInt(this.jTblPelicula.getModel().getValueAt(fila, 0).toString()), this.AdmEmpleado.getIdAdmEmp(), this.txtNombre.getText(), this.txtDirector.getText(), this.txtTitulo.getText(), this.txtDescripcion.getText(), LocalTime.MIN));
                JOptionPane.showMessageDialog(this, "Pelicula Eliminada correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una pelicula");
        }
        actualizar();
        limpiar();
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void jTblPeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblPeliculaMouseClicked
        // TODO add your handling code here:
        limpiar();
        int fila = this.jTblPelicula.getSelectedRow();
        if (evt.getClickCount() == 2) {

            this.txtpeli.setText(this.jTblPelicula.getModel().getValueAt(fila, 0).toString());
            this.txtAdm.setText(this.jTblPelicula.getModel().getValueAt(fila, 1).toString());
            this.txtNombre.setText(this.jTblPelicula.getModel().getValueAt(fila, 2).toString());
            this.txtDirector.setText(this.jTblPelicula.getModel().getValueAt(fila, 3).toString());
            this.txtTitulo.setText(this.jTblPelicula.getModel().getValueAt(fila, 4).toString());
            this.txtDescripcion.setText(this.jTblPelicula.getModel().getValueAt(fila, 5).toString());
            this.txtDuracion.setText(this.jTblPelicula.getModel().getValueAt(fila, 6).toString());
        }
    }//GEN-LAST:event_jTblPeliculaMouseClicked

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo1ActionPerformed

    private void txtAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmActionPerformed

    private void txtpeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpeliActionPerformed

    private void lblModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarMouseEntered
        utiles.ColorEntra(this.lblModificar);
    }//GEN-LAST:event_lblModificarMouseEntered

    private void lblModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarMouseExited
        utiles.ColorSale(this.lblModificar);
    }//GEN-LAST:event_lblModificarMouseExited

    private void lblEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseEntered
        utiles.ColorEntra(this.lblEliminar);
    }//GEN-LAST:event_lblEliminarMouseEntered

    private void lblEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseExited
        utiles.ColorSale(this.lblEliminar);
    }//GEN-LAST:event_lblEliminarMouseExited

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        utiles.ColorEntra(this.lblSalir);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        utiles.ColorSale(this.lblSalir);
    }//GEN-LAST:event_lblSalirMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTable jTblPelicula;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblLimpiar;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JTextField txtAdm;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JFormattedTextField txtDuracion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtpeli;
    // End of variables declaration//GEN-END:variables
}
