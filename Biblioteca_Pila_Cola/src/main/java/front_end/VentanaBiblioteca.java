package front_end;

import back_end.*;
import javax.swing.JOptionPane;

public class VentanaBiblioteca extends javax.swing.JFrame {

    private final PilaTrabajosLIFO pila = new PilaTrabajosLIFO();

    public VentanaBiblioteca() {
        initComponents();
        setLocationRelativeTo(null);
        actualizarCamposSegunTipo();
        actualizarVistaPila();
    }

    private void actualizarCamposSegunTipo() {
        String tipo = cmbTipo.getSelectedItem().toString();

        txtPaginas.setEnabled(false);
        txtEdicion.setEnabled(false);
        txtConferencia.setEnabled(false);

        if (!tipo.equals("Libro")) txtPaginas.setText("");
        if (!tipo.equals("Revista")) txtEdicion.setText("");
        if (!tipo.equals("Articulo")) txtConferencia.setText("");

        switch (tipo) {
            case "Libro":
                txtPaginas.setEnabled(true);
                break;
            case "Revista":
                txtEdicion.setEnabled(true);
                break;
            case "Articulo":
                txtConferencia.setEnabled(true);
                break;
        }
    }

    private void actualizarVistaPila() {
        txtAreaPila.setText(pila.obtenerEstadoVisual());
    }

    private void limpiarFormulario() {
        txtTitulo.setText("");
        txtAutor.setText("");
        txtAnio.setText("");
        txtPaginas.setText("");
        txtEdicion.setText("");
        txtConferencia.setText("");
        txtTitulo.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloVentana = new javax.swing.JLabel();
        panelFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPaginas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEdicion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtConferencia = new javax.swing.JTextField();
        panelAcciones = new javax.swing.JPanel();
        btnPush = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        btnPeek = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        panelVisualizacion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaPila = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Biblioteca - Estructura Pila (LIFO)");
        setResizable(false);

        jLabelTituloVentana.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTituloVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloVentana.setText("Sistema de Gestión Bibliográfica (Pila LIFO)");

        panelFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Documento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setText("Tipo de Publicación:");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Revista", "Articulo" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        jLabel2.setText("Título:");

        jLabel3.setText("Autor:");

        jLabel4.setText("Año Publicación:");

        jLabel5.setText("Núm. Páginas (Libro):");

        jLabel6.setText("Núm. Edición (Revista):");

        jLabel7.setText("Conferencia (Artículo):");

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbTipo, 0, 210, Short.MAX_VALUE)
                    .addComponent(txtTitulo)
                    .addComponent(txtAutor)
                    .addComponent(txtAnio)
                    .addComponent(txtPaginas)
                    .addComponent(txtEdicion)
                    .addComponent(txtConferencia))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtConferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelAcciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones de Pila", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btnPush.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPush.setText("Apilar (Push)");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });

        btnPop.setText("Desapilar (Pop)");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });

        btnPeek.setText("Consultar Tope (Peek)");
        btnPeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeekActionPerformed(evt);
            }
        });

        btnVaciar.setText("Vaciar Pila");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPush, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPeek, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPop, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btnVaciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPush, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelVisualizacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado Actual de la Pila (LIFO)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtAreaPila.setEditable(false);
        txtAreaPila.setColumns(20);
        txtAreaPila.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        txtAreaPila.setRows(5);
        jScrollPane1.setViewportView(txtAreaPila);

        javax.swing.GroupLayout panelVisualizacionLayout = new javax.swing.GroupLayout(panelVisualizacion);
        panelVisualizacion.setLayout(panelVisualizacionLayout);
        panelVisualizacionLayout.setHorizontalGroup(
            panelVisualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVisualizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelVisualizacionLayout.setVerticalGroup(
            panelVisualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVisualizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(panelVisualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelTituloVentana)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelVisualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        actualizarCamposSegunTipo();
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        try {
            String titulo = txtTitulo.getText().trim();
            String autor = txtAutor.getText().trim();
            String anioStr = txtAnio.getText().trim();

            if (titulo.isEmpty() || autor.isEmpty() || anioStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Título, Autor y Año son obligatorios.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int anio = Integer.parseInt(anioStr);
            if (anio <= 0) {
                JOptionPane.showMessageDialog(this, "El año de publicación debe ser un entero mayor a cero.", "Dato inválido", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String tipo = cmbTipo.getSelectedItem().toString();
            Trabajo nuevoTrabajo = null;

            switch (tipo) {
                case "Libro":
                    String pagStr = txtPaginas.getText().trim();
                    if (pagStr.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Ingresa el número de páginas del libro.", "Campo vacío", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    int paginas = Integer.parseInt(pagStr);
                    if (paginas <= 0) {
                        JOptionPane.showMessageDialog(this, "El número de páginas debe ser mayor a cero.", "Dato inválido", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    nuevoTrabajo = new Libro(titulo, autor, anio, paginas);
                    break;

                case "Revista":
                    String edStr = txtEdicion.getText().trim();
                    if (edStr.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Ingresa el número de edición de la revista.", "Campo vacío", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    int edicion = Integer.parseInt(edStr);
                    if (edicion <= 0) {
                        JOptionPane.showMessageDialog(this, "El número de edición debe ser mayor a cero.", "Dato inválido", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    nuevoTrabajo = new Revista(titulo, autor, anio, edicion);
                    break;

                case "Articulo":
                    String conferencia = txtConferencia.getText().trim();
                    if (conferencia.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Ingresa el nombre de la conferencia del artículo.", "Campo vacío", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    nuevoTrabajo = new Articulo(titulo, autor, anio, conferencia);
                    break;
            }

            pila.push(nuevoTrabajo);
            actualizarVistaPila();
            limpiarFormulario();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Verifica que Año, Páginas o Edición contengan solo números enteros válidos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        try {
            Trabajo atendido = pila.pop();
            actualizarVistaPila();
            JOptionPane.showMessageDialog(this,
                "Trabajo desapilado y procesado (LIFO):\n\n" + atendido.toString(),
                "Pop Exitoso",
                JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalStateException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Pila Vacía", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeekActionPerformed
        try {
            Trabajo enTope = pila.peek();
            JOptionPane.showMessageDialog(this,
                "Elemento actual en el TOPE de la pila (sin remover):\n\n" + enTope.toString(),
                "Consulta Peek",
                JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalStateException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Pila Vacía", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPeekActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        if (pila.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La pila ya se encuentra vacía.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Estás seguro de que deseas eliminar todos los trabajos de la pila?",
            "Confirmar vaciado",
            JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            pila.vaciarPila();
            actualizarVistaPila();
            JOptionPane.showMessageDialog(this, "La pila ha sido vaciada correctamente (isEmpty = " + pila.isEmpty() + ").", "Pila Vaciada", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVaciarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(VentanaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPeek;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelTituloVentana;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JPanel panelVisualizacion;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextArea txtAreaPila;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtConferencia;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}