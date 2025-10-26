package com.smart.home.ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//PDF
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reportes extends javax.swing.JPanel {

    public Reportes() {
        initComponents();
        DefaultTableModel modelo = new DefaultTableModel(
            new Object[]{"Cliente", "DNI", "Proyecto", "Descripción", "Encargado", "Estado", "Fecha de Pago", "Método de Pago", "Monto"}, 
            0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;  // No hacer que ninguna celda sea editable
            }
        };
        
        // Establece el modelo a la tabla
        jTable.setModel(modelo);
    }
    private int filaEditando = -1; // -1 significa que no estamos editando

    private void generarDocumentoPDF(String tipoDocumento) {
         try {
            int filaSeleccionada = jTable.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this,
                        "Por favor, seleccione un registro en la tabla para generar el " + tipoDocumento + ".",
                        "Sin selección",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Obtenemos los datos de la fila seleccionada
            String cliente = jTable.getValueAt(filaSeleccionada, 0).toString();
            String dni = jTable.getValueAt(filaSeleccionada, 1).toString();
            String proyecto = jTable.getValueAt(filaSeleccionada, 2).toString();
            String descripcion = jTable.getValueAt(filaSeleccionada, 3).toString();
            String encargado = jTable.getValueAt(filaSeleccionada, 4).toString();
            String estado = jTable.getValueAt(filaSeleccionada, 5).toString();
            String fechaPago = jTable.getValueAt(filaSeleccionada, 6).toString();
            String metodoPago = jTable.getValueAt(filaSeleccionada, 7).toString();
            String monto = jTable.getValueAt(filaSeleccionada, 8).toString();

            // Nombre del archivo y ruta de salida
            String nombreArchivo = tipoDocumento + "_" + cliente.replace(" ", "_") + ".pdf";
            String rutaSalida = System.getProperty("user.home") + "/Documents/" + nombreArchivo;

            // Crear documento PDF
            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream(rutaSalida));
            documento.open();

            // Encabezado
            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph(tipoDocumento + " - Sistema de Drywall\n\n", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);

            // Fecha
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            Paragraph fecha = new Paragraph("Fecha de emisión: " + formato.format(LocalDateTime.now()) + "\n\n");
            documento.add(fecha);

            // Datos del cliente y proyecto
            documento.add(new Paragraph("Cliente: " + cliente));
            documento.add(new Paragraph("DNI: " + dni));
            documento.add(new Paragraph("Proyecto: " + proyecto));
            documento.add(new Paragraph("Descripción: " + descripcion));
            documento.add(new Paragraph("Encargado: " + encargado));
            documento.add(new Paragraph("Estado: " + estado));
            documento.add(new Paragraph("Fecha de Pago: " + fechaPago));
            documento.add(new Paragraph("Método de Pago: " + metodoPago));
            documento.add(new Paragraph("Monto: S/ " + monto + "\n\n"));

            documento.add(new Paragraph("-------------------------------------------"));

            Paragraph mensajeFinal = new Paragraph("\nGracias por su preferencia.\n");
            mensajeFinal.setAlignment(Element.ALIGN_CENTER);
            documento.add(mensajeFinal);

            documento.close();

            JOptionPane.showMessageDialog(this,
                    tipoDocumento + " generado exitosamente en:\n" + rutaSalida,
                    "PDF Creado",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al generar el PDF: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spT = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jp1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProyecto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtEncargado = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnGenerarBoleta = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        comboBoxEstado = new javax.swing.JComboBox<>();
        JdateChooser = new com.toedter.calendar.JDateChooser();
        comboBoxMetodoPago = new javax.swing.JComboBox<>();
        btnBoleta = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnProforma = new javax.swing.JButton();

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N°", "Fecha", "Descripción", "Monto", "Metodo de Pago"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        spT.setViewportView(jTable);

        jp1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("Boleta de pago por proyecto");

        jLabel3.setText("Cliente:");

        jLabel4.setText("Estado:");

        jLabel5.setText("Proyecto:");

        jLabel6.setText("Encargado:");

        jLabel7.setText("Fecha de pago:");

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(204, 204, 204));
        btnEditar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel8.setText("Monto:");

        jLabel9.setText("DNI:");

        jLabel10.setText("Descripción:");

        btnGenerarBoleta.setBackground(new java.awt.Color(204, 204, 204));
        btnGenerarBoleta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        btnGenerarBoleta.setText("Generar Boleta");
        btnGenerarBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarBoletaActionPerformed(evt);
            }
        });

        jLabel11.setText("Metodo de Pago:");

        comboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        comboBoxMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transferencia", "Efectivo", "Yape" }));

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtEncargado))
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCliente))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProyecto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripcion)
                            .addComponent(txtDni)
                            .addComponent(JdateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxMetodoPago, 0, 180, Short.MAX_VALUE)))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGenerarBoleta)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(JdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar)
                    .addComponent(btnGenerarBoleta))
                .addGap(15, 15, 15))
        );

        btnBoleta.setBackground(new java.awt.Color(0, 153, 153));
        btnBoleta.setForeground(new java.awt.Color(255, 255, 255));
        btnBoleta.setText("Boleta");
        btnBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletaActionPerformed(evt);
            }
        });

        btnFactura.setBackground(new java.awt.Color(102, 0, 51));
        btnFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnFactura.setText("Factura");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        btnProforma.setBackground(new java.awt.Color(255, 102, 102));
        btnProforma.setForeground(new java.awt.Color(255, 255, 255));
        btnProforma.setText("Proforma");
        btnProforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProformaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnBoleta)
                        .addGap(18, 18, 18)
                        .addComponent(btnFactura)
                        .addGap(18, 18, 18)
                        .addComponent(btnProforma))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(spT, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBoleta)
                    .addComponent(btnFactura)
                    .addComponent(btnProforma))
                .addGap(18, 18, 18)
                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(spT, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();

            String cliente = txtCliente.getText();
            String dni = txtDni.getText();
            String proyecto = txtProyecto.getText();
            String descripcion = txtDescripcion.getText();
            String encargado = txtEncargado.getText();
            String estado = comboBoxEstado.getSelectedItem().toString();
            Date fecha = JdateChooser.getDate();
            String fechaPago = (fecha != null) ? new SimpleDateFormat("dd/MM/yyyy").format(fecha) : "";
            String metodoPago = comboBoxMetodoPago.getSelectedItem().toString();
            String monto = txtMonto.getText();

            if (cliente.isEmpty() || dni.isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                    "Por favor, complete al menos los campos de Cliente y DNI.", 
                    "Campos incompletos", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (filaEditando == -1) {
                modelo.addRow(new Object[]{
                    cliente, dni, proyecto, descripcion, encargado, estado, fechaPago, metodoPago, monto
                });
                JOptionPane.showMessageDialog(this, 
                        "Reporte guardado y agregado a la tabla exitosamente.", 
                        "Guardar", 
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                modelo.setValueAt(cliente, filaEditando, 0);
                modelo.setValueAt(dni, filaEditando, 1);
                modelo.setValueAt(proyecto, filaEditando, 2);
                modelo.setValueAt(descripcion, filaEditando, 3);
                modelo.setValueAt(encargado, filaEditando, 4);
                modelo.setValueAt(estado, filaEditando, 5);
                modelo.setValueAt(fechaPago, filaEditando, 6);
                modelo.setValueAt(metodoPago, filaEditando, 7);
                modelo.setValueAt(monto, filaEditando, 8);

                JOptionPane.showMessageDialog(this, 
                        "Registro actualizado correctamente.", 
                        "Actualizar", 
                        JOptionPane.INFORMATION_MESSAGE);

                filaEditando = -1;
            }

            btnLimpiarActionPerformed(evt);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Ocurrió un error al intentar guardar: " + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        txtCliente.setText("");
        txtDescripcion.setText("");
        txtDni.setText("");
        txtEncargado.setText("");
        txtMonto.setText("");
        txtProyecto.setText(""); 
        comboBoxEstado.setSelectedIndex(0);
        comboBoxMetodoPago.setSelectedIndex(0);
        JdateChooser.setDate(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        try {
            int filaSeleccionada = jTable.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, 
                        "Seleccione una fila para editar.", 
                        "Advertencia", 
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            filaEditando = filaSeleccionada;

            DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();

            txtCliente.setText(modelo.getValueAt(filaSeleccionada, 0).toString());
            txtDni.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
            txtProyecto.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
            txtDescripcion.setText(modelo.getValueAt(filaSeleccionada, 3).toString());
            txtEncargado.setText(modelo.getValueAt(filaSeleccionada, 4).toString());

            comboBoxEstado.setSelectedItem(modelo.getValueAt(filaSeleccionada, 5).toString());

            String fechaStr = modelo.getValueAt(filaSeleccionada, 6).toString();
            if(!fechaStr.isEmpty()){
                JdateChooser.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(fechaStr));
            } else {
                JdateChooser.setDate(null);
            }

            comboBoxMetodoPago.setSelectedItem(modelo.getValueAt(filaSeleccionada, 7).toString());

            txtMonto.setText(modelo.getValueAt(filaSeleccionada, 8).toString());

            JOptionPane.showMessageDialog(this, 
                    "Datos cargados. Ahora puedes modificarlos y volver a presionar Guardar.", 
                    "Editar", 
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Error al intentar editar: " + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {
            int filaSeleccionada = jTable.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, 
                        "Seleccione una fila para eliminar.", 
                        "Advertencia", 
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            int confirmacion = JOptionPane.showConfirmDialog(this, 
                    "¿Está seguro de eliminar el reporte seleccionado?", 
                    "Confirmar Eliminación", 
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
                modelo.removeRow(filaSeleccionada);

                JOptionPane.showMessageDialog(this, 
                        "Reporte eliminado exitosamente.", 
                        "Eliminar", 
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Error al eliminar: " + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGenerarBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarBoletaActionPerformed
        // TODO add your handling code here:
        try {
            int filaSeleccionada = jTable.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, 
                        "Seleccione una fila para generar la boleta.", 
                        "Advertencia", 
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();

            String cliente = modelo.getValueAt(filaSeleccionada, 0).toString();
            String dni = modelo.getValueAt(filaSeleccionada, 1).toString();
            String proyecto = modelo.getValueAt(filaSeleccionada, 2).toString();
            String descripcion = modelo.getValueAt(filaSeleccionada, 3).toString();
            String encargado = modelo.getValueAt(filaSeleccionada, 4).toString();
            String estado = modelo.getValueAt(filaSeleccionada, 5).toString();
            String fechaPago = modelo.getValueAt(filaSeleccionada, 6).toString();
            String metodoPago = modelo.getValueAt(filaSeleccionada, 7).toString();
            String monto = modelo.getValueAt(filaSeleccionada, 8).toString();

            String boleta = "========= BOLETA DE SERVICIO =========\n\n"
                    + "Cliente: " + cliente + "\n"
                    + "DNI: " + dni + "\n"
                    + "Proyecto: " + proyecto + "\n"
                    + "Descripción: " + descripcion + "\n"
                    + "Encargado: " + encargado + "\n"
                    + "Estado: " + estado + "\n"
                    + "Fecha de Pago: " + fechaPago + "\n"
                    + "Método de Pago: " + metodoPago + "\n"
                    + "Monto: S/ " + monto + "\n\n"
                    + "======================================\n"
                    + "Gracias por confiar en nuestro servicio.";

            JOptionPane.showMessageDialog(this, 
                    boleta, 
                    "Boleta Generada", 
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Error al generar la boleta: " + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGenerarBoletaActionPerformed

    private void btnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaActionPerformed
        // BOLETA                                          
        int filaSeleccionada = jTable.getSelectedRow();
    
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, seleccione un registro en la tabla para generar la BOLETA.",
                    "Sin selección",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this,
                "Generando BOLETA para el cliente: " + jTable.getValueAt(filaSeleccionada, 0)
                + "\nProyecto: " + jTable.getValueAt(filaSeleccionada, 2)
                + "\nMonto: S/ " + jTable.getValueAt(filaSeleccionada, 8)
                + "\n\nGenerando...",
                "Generar Boleta",
                JOptionPane.INFORMATION_MESSAGE);

        generarDocumentoPDF("Boleta");
    }//GEN-LAST:event_btnBoletaActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        // FACTURA
        int filaSeleccionada = jTable.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, seleccione un registro en la tabla para generar la FACTURA.",
                    "Sin selección",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this,
                "Generando FACTURA para el cliente: " + jTable.getValueAt(filaSeleccionada, 0)
                + "\nProyecto: " + jTable.getValueAt(filaSeleccionada, 2)
                + "\nMonto: S/ " + jTable.getValueAt(filaSeleccionada, 8)
                + "\n\nGenerando...",
                "Generar Factura",
                JOptionPane.INFORMATION_MESSAGE);

        generarDocumentoPDF("Factura");
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnProformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProformaActionPerformed
       // PROFORMA
        int filaSeleccionada = jTable.getSelectedRow();
    
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, seleccione un registro en la tabla para generar la PROFORMA.",
                    "Sin selección",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this,
                "Generando PROFORMA (cotización) para el cliente: " + jTable.getValueAt(filaSeleccionada, 0)
                + "\nProyecto: " + jTable.getValueAt(filaSeleccionada, 2)
                + "\nMonto estimado: S/ " + jTable.getValueAt(filaSeleccionada, 8)
                + "\n\nGenerando...",
                "Generar Proforma",
                JOptionPane.INFORMATION_MESSAGE);

        generarDocumentoPDF("Proforma");
    }//GEN-LAST:event_btnProformaActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JdateChooser;
    private javax.swing.JButton btnBoleta;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnGenerarBoleta;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProforma;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JComboBox<String> comboBoxMetodoPago;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable jTable;
    private javax.swing.JPanel jp1;
    private javax.swing.JScrollPane spT;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEncargado;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtProyecto;
    // End of variables declaration//GEN-END:variables
}
