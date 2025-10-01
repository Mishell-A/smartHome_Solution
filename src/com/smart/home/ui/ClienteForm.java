/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.smart.home.ui;

/**
 *
 * @author INTEL
 */
public class ClienteForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ClienteForm.class.getName());

    /**
     * Creates new form ClienteForm
     */
    public ClienteForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();
        lblProyecto = new javax.swing.JLabel();
        lblInventario = new javax.swing.JLabel();
        lblRegistroCliente = new javax.swing.JLabel();
        lblGestionEmpleado = new javax.swing.JLabel();
        lblControlFinanciero = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaCliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión Integral");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInicio.setText("INICIO");
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
        });
        jPanel1.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        lblProyecto.setText("PROYECTO");
        lblProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProyectoMouseClicked(evt);
            }
        });
        jPanel1.add(lblProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        lblInventario.setText("INVENTARIO");
        lblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInventarioMouseClicked(evt);
            }
        });
        jPanel1.add(lblInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        lblRegistroCliente.setText("REGISTRO DE CLIENTE");
        lblRegistroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroClienteMouseClicked(evt);
            }
        });
        jPanel1.add(lblRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        lblGestionEmpleado.setText("GESTION DE EMPLEADO");
        lblGestionEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGestionEmpleadoMouseClicked(evt);
            }
        });
        jPanel1.add(lblGestionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        lblControlFinanciero.setText("CONTROL FINANCIERO");
        lblControlFinanciero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblControlFinancieroMouseClicked(evt);
            }
        });
        jPanel1.add(lblControlFinanciero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        tblTablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Nombre", "DNI", "Celular", "Dirección"
            }
        ));
        jScrollPane2.setViewportView(tblTablaCliente);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); 

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre:"));
        txtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI:"));
        txtCelular.setBorder(javax.swing.BorderFactory.createTitledBorder("Celular:"));
        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección:"));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNombre)
            .addComponent(txtDNI)
            .addComponent(txtCelular)
            .addComponent(txtDireccion)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnGuardar)
                .addGap(28, 28, 28)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel7.setText("REGISTRO DE CLIENTE");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); 
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel8.setText("Administrador");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 620, 450));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/house.png"))); 
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 30, 160, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proyecto.png"))); 
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 110, 160, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario.png"))); 
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 190, 160, 60));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); 
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 280, 160, 60));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado.png"))); 
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 350, 160, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/finanzas.png"))); 
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 420, 200, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) { } 
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) { } 
    private void lblProyectoMouseClicked(java.awt.event.MouseEvent evt) { } 
    private void lblInventarioMouseClicked(java.awt.event.MouseEvent evt) { } 
    private void lblRegistroClienteMouseClicked(java.awt.event.MouseEvent evt) { } 
    private void lblGestionEmpleadoMouseClicked(java.awt.event.MouseEvent evt) { } 
    private void lblControlFinancieroMouseClicked(java.awt.event.MouseEvent evt) { } 
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) { } 
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) { } 
    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) { } 
    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) { } 
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) { } 
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) { } 
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) { } 
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) { } 

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new ClienteForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblControlFinanciero;
    private javax.swing.JLabel lblGestionEmpleado;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblProyecto;
    private javax.swing.JLabel lblRegistroCliente;
    private javax.swing.JTable tblTablaCliente;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
