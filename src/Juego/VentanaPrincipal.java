package Juego;

import hanoi_2.pkg0.MainFrame;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hector
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    protected int contadorMovimietos = 0;
    protected PilaDato pilaTorre1;
    protected PilaDato pilaTorre2;
    protected PilaDato pilaTorre3;
    protected int objetivo = 0;
    protected double numMinimoMovimiento = 0;
    protected boolean terminar = false;
    DefaultTableModel modelt1, modelt2, modelt3;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        //metodos para poder agregar fichas a la torres
        modelt1 = (DefaultTableModel) torre1.getModel();
        modelt1.setRowCount(10);
        modelt2 = (DefaultTableModel) torre2.getModel();
        modelt2.setRowCount(10);
        modelt3 = (DefaultTableModel) torre3.getModel();
        modelt3.setRowCount(10);
        botonReiniciar.setEnabled(false);

        //centrar fichas en las torres
        DefaultTableCellRenderer render1 = new DefaultTableCellRenderer();
        render1.setHorizontalAlignment(SwingConstants.CENTER);
        torre1.getColumnModel().getColumn(0).setCellRenderer(render1);
        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
        render2.setHorizontalAlignment(SwingConstants.CENTER);
        torre2.getColumnModel().getColumn(0).setCellRenderer(render2);
        DefaultTableCellRenderer render3 = new DefaultTableCellRenderer();
        render3.setHorizontalAlignment(SwingConstants.CENTER);
        torre3.getColumnModel().getColumn(0).setCellRenderer(render3);

    }

    public void limpiar() {
        contadorMovimietos = 0;
        numMinimoMovimiento = 0;
        cbNumeroFicha.setSelectedItem(String.valueOf(objetivo));
    }

    public void presentarNumeroMovimieto() {
        contadorMovimietos++;
        lblMovimientos.setText(String.valueOf(contadorMovimietos));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonIniciar = new javax.swing.JButton();
        botonReiniciar = new javax.swing.JButton();
        botonResolver = new javax.swing.JButton();
        lblMovimientos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMinimoMovimientos = new javax.swing.JLabel();
        cbNumeroFicha = new javax.swing.JComboBox<>();
        boton1_2 = new javax.swing.JButton();
        boton1_3 = new javax.swing.JButton();
        boton2_1 = new javax.swing.JButton();
        boton2_3 = new javax.swing.JButton();
        boton3_1 = new javax.swing.JButton();
        boton3_2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        torre3 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        torre2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        torre1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROYECTO DE MATE COMPUTO 2 Ing. DIego Orozco");
        setBackground(new java.awt.Color(155, 237, 228));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(63, 146, 193));

        botonIniciar.setBackground(new java.awt.Color(58, 198, 91));
        botonIniciar.setText("INICIAR");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        botonReiniciar.setText("REINICIAR");
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });

        botonResolver.setText("RESOLVER");
        botonResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResolverActionPerformed(evt);
            }
        });

        lblMovimientos.setBackground(new java.awt.Color(214, 232, 231));
        lblMovimientos.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblMovimientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMovimientos.setText("0");
        lblMovimientos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Numero de movimientos realizado:");

        jLabel3.setText("Numero mínimo de movimientos:");

        jLabel2.setText("Numero de fichas:");

        lblMinimoMovimientos.setBackground(new java.awt.Color(214, 232, 231));
        lblMinimoMovimientos.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblMinimoMovimientos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimoMovimientos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbNumeroFicha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        boton1_2.setBackground(new java.awt.Color(219, 145, 87));
        boton1_2.setText("mover a 2");
        boton1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1_2ActionPerformed(evt);
            }
        });

        boton1_3.setBackground(new java.awt.Color(0, 192, 181));
        boton1_3.setText("mover a 3");
        boton1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1_3ActionPerformed(evt);
            }
        });

        boton2_1.setBackground(new java.awt.Color(219, 145, 87));
        boton2_1.setText("mover a 1");
        boton2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2_1ActionPerformed(evt);
            }
        });

        boton2_3.setBackground(new java.awt.Color(0, 192, 181));
        boton2_3.setText("mover a 3");
        boton2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2_3ActionPerformed(evt);
            }
        });

        boton3_1.setBackground(new java.awt.Color(219, 145, 87));
        boton3_1.setText("mover a 1");
        boton3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3_1ActionPerformed(evt);
            }
        });

        boton3_2.setBackground(new java.awt.Color(0, 192, 181));
        boton3_2.setText("mover a 2");
        boton3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3_2ActionPerformed(evt);
            }
        });

        torre3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Torre 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        torre3.setAutoscrolls(false);
        torre3.setFocusable(false);
        torre3.setRowSelectionAllowed(false);
        torre3.setShowHorizontalLines(false);
        torre3.setShowVerticalLines(false);
        jScrollPane2.setViewportView(torre3);
        if (torre3.getColumnModel().getColumnCount() > 0) {
            torre3.getColumnModel().getColumn(0).setResizable(false);
        }

        torre2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Torre 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        torre2.setAutoscrolls(false);
        torre2.setFocusable(false);
        torre2.setRowSelectionAllowed(false);
        torre2.setShowHorizontalLines(false);
        torre2.setShowVerticalLines(false);
        jScrollPane1.setViewportView(torre2);
        if (torre2.getColumnModel().getColumnCount() > 0) {
            torre2.getColumnModel().getColumn(0).setResizable(false);
        }

        torre1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Torre 1"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        torre1.setAutoscrolls(false);
        torre1.setFocusable(false);
        torre1.setRowSelectionAllowed(false);
        torre1.setShowHorizontalLines(false);
        torre1.setShowVerticalLines(false);
        jScrollPane3.setViewportView(torre1);
        if (torre1.getColumnModel().getColumnCount() > 0) {
            torre1.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("TORRES DE HANOI");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("SIMULAR UNA SOLUCION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(boton2_1)
                                                .addGap(18, 18, 18)
                                                .addComponent(boton2_3)))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(boton3_1)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(boton3_2)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblMinimoMovimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbNumeroFicha, 0, 131, Short.MAX_VALUE)
                                            .addComponent(lblMovimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(37, 37, 37)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton1_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton1_3))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(botonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(botonResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton1_2)
                            .addComponent(boton3_1)
                            .addComponent(boton3_2)
                            .addComponent(boton2_3)
                            .addComponent(boton1_3)
                            .addComponent(boton2_1))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbNumeroFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblMinimoMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        // TODO add your handling code here:
        botonIniciar.setEnabled(false);
        botonReiniciar.setEnabled(true);
        contadorMovimietos = 0;
        iniciar();
        contador();
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
        // TODO add your handling code here:
        botonReiniciar.setEnabled(false);
        botonIniciar.setEnabled(true);
        reiniciar();
    }//GEN-LAST:event_botonReiniciarActionPerformed

    private void boton1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1_2ActionPerformed
        // TODO add your handling code here:
        mover1_2();
        contador();
    }//GEN-LAST:event_boton1_2ActionPerformed

    private void boton1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1_3ActionPerformed
        // TODO add your handling code here:
        mover1_3();
        contador();
    }//GEN-LAST:event_boton1_3ActionPerformed

    private void boton2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2_1ActionPerformed
        // TODO add your handling code here:
        mover2_1();
        contador();
    }//GEN-LAST:event_boton2_1ActionPerformed

    private void boton2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2_3ActionPerformed
        // TODO add your handling code here:
        mover2_3();
        contador();
    }//GEN-LAST:event_boton2_3ActionPerformed

    private void boton3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3_1ActionPerformed
        // TODO add your handling code here:
        mover3_1();
        contador();
    }//GEN-LAST:event_boton3_1ActionPerformed

    private void boton3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3_2ActionPerformed
        // TODO add your handling code here:
        mover3_2();
        contador();
    }//GEN-LAST:event_boton3_2ActionPerformed

    private void botonResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResolverActionPerformed
        // TODO add your handling code here:
        if (!lblMinimoMovimientos.getText().equals("") && pilaTorre3.getContador() != objetivo) {
            reiniciar();
            terminar = false;
            resolverTorre(objetivo, pilaTorre1, pilaTorre2, pilaTorre3);
        }
    }//GEN-LAST:event_botonResolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainFrame mainFrame = new MainFrame();
        this.setVisible(false);
        mainFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void moverTorres(PilaDato origen, PilaDato destino) {
        try {
            if (terminar == false) {

                Nodo plataforma = new Nodo();
                plataforma.setDato(origen.devolverNodo());
                origen.desapilar();

                destino.apilar(plataforma);
                presentarTorre1();
                presentarTorre2();
                presentarTorre3();
                presentarNumeroMovimieto();
                JOptionPane pane = new JOptionPane("Paso: " + lblMovimientos.getText() + ""
                        + "\n\n Continuar??", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
                JDialog dialog = pane.createDialog("Numero paso");
                dialog.setLocation(800, 500);
                dialog.setVisible(true);

                int opcion = (int) pane.getValue();

                if (opcion == JOptionPane.NO_OPTION) {
                    terminar = true;
                }

            }
        } catch (Exception e) {
        }

    }

    public void resolverTorre(int numero, PilaDato origen, PilaDato auxiliar, PilaDato destino) {

        if (numero == 1) {
            moverTorres(origen, destino);

        } else {
            resolverTorre(numero - 1, origen, destino, auxiliar);
            moverTorres(origen, destino);
            resolverTorre(numero - 1, auxiliar, origen, destino);
        }
    }

    public void mover3_2() {
        try {
            if (pilaTorre3.getContador() > 0) {
                Nodo esenario = new Nodo();
                esenario.setDato(pilaTorre3.devolverNodo());

                if (pilaTorre2.getContador() > 0) {
                    if (esenario.getDato().compareTo(pilaTorre2.devolverNodo()) > 0) {
                        JOptionPane.showMessageDialog(null, "no se puede colocar una fiha mayor "
                                + "\nencima de una menor");
                        return;
                    }
                }

                pilaTorre3.desapilar();
                pilaTorre2.apilar(esenario);
                presentarTorre3();
                presentarTorre2();
                presentarNumeroMovimieto();
            }

        } catch (Exception e) {
        }
    }

    public void mover3_1() {
        try {
            if (pilaTorre3.getContador() > 0) {
                Nodo esenario = new Nodo();
                esenario.setDato(pilaTorre3.devolverNodo());

                if (pilaTorre1.getContador() > 0) {
                    if (esenario.getDato().compareTo(pilaTorre1.devolverNodo()) > 0) {
                        JOptionPane.showMessageDialog(null, "no se puede colocar una fiha mayor "
                                + "\nencima de una menor");
                        return;
                    }
                }

                pilaTorre3.desapilar();
                pilaTorre1.apilar(esenario);
                presentarTorre1();
                presentarTorre3();
                presentarNumeroMovimieto();
            }

        } catch (Exception e) {
        }
    }

    public void mover2_3() {
        try {
            if (pilaTorre2.getContador() > 0) {
                Nodo esenario = new Nodo();
                esenario.setDato(pilaTorre2.devolverNodo());

                if (pilaTorre3.getContador() > 0) {
                    if (esenario.getDato().compareTo(pilaTorre3.devolverNodo()) > 0) {
                        JOptionPane.showMessageDialog(null, "no se puede colocar una fiha mayor "
                                + "\nencima de una menor");
                        return;
                    }
                }

                pilaTorre2.desapilar();
                pilaTorre3.apilar(esenario);
                presentarTorre2();
                presentarTorre3();
                presentarNumeroMovimieto();

                if (pilaTorre3.getContador() == objetivo && contadorMovimietos == numMinimoMovimiento) {
                    JOptionPane.showMessageDialog(null, "Felicidades has alcanzado el objetivo de "
                            + "\nminimo de movimietos,\n intenta con otra cantidad de fichas");

                } else if (pilaTorre3.getContador() == objetivo && contadorMovimietos != numMinimoMovimiento) {
                    JOptionPane.showMessageDialog(null, "Felicidades lo has resuelto pero no has logrado "
                            + "\nel minimo de movimietos,\n intenta alcanzar el objetivo");

                }
            }

        } catch (Exception e) {
        }
    }

    public void mover2_1() {
        try {
            if (pilaTorre2.getContador() > 0) {
                Nodo esenario = new Nodo();
                esenario.setDato(pilaTorre2.devolverNodo());

                if (pilaTorre1.getContador() > 0) {
                    if (esenario.getDato().compareTo(pilaTorre1.devolverNodo()) > 0) {
                        JOptionPane.showMessageDialog(null, "no se puede colocar una fiha mayor "
                                + "\nencima de una menor");
                        return;
                    }
                }

                pilaTorre2.desapilar();
                pilaTorre1.apilar(esenario);
                presentarTorre1();
                presentarTorre2();
                presentarNumeroMovimieto();
            }

        } catch (Exception e) {
        }
    }

    public void mover1_3() {
        try {
            if (pilaTorre1.getContador() > 0) {
                Nodo esenario = new Nodo();
                esenario.setDato(pilaTorre1.devolverNodo());

                if (pilaTorre3.getContador() > 0) {
                    if (esenario.getDato().compareTo(pilaTorre3.devolverNodo()) > 0) {
                        JOptionPane.showMessageDialog(null, "no se puede colocar una fiha mayor "
                                + "\nencima de una menor");
                        return;
                    }
                }

                pilaTorre1.desapilar();
                pilaTorre3.apilar(esenario);
                presentarTorre1();
                presentarTorre3();
                presentarNumeroMovimieto();

                if (pilaTorre3.getContador() == objetivo && contadorMovimietos == numMinimoMovimiento) {
                    JOptionPane.showMessageDialog(null, "Felicidades has alcanzado el objetivo de "
                            + "\nminimo de movimietos,\n intenta con otra cantidad de fichas");

                } else if (pilaTorre3.getContador() == objetivo && contadorMovimietos != numMinimoMovimiento) {
                    JOptionPane.showMessageDialog(null, "Felicidades lo has resuelto pero no has logrado "
                            + "\nel minimo de movimietos,\n intenta alcanzar el objetivo");

                }
            }

        } catch (Exception e) {
        }
    }

    public void mover1_2() {
        try {
            if (pilaTorre1.getContador() > 0) {
                Nodo esenario = new Nodo();
                esenario.setDato(pilaTorre1.devolverNodo());

                if (pilaTorre2.getContador() > 0) {
                    if (esenario.getDato().compareTo(pilaTorre2.devolverNodo()) > 0) {
                        JOptionPane.showMessageDialog(null, "no se puede colocar una fiha mayor "
                                + "\nencima de una menor");
                        return;
                    }
                }

                pilaTorre1.desapilar();
                pilaTorre2.apilar(esenario);
                presentarTorre1();
                presentarTorre2();
                presentarNumeroMovimieto();
            }

        } catch (Exception e) {
        }
    }

    public void iniciar() {
        try {
            pilaTorre1 = new PilaDato();
            pilaTorre2 = new PilaDato();
            pilaTorre3 = new PilaDato();

            objetivo = Integer.parseInt(cbNumeroFicha.getSelectedItem().toString());

            //obtener la cantidad minima de movimientos An = 2^n -1
            numMinimoMovimiento = Math.pow(2, objetivo) - 1;
            //imprimir minimo de movimietos y el movimineto inicial
            lblMovimientos.setText(String.valueOf(contadorMovimietos));
            lblMinimoMovimientos.setText(String.valueOf(String.format("%.0f", numMinimoMovimiento)));

            //dibujar torre inicial
            for (int i = objetivo; i >= 1; i--) {
                Nodo plataforma = new Nodo();
                String ficha = "";

                for (int j = i; j > 0; j--) {
                    ficha += "°";
                }

                plataforma.setDato(ficha);
                pilaTorre1.apilar(plataforma);

            }
            presentarTorre1();
            presentarTorre2();
            presentarTorre3();

        } catch (Exception e) {
            System.out.println("error: \n" + e);
        }
    }

    public void presentarTorre1() {
        ((DefaultTableModel) torre1.getModel()).setRowCount(0);
        modelt1.setRowCount(10);

        Nodo k;
        int nodoFicha = (10 - pilaTorre1.getContador());

        if (pilaTorre1.getContador() > 0) {

            for (k = pilaTorre1.getInicio(); k.getAbajo() != null; k = k.getAbajo()) {
                String[] vectorDato = {k.getDato()};
                modelt1.insertRow(nodoFicha, vectorDato);
                nodoFicha++;
            }

            if (k.getAbajo() == null) {
                String[] vectorDato = {k.getDato()};
                modelt1.insertRow(nodoFicha, vectorDato);
            }
        }
        torre1.setModel(modelt1);
        modelt1.setRowCount(10);
    }

    public void presentarTorre2() {
        ((DefaultTableModel) torre2.getModel()).setRowCount(0);
        modelt2.setRowCount(10);

        Nodo k;
        int nodoFicha = (10 - pilaTorre2.getContador());

        if (pilaTorre2.getContador() > 0) {

            for (k = pilaTorre2.getInicio(); k.getAbajo() != null; k = k.getAbajo()) {
                String[] vectorDato = {k.getDato()};
                modelt2.insertRow(nodoFicha, vectorDato);
                nodoFicha++;
            }

            if (k.getAbajo() == null) {
                String[] vectorDato = {k.getDato()};
                modelt2.insertRow(nodoFicha, vectorDato);
            }
        }
        torre2.setModel(modelt2);
        modelt2.setRowCount(10);
    }

    public void presentarTorre3() {
        ((DefaultTableModel) torre3.getModel()).setRowCount(0);
        modelt3.setRowCount(10);

        Nodo k;
        int nodoFicha = (10 - pilaTorre3.getContador());

        if (pilaTorre3.getContador() > 0) {

            for (k = pilaTorre3.getInicio(); k.getAbajo() != null; k = k.getAbajo()) {
                String[] vectorDato = {k.getDato()};
                modelt3.insertRow(nodoFicha, vectorDato);
                nodoFicha++;
            }

            if (k.getAbajo() == null) {
                String[] vectorDato = {k.getDato()};
                modelt3.insertRow(nodoFicha, vectorDato);
            }
        }
        torre3.setModel(modelt3);
        modelt3.setRowCount(10);
    }

    public void reiniciar() {
        try {
            if (!lblMinimoMovimientos.getText().equals("")) {

                limpiar();
                iniciar();
            }
        } catch (Exception e) {
            System.out.println("error: \n" + e);
        }
    }

    public void contador() {
        try {
            int A = Integer.parseInt(lblMinimoMovimientos.getText());
            int B = Integer.parseInt(lblMovimientos.getText());

            if ((A + 1) >= B) {

            } else {
                if (B > A) {
                    JOptionPane.showMessageDialog(null, "Perdiste! :( \nHas sobrepasado los limites minimos de movimiento");
                } else {
                }
            }
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1_2;
    private javax.swing.JButton boton1_3;
    private javax.swing.JButton boton2_1;
    private javax.swing.JButton boton2_3;
    private javax.swing.JButton boton3_1;
    private javax.swing.JButton boton3_2;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JButton botonResolver;
    private javax.swing.JComboBox<String> cbNumeroFicha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblMinimoMovimientos;
    private javax.swing.JLabel lblMovimientos;
    private javax.swing.JTable torre1;
    private javax.swing.JTable torre2;
    private javax.swing.JTable torre3;
    // End of variables declaration//GEN-END:variables
}
