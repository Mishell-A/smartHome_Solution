package com.smart.home.ui;
import com.smart.home.model.Proyecto;
import com.smart.home.dao.ProyectoDAO;// ✅ este es el correcto
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Proyectos extends javax.swing.JPanel {
    private ProyectoDAO dao = new ProyectoDAO ();
    private DefaultTableModel modeloProyectos;
    private TableRowSorter<DefaultTableModel> sorter;

    public Proyectos() {
        initComponents();
        initTableProyectos();
        verDatos("");
    }
    
    // Inicializa la tabla
    private void initTableProyectos() {
        String[] headers = {"ID", "Nombre", "Encargado", "Estado", "Fecha Inicio", "Fecha Fin"};
        modeloProyectos = new DefaultTableModel(headers, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Evitar edición directa
            }
        };
        jtableProyectos.setModel(modeloProyectos);
        // Crear y asociar el sorter a la tabla
        sorter = new TableRowSorter<>(modeloProyectos);
        jtableProyectos.setRowSorter(sorter);
    }
    
    private void verDatos(String filtro) {
        modeloProyectos.setRowCount(0); // Limpiar tabla
        for (Proyecto p : dao.listarProyectos()) {
            modeloProyectos.addRow(new Object[]{
                    p.getID(),
                    p.getNombre(),
                    p.getEncargado(),
                    p.getEstado(),
                    p.getFecha(),
                    p.getFin()
            });
        }
    }
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtQueryBuscar = new javax.swing.JTextField();
        jbtnFiltrar = new javax.swing.JButton();
        jp1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcmbEncargado = new javax.swing.JComboBox<>();
        jtxtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jbtnGuardar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jcmbEstado = new javax.swing.JComboBox<>();
        jfechaInicio = new com.toedter.calendar.JDateChooser();
        jfechaFin = new com.toedter.calendar.JDateChooser();
        lblC = new javax.swing.JLabel();
        lblF = new javax.swing.JLabel();
        jcmbQueryFiltro = new javax.swing.JComboBox<>();
        spT = new javax.swing.JScrollPane();
        jtableProyectos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jtxtQueryBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtQueryBuscarKeyReleased(evt);
            }
        });

        jbtnFiltrar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnFiltrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnFiltrar.setText("Ver");
        jbtnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFiltrarActionPerformed(evt);
            }
        });

        jp1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("Datos del Proyecto");

        jLabel3.setText("ID");

        jLabel4.setText("Estado");

        jLabel5.setText("Fecha Inicio:");

        jLabel6.setText("Nombre:");

        jcmbEncargado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Carlos Díaz", "María Gómez", "Luis Fernández", "Juan Pérez", "Ana Martínez" }));

        jLabel7.setText("Encargado:");

        jbtnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        jbtnGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
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

        jbtnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        jbtnLimpiar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha Fin:");

        jcmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(218, 218, 218)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jbtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnLimpiar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jp1Layout.createSequentialGroup()
                                    .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcmbEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jp1Layout.createSequentialGroup()
                                        .addComponent(jfechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jfechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(41, 41, 41))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel8)))
                                .addGap(8, 8, 8))
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jfechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jfechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEliminar)
                    .addComponent(jbtnLimpiar)
                    .addComponent(jbtnEditar)
                    .addComponent(jbtnGuardar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        lblC.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lblC.setText("Gestión Proyectos");

        lblF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblF.setText("Filtrar:");

        jcmbQueryFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Activo", "Inactivo" }));

        jtableProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Encargado", "Estado", "Fecha Inicio", "Fecha Fin"
            }
        ));
        jtableProyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableProyectosMouseClicked(evt);
            }
        });
        spT.setViewportView(jtableProyectos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcmbQueryFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jtxtQueryBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(spT, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtQueryBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcmbQueryFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnFiltrar)))))
                .addGap(18, 18, 18)
                .addComponent(spT, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
            try {
                int id = Integer.parseInt(jtxtId.getText());
                 // Verificar si el ID es único llamando al método del DAO
                if (!dao.verificarIdUnico(id)) {
                    JOptionPane.showMessageDialog(this, "El ID ya existe. Por favor, ingresa un ID único.", "Error de ID", JOptionPane.ERROR_MESSAGE);
                    return; // No continuar si el ID ya existe
                }
                String nombre = jtxtNombre.getText();
                String encargado = jcmbEncargado.getSelectedItem().toString();
                String estado = jcmbEstado.getSelectedItem().toString();

                // Fecha inicio
                String dia1 = Integer.toString(jfechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH));
                String mes1 = Integer.toString(jfechaInicio.getCalendar().get(Calendar.MONTH) + 1);
                String año1 = Integer.toString(jfechaInicio.getCalendar().get(Calendar.YEAR));
                String fechaInicio = (año1 + "-" + mes1 + "-" + dia1);

                // Fecha fin
                String dia2 = Integer.toString(jfechaFin.getCalendar().get(Calendar.DAY_OF_MONTH));
                String mes2 = Integer.toString(jfechaFin.getCalendar().get(Calendar.MONTH) + 1);
                String año2 = Integer.toString(jfechaFin.getCalendar().get(Calendar.YEAR));
                String fechaFin = (año2 + "-" + mes2 + "-" + dia2);

                if (fechaInicio == null || fechaFin == null) {
                    JOptionPane.showMessageDialog(null, "Seleccione ambas fechas.");
                    return;
                }

                Proyecto nuevo = new Proyecto(id, nombre, encargado, estado, fechaInicio, fechaFin);

                // Guardar con DAO en vez de Lis
                dao.insertarProyecto(nuevo);  // <-- Aquí se guarda usando tu DAO

                // Actualizar tabla
                modeloProyectos.addRow(new Object[]{id, nombre, encargado, estado, fechaInicio, fechaFin});

                // Limpiar campos si quieres
                // Limpiar();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verifique los datos ingresados: " + e.getMessage());
            }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
            jtxtId.setText("");
            jtxtNombre.setText("");
            jtxtQueryBuscar.setText("");
            jcmbEncargado.setSelectedIndex(0);
            jcmbEstado.setSelectedIndex(0);
            jcmbQueryFiltro.setSelectedIndex(0);
            jfechaInicio.setDate(null);
            jfechaFin.setDate(null);
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        try {
                    int fila = jtableProyectos.getSelectedRow();
                    if (fila == -1) {
                            JOptionPane.showMessageDialog(this,
                                    "Seleccione una fila para editar.",
                                    "Advertencia",
                                    JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                    // Toma los datos del formulario
                    int id = Integer.parseInt(jtxtId.getText());
                    String nombre = jtxtNombre.getText();
                    String encargado = jcmbEncargado.getSelectedItem().toString();
                    String estado = jcmbEstado.getSelectedItem().toString();
                    String dia1 = Integer.toString(jfechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH));
                    String mes1 = Integer.toString(jfechaInicio.getCalendar().get(Calendar.MONTH) + 1);
                    String año1 = Integer.toString(jfechaInicio.getCalendar().get(Calendar.YEAR));
                    String fechaInicio = (año1 + "-" + mes1 + "-" + dia1);

                    String dia2 = Integer.toString(jfechaFin.getCalendar().get(Calendar.DAY_OF_MONTH));
                    String mes2 = Integer.toString(jfechaFin.getCalendar().get(Calendar.MONTH) + 1);
                    String año2 = Integer.toString(jfechaFin.getCalendar().get(Calendar.YEAR));
                    String fechaFin = (año2 + "-" + mes2 + "-" + dia2);
                    
                    
                    // Crear objeto Proyecto actualizado
                    Proyecto actualizado = new Proyecto(id, nombre, encargado, estado, fechaInicio, fechaFin);

                    // Actualizar en DAO
                    dao.actualizarProyecto(actualizado); 

                    // Actualiza la tabla
                    modeloProyectos.setValueAt(id, fila, 0);
                    modeloProyectos.setValueAt(nombre, fila, 1);
                    modeloProyectos.setValueAt(encargado, fila, 2);
                    modeloProyectos.setValueAt(estado, fila, 3);
                    modeloProyectos.setValueAt(fechaInicio, fila, 4);
                    modeloProyectos.setValueAt(fechaFin, fila, 5);

                    JOptionPane.showMessageDialog(this, "Proyecto actualizado correctamente.");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
               }
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
         int fila = jtableProyectos.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione un proyecto para eliminar.");
                return;
            }

            int confirmacion = JOptionPane.showConfirmDialog(null,
                    "¿Desea eliminar este proyecto?",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                int id = (int) modeloProyectos.getValueAt(fila, 0); // Obtener ID del proyecto
                dao.eliminarProyecto(id); // <-- Método en ProyectoDAO para eliminar por ID
                modeloProyectos.removeRow(fila);

                JOptionPane.showMessageDialog(null, "Proyecto eliminado correctamente.");
            }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFiltrarActionPerformed
        String parametroFiltro = jcmbQueryFiltro.getSelectedItem().toString().trim();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel> (modeloProyectos);
        jtableProyectos.setRowSorter(tr);
        
        if(!parametroFiltro.equals("Todo")){
            //Si se selecciona un filtro diferente a Todos
            tr.setRowFilter(RowFilter.regexFilter(parametroFiltro));
        }else{
            //Se muestran todas las filas
            jtableProyectos.setRowSorter(tr); 
        };
    }//GEN-LAST:event_jbtnFiltrarActionPerformed

    private void jtableProyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableProyectosMouseClicked
        if (evt.getClickCount() == 2) {

            int fila = jtableProyectos.getSelectedRow();

            if (fila == -1) return; // Seguridad

            String fechaInicio = (String) modeloProyectos.getValueAt(fila, 4);
            String fechaFin = (String) modeloProyectos.getValueAt(fila, 5);
            String encargado = (String) modeloProyectos.getValueAt(fila, 2);
            String estado = (String) modeloProyectos.getValueAt(fila, 3);
            int id = (Integer) modeloProyectos.getValueAt(fila, 0); // CORREGIDO
            String nombre = (String) modeloProyectos.getValueAt(fila, 1);

            // Pasa los datos al formulario
            jtxtId.setText(String.valueOf(id));
            jtxtNombre.setText(nombre);
            jcmbEncargado.setSelectedItem(encargado);
            jcmbEstado.setSelectedItem(estado);
            try {
                java.util.Date date1 = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(fechaInicio);
                java.util.Date date2 = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(fechaFin);
                jfechaInicio.setDate(date1);
                jfechaFin.setDate(date2);
                // Mensaje de éxito después de cargar los datos
                JOptionPane.showMessageDialog(this,
                "Los datos se han cargado correctamente. Ahora puedes editarlos y hacer clic en Actualizar para guardar.",
                "Datos Cargados",
                JOptionPane.INFORMATION_MESSAGE);
                
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jtableProyectosMouseClicked

    private void jtxtQueryBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtQueryBuscarKeyReleased
        buscar();
    }//GEN-LAST:event_jtxtQueryBuscarKeyReleased
    private  void buscar(){
        try{
          sorter.setRowFilter(RowFilter.regexFilter(jtxtQueryBuscar.getText()));
        }catch(Exception e){
            
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnFiltrar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JComboBox<String> jcmbEncargado;
    private javax.swing.JComboBox<String> jcmbEstado;
    private javax.swing.JComboBox<String> jcmbQueryFiltro;
    private com.toedter.calendar.JDateChooser jfechaFin;
    private com.toedter.calendar.JDateChooser jfechaInicio;
    private javax.swing.JPanel jp1;
    private javax.swing.JTable jtableProyectos;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtQueryBuscar;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblF;
    private javax.swing.JScrollPane spT;
    // End of variables declaration//GEN-END:variables
}
