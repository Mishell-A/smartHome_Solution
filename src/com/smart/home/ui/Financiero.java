/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.smart.home.ui;
import com.smart.home.dao.FinanzasDAO;
import com.smart.home.model.finanzas.*;
import java.util.List;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USER
 */
public class Financiero extends javax.swing.JPanel {

    private FinanzasDAO dao = new FinanzasDAO();
    private DefaultTableModel modelo;

    
    public Financiero() {
        initComponents();
        initTable();
        cargarDatos("");
    }
    
    private void cargarDatos(String filtro) {
    modelo.setRowCount(0);
    List<MovimientoFinanciero> lista = dao.listarMovimientos(filtro);
    for (MovimientoFinanciero m : lista) {
        modelo.addRow(new Object[]{
            m.getFecha(), m.getTipo(), m.getMonto(), m.getCategoria(), m.getDescripcion()
        });
    }
      
}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spT = new javax.swing.JScrollPane();
        jtablaMovimientos = new javax.swing.JTable();
        jp1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcmbTipo = new javax.swing.JComboBox<>();
        jtxtDescripcion = new javax.swing.JTextField();
        jtxtMonto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBtnGuardar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jbtnEliminarTodo = new javax.swing.JButton();
        jFecha = new com.toedter.calendar.JDateChooser();
        jcmbCategoria = new javax.swing.JComboBox<>();
        lblC = new javax.swing.JLabel();
        lblF = new javax.swing.JLabel();
        jcmbFiltro = new javax.swing.JComboBox<>();
        btnFiltrar = new javax.swing.JButton();

        jtablaMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Tipo", "Monto", "Categoría", "Descripción"
            }
        ));
        jtablaMovimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaMovimientosMouseClicked(evt);
            }
        });
        spT.setViewportView(jtablaMovimientos);

        jp1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("Registrar Movimiento");

        jLabel3.setText("Fecha");

        jLabel4.setText("Tipo");

        jLabel5.setText("Descripción");

        jLabel6.setText("Monto");

        jcmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingreso", "Egreso" }));

        jLabel7.setText("Categoría");

        jBtnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        jBtnGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardar(evt);
            }
        });

        jbtnEditar.setBackground(new java.awt.Color(204, 204, 204));
        jbtnEditar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jbtnEditar.setText("Actualizar");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        jbtnEliminar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiar(evt);
            }
        });

        jbtnEliminarTodo.setBackground(new java.awt.Color(204, 204, 204));
        jbtnEliminarTodo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jbtnEliminarTodo.setText("Eliminar todo");
        jbtnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarTodoActionPerformed(evt);
            }
        });

        jcmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proyectos", "Materiales", "Personal", "Operaciones", "Administración", "Otros" }));

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(210, 210, 210)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jcmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jBtnGuardar)
                        .addGap(12, 12, 12)
                        .addComponent(jbtnEditar)
                        .addGap(12, 12, 12)
                        .addComponent(jbtnEliminar)
                        .addGap(6, 6, 6)
                        .addComponent(jButton4)
                        .addGap(6, 6, 6)
                        .addComponent(jbtnEliminarTodo)))
                .addGap(39, 39, 39))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnGuardar)
                    .addComponent(jbtnEditar)
                    .addComponent(jbtnEliminar)
                    .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jbtnEliminarTodo))))
        );

        lblC.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lblC.setText("Control Financiero");

        lblF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblF.setText("Filtrar:");

        jcmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Ingreso", "Egreso" }));

        btnFiltrar.setBackground(new java.awt.Color(0, 0, 0));
        btnFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        btnFiltrar.setText("Ver");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jcmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(spT, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblC)
                .addGap(12, 12, 12)
                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFiltrar))))
                .addGap(12, 12, 12)
                .addComponent(spT, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Financiero().setVisible(true);
//            }
//        });
    }
    private void jBtnLimpiar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiar
       jFecha.setDate(null);
       jtxtMonto.setText("");
       jtxtDescripcion.setText("");
       jcmbTipo.setSelectedIndex(0);
       jcmbCategoria.setSelectedIndex(0);
       jtablaMovimientos.clearSelection();
    }//GEN-LAST:event_jBtnLimpiar

    private void jBtnGuardar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardar
        
        try {
            
            if (jFecha.getDate() == null || jtxtMonto.getText().trim().isEmpty() || jtxtDescripcion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben ser completados.");
            return;
            }
            String dia = Integer.toString(jFecha.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(jFecha.getCalendar().get(Calendar.MONTH)+1);
            String año = Integer.toString(jFecha.getCalendar().get(Calendar.YEAR));
            String fecha = (año + "-" + mes + "-" + dia);
            String tipo = jcmbTipo.getSelectedItem().toString();
            double monto = Double.parseDouble(jtxtMonto.getText());
            String categoria = jcmbCategoria.getSelectedItem().toString();
            String descripcion = jtxtDescripcion.getText();

            MovimientoFinanciero mov = tipo.equals("Ingreso") ?
                    new Ingreso(fecha, tipo, categoria, descripcion, monto) :
                    new Egreso(fecha, tipo, categoria, descripcion, monto);


            if (dao.insertarMovimiento(mov)) {
                JOptionPane.showMessageDialog(this, "Movimiento guardado correctamente");

                
                cargarDatos("");   
                //limpiarCampos();   
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar movimiento");
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jBtnGuardar

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        try {
            int fila = jtablaMovimientos.getSelectedRow();
            if(fila == -1){
                JOptionPane.showMessageDialog(this, "Seleccione un movimiento.");
                return;
            }

                // Toma los datos del formulario
                String dia = Integer.toString(jFecha.getCalendar().get(Calendar.DAY_OF_MONTH));
                String mes = Integer.toString(jFecha.getCalendar().get(Calendar.MONTH)+1);
                String año = Integer.toString(jFecha.getCalendar().get(Calendar.YEAR));
                String fecha = año + "-" + mes + "-" + dia;
                String tipo = jcmbTipo.getSelectedItem().toString();
                double monto = Double.parseDouble(jtxtMonto.getText());
                String categoria = jcmbCategoria.getSelectedItem().toString();
                String descripcion = jtxtDescripcion.getText();

                // Actualiza la tabla
                modelo.setValueAt(fecha, fila, 0);
                modelo.setValueAt(tipo, fila, 1);
                modelo.setValueAt(monto, fila, 2);
                modelo.setValueAt(categoria, fila, 3);
                modelo.setValueAt(descripcion, fila, 4);

                JOptionPane.showMessageDialog(this, "Movimiento actualizado en la tabla.");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jtablaMovimientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaMovimientosMouseClicked
        if (evt.getClickCount() == 2) {
            int fila = jtablaMovimientos.getSelectedRow();

            if (fila == -1) return; // Seguridad

            String fecha = (String) modelo.getValueAt(fila, 0);
            String tipo = (String) modelo.getValueAt(fila, 1);
            double monto = (Double) modelo.getValueAt(fila, 2);
            String categoria = (String) modelo.getValueAt(fila, 3);
            String descripcion = (String) modelo.getValueAt(fila, 4);

            // Pasa los datos al formulario
            jtxtMonto.setText(String.valueOf(monto));
            jtxtDescripcion.setText(descripcion);
            jcmbCategoria.setSelectedItem(categoria);
            jcmbTipo.setSelectedItem(tipo);
            try {
                java.util.Date date = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(fecha);
                jFecha.setDate(date);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jtablaMovimientosMouseClicked

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        int fila = jtablaMovimientos.getSelectedRow();
        //Solo elimina si una fila esta seleccionada
        if(fila != -1){
            modelo.removeRow(fila);
            JOptionPane.showMessageDialog(this,"Movimiento eliminado correctamente. ");
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione la fila a eliminar.");
        }
        
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarTodoActionPerformed
        int filas = jtablaMovimientos.getRowCount();
        
        for(int i = filas - 1; i >=0 ; i--){
            modelo.removeRow(i);
        }
    }//GEN-LAST:event_jbtnEliminarTodoActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        String parametroFiltro = jcmbFiltro.getSelectedItem().toString().trim();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel> (modelo);
        jtablaMovimientos.setRowSorter(tr);
        
        if(!parametroFiltro.equals("Todos")){
            //Si se selecciona un filtro diferente a Todos
            tr.setRowFilter(RowFilter.regexFilter(parametroFiltro));
        }else{
            //Se muestran todas las filas
            jtablaMovimientos.setRowSorter(tr); 
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jFecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnEliminarTodo;
    private javax.swing.JComboBox<String> jcmbCategoria;
    private javax.swing.JComboBox<String> jcmbFiltro;
    private javax.swing.JComboBox<String> jcmbTipo;
    private javax.swing.JPanel jp1;
    private javax.swing.JTable jtablaMovimientos;
    private javax.swing.JTextField jtxtDescripcion;
    private javax.swing.JTextField jtxtMonto;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblF;
    private javax.swing.JScrollPane spT;
    // End of variables declaration//GEN-END:variables
    
    private void initTable()
    {
        String[] header = {"Fecha", "Tipo", "Monto", "Categoría", "Descripción"};
        modelo = new DefaultTableModel(header,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jtablaMovimientos.setModel(modelo);
    }
}
