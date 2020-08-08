/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.utp.controlcine.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.utp.controlcine.controller.ProductoController;
import pe.utp.controlcine.entity.Producto;
import pe.utp.controlcine.utiles.Utiles;

public class ProductosEmpleados extends javax.swing.JFrame {

    DefaultTableModel modelo;
    private Producto producto;
    private final ProductoController productoControler;
    private final Utiles utiles;

    public ProductosEmpleados() {

        initComponents();
        this.utiles = new Utiles();
        productoControler = new ProductoController();
        actualizar();
    }

    public void initTable() {
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        modelo.addColumn("id");             //idProducto
        modelo.addColumn("Codigo Fact");    //Descripcion
        modelo.addColumn("Nombre");         //Nombre
        modelo.addColumn("Tipo");           //Defailt "dulceria"
        modelo.addColumn("Precio/Unit");    //Precio
        modelo.addColumn("Cantidad");       //IdAdmin
        modelo.addColumn("Precio/Total");   //Tipo
        modelo.addColumn("Estado");         //Stock
        tabla.setModel(modelo);
    }

    void actualizar() {
        initTable();
        productoControler.getDetListProduto().forEach((prodAux) -> {
            modelo.addRow(new Object[]{prodAux.getIdProducto(), prodAux.getDescripcion(), prodAux.getNombre(), "dulceria creo", prodAux.getPrecio(), prodAux.getIdAdmin(), prodAux.getTipo(), prodAux.getStock()});
        });
        tabla.removeColumn(tabla.getColumnModel().getColumn(0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jtxt_buscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUCTOS");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Código");

        btnLimpiar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCambiar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnCambiar.setText("CAMBIAR");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jtxt_buscar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo fact", "Nombre", "Tipo", "Precio/unit", "Cantidad", "Precio/total", "Estado"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jtxt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(444, 444, 444)
                        .addComponent(btnLimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnLimpiar)
                    .addComponent(jtxt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
//        int fila = tabla.getSelectedRow();
//        if (fila >= 0) {
//            modelo.removeRow(fila);
//        } else {
            JOptionPane.showConfirmDialog(null, "Hola yo debería Limpiar");
//        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        int fila = this.tabla.getSelectedRow();
        if (fila >= 0) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de realizar esta acción?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                int id = Integer.parseInt(tabla.getModel().getValueAt(tabla.getSelectedRow(), 0).toString());
                if (productoControler.updateDetProd(id)) {
                    JOptionPane.showMessageDialog(this, "La Acción se realizó correctamente");
                    actualizar();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione");
        }
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String codigo = jtxt_buscar.getText();
        initTable();
        if (codigo != null || codigo.length() != 0 || !codigo.equals("")) {
            productoControler.getDetListProductoPorCod(codigo).forEach((prodAux) -> {
                modelo.addRow(new Object[]{prodAux.getIdProducto(), prodAux.getDescripcion(), prodAux.getNombre(), "dulceria creo", prodAux.getPrecio(), prodAux.getIdAdmin(), prodAux.getTipo(), prodAux.getStock()});
            });
            tabla.removeColumn(tabla.getColumnModel().getColumn(0));
        }else{
            JOptionPane.showMessageDialog(this,"Ingrese código");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtxt_buscar;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
