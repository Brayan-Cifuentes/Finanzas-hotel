/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Tablas;
import static Finanzas.Principal.S_EL;
import static Finanzas.Principal.S_Med;
import static Finanzas.Principal.S_NA;
import static Finanzas.Principal.S_RL;
import static Finanzas.Principal.S_RP;
import Finanzas_Clases.Curriculum;

/**
 *
 * @author Brayan Cifuentes
 */
public class Curriculum_V extends javax.swing.JFrame {

    /**
     * Creates new form Curriculum_V
     */
    
    int x,y;
    
    //Textos para buscar combobox en tablas
    public static String S_NA = "Nivel Academico";
    public static String Item_NA = "";
    
    public static String S_RP = "Referencias Personales";//esta ya culo
    public static String Item_RP;
    
    public static String S_EL = "Experiencia Laboral";
    public static String Item_EL = "";
    
    public static String S_RL = "Referencias Laborales";
    public static String Item_RL;
    
    public static String S_Med = "Medio";
    public static String Item_Med;
   
    
    
    public Curriculum_V() {
        initComponents();
        
         //otros combobox
        jComboBox_TablasB_CV1.addItem(S_NA);
        jComboBox_TablasB_CV1.addItem(S_RP);
        jComboBox_TablasB_CV1.addItem(S_RL);
        jComboBox_TablasB_CV1.addItem(S_EL);
        jComboBox_TablasB_CV1.addItem(S_Med);
        
        
        Curriculum CV = new Finanzas_Clases.Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.Actualizar_Tabla();
        
        txt_DPICV.setVisible(false);
        txt_NombreCV.setVisible(false);
        txt_ApellidoCV.setVisible(false);
        txt_TelefonoCV.setVisible(false);
        txt_CorreoCV.setVisible(false);
        txt_DireccionCV.setVisible(false);
        txt_GeneroCV.setVisible(false);
        txt_EdadCV.setVisible(false);
        jComboBox_NivelACV.setVisible(false);
        jComboBox_RPCV.setVisible(false);
        jComboBox_RLCV.setVisible(false);
        jComboBox_ELCV.setVisible(false);
        jComboBox_MedioCV.setVisible(false);
        jLabel_RL_CV.setVisible(false);
        jLabel_EL_CV.setVisible(false);
        jLabel_Medio_CV.setVisible(false);
        jLabel_NivelA_CV.setVisible(false);
        jLabel_RP_CV.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExpLD = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        Movimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Buscar = new javax.swing.JLabel();
        icono_Buscar = new javax.swing.JLabel();
        txt_Buscar_CV = new javax.swing.JTextField();
        jComboBox_RLCV = new javax.swing.JComboBox<>();
        jLabel_RL_CV = new javax.swing.JLabel();
        jComboBox_ELCV = new javax.swing.JComboBox<>();
        jLabel_EL_CV = new javax.swing.JLabel();
        jComboBox_MedioCV = new javax.swing.JComboBox<>();
        jLabel_Medio_CV = new javax.swing.JLabel();
        txt_DireccionCV = new javax.swing.JTextField();
        txt_GeneroCV = new javax.swing.JTextField();
        txt_EdadCV = new javax.swing.JTextField();
        jComboBox_NivelACV = new javax.swing.JComboBox<>();
        jLabel_NivelA_CV = new javax.swing.JLabel();
        jComboBox_RPCV = new javax.swing.JComboBox<>();
        jLabel_RP_CV = new javax.swing.JLabel();
        txt_CorreoCV = new javax.swing.JTextField();
        txt_TelefonoCV = new javax.swing.JTextField();
        txt_ApellidoCV = new javax.swing.JTextField();
        txt_NombreCV = new javax.swing.JTextField();
        txt_DPICV = new javax.swing.JTextField();
        jScrollPane30 = new javax.swing.JScrollPane();
        tbl_CV = new javax.swing.JTable();
        jComboBox_TablasB_CV1 = new javax.swing.JComboBox<>();
        jLabel_Buscar_Tablas1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ExpLD.setBackground(new java.awt.Color(28, 27, 33));
        ExpLD.setEnabled(false);
        ExpLD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Curriculum");
        ExpLD.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 280, 40));

        Movimiento.setBackground(new java.awt.Color(28, 27, 33));
        Movimiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovimientoMouseDragged(evt);
            }
        });
        Movimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovimientoMousePressed(evt);
            }
        });
        Movimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Movimiento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 20, 30));

        ExpLD.add(Movimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 40));

        jLabel_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Buscar.setText("Buscar");
        ExpLD.add(jLabel_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 50, 20));

        icono_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_D.png"))); // NOI18N
        ExpLD.add(icono_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 20, 20));

        txt_Buscar_CV.setBackground(new java.awt.Color(231, 231, 231));
        txt_Buscar_CV.setForeground(new java.awt.Color(153, 153, 153));
        txt_Buscar_CV.setBorder(null);
        txt_Buscar_CV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_CVActionPerformed(evt);
            }
        });
        txt_Buscar_CV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Buscar_CVKeyReleased(evt);
            }
        });
        ExpLD.add(txt_Buscar_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 290, 20));

        jComboBox_RLCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_RLCVActionPerformed(evt);
            }
        });
        ExpLD.add(jComboBox_RLCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 140, -1));

        jLabel_RL_CV.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_RL_CV.setText("1");
        ExpLD.add(jLabel_RL_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 30, 20));

        jComboBox_ELCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ELCVActionPerformed(evt);
            }
        });
        ExpLD.add(jComboBox_ELCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 140, -1));

        jLabel_EL_CV.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_EL_CV.setText("1");
        ExpLD.add(jLabel_EL_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 30, 20));

        jComboBox_MedioCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_MedioCVActionPerformed(evt);
            }
        });
        ExpLD.add(jComboBox_MedioCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 140, -1));

        jLabel_Medio_CV.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Medio_CV.setText("1");
        ExpLD.add(jLabel_Medio_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 30, 20));

        txt_DireccionCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_DireccionCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_DireccionCV.setBorder(null);
        txt_DireccionCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DireccionCVActionPerformed(evt);
            }
        });
        ExpLD.add(txt_DireccionCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 140, 20));

        txt_GeneroCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_GeneroCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_GeneroCV.setBorder(null);
        txt_GeneroCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GeneroCVActionPerformed(evt);
            }
        });
        ExpLD.add(txt_GeneroCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 140, 20));

        txt_EdadCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_EdadCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_EdadCV.setBorder(null);
        txt_EdadCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EdadCVActionPerformed(evt);
            }
        });
        ExpLD.add(txt_EdadCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 140, 20));

        jComboBox_NivelACV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_NivelACVActionPerformed(evt);
            }
        });
        ExpLD.add(jComboBox_NivelACV, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 140, -1));

        jLabel_NivelA_CV.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NivelA_CV.setText("1");
        ExpLD.add(jLabel_NivelA_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 30, 20));

        jComboBox_RPCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_RPCVActionPerformed(evt);
            }
        });
        ExpLD.add(jComboBox_RPCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 140, -1));

        jLabel_RP_CV.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_RP_CV.setText("1");
        ExpLD.add(jLabel_RP_CV, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 30, 20));

        txt_CorreoCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_CorreoCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_CorreoCV.setBorder(null);
        txt_CorreoCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CorreoCVActionPerformed(evt);
            }
        });
        ExpLD.add(txt_CorreoCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 140, 20));

        txt_TelefonoCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_TelefonoCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_TelefonoCV.setBorder(null);
        txt_TelefonoCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoCVActionPerformed(evt);
            }
        });
        ExpLD.add(txt_TelefonoCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 140, 20));

        txt_ApellidoCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_ApellidoCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_ApellidoCV.setBorder(null);
        txt_ApellidoCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApellidoCVActionPerformed(evt);
            }
        });
        ExpLD.add(txt_ApellidoCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 140, 20));

        txt_NombreCV.setBackground(new java.awt.Color(231, 231, 231));
        txt_NombreCV.setForeground(new java.awt.Color(153, 153, 153));
        txt_NombreCV.setBorder(null);
        txt_NombreCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreCVActionPerformed(evt);
            }
        });
        ExpLD.add(txt_NombreCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 140, 20));

        txt_DPICV.setBackground(new java.awt.Color(231, 231, 231));
        txt_DPICV.setForeground(new java.awt.Color(153, 153, 153));
        txt_DPICV.setBorder(null);
        txt_DPICV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DPICVActionPerformed(evt);
            }
        });
        ExpLD.add(txt_DPICV, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 140, 20));

        tbl_CV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_CV.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_CV.setSelectionBackground(new java.awt.Color(0, 204, 255));
        tbl_CV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CVMouseClicked(evt);
            }
        });
        jScrollPane30.setViewportView(tbl_CV);

        ExpLD.add(jScrollPane30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 730, 190));

        jComboBox_TablasB_CV1.setBackground(new java.awt.Color(40, 41, 46));
        jComboBox_TablasB_CV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_TablasB_CV1ActionPerformed(evt);
            }
        });
        ExpLD.add(jComboBox_TablasB_CV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 170, -1));

        jLabel_Buscar_Tablas1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Buscar_Tablas1.setText("Buscar");
        jLabel_Buscar_Tablas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Buscar_Tablas1MouseClicked(evt);
            }
        });
        ExpLD.add(jLabel_Buscar_Tablas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExpLD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExpLD, javax.swing.GroupLayout.PREFERRED_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void MovimientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_MovimientoMouseDragged

    private void MovimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_MovimientoMousePressed

    private void txt_Buscar_CVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_CVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_CVActionPerformed

    private void txt_Buscar_CVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Buscar_CVKeyReleased
        // TODO add your handling code here:
        Curriculum CV = new Finanzas_Clases.Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.Buscar_SolicitudCV(txt_Buscar_CV.getText());
    }//GEN-LAST:event_txt_Buscar_CVKeyReleased

    private void jComboBox_RLCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_RLCVActionPerformed
        // TODO add your handling code here:
        Curriculum CV = new Finanzas_Clases.Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.EncontrarID_CV("id_referenciaL", "referenciasl", "nombre_personaL", jComboBox_RLCV, jLabel_RL_CV);
    }//GEN-LAST:event_jComboBox_RLCVActionPerformed

    private void jComboBox_ELCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ELCVActionPerformed
        // TODO add your handling code here:
        Curriculum CV = new Finanzas_Clases.Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.EncontrarID_CV("id_experiencia", "experiencia_laboral", "id_tipoexp", jComboBox_ELCV, jLabel_EL_CV);
    }//GEN-LAST:event_jComboBox_ELCVActionPerformed

    private void jComboBox_MedioCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_MedioCVActionPerformed
        // TODO add your handling code here:
        Curriculum CV = new Finanzas_Clases.Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.EncontrarID_CV("id_medio", "medio", "nombre_medio", jComboBox_MedioCV, jLabel_Medio_CV);
    }//GEN-LAST:event_jComboBox_MedioCVActionPerformed

    private void txt_DireccionCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DireccionCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DireccionCVActionPerformed

    private void txt_GeneroCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GeneroCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GeneroCVActionPerformed

    private void txt_EdadCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EdadCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EdadCVActionPerformed

    private void jComboBox_NivelACVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_NivelACVActionPerformed
        // TODO add your handling code here:
        Curriculum CV = new Finanzas_Clases.Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.EncontrarID_CV("id_nivel_academico", "nivel_academico", "nombre_nivel", jComboBox_NivelACV, jLabel_NivelA_CV);
    }//GEN-LAST:event_jComboBox_NivelACVActionPerformed

    private void jComboBox_RPCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_RPCVActionPerformed
        // TODO add your handling code here:
        Curriculum CV = new Finanzas_Clases.Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.EncontrarID_CV("id_referenciaP", "referenciasp", "nombre_personaP", jComboBox_RPCV, jLabel_RP_CV);
    }//GEN-LAST:event_jComboBox_RPCVActionPerformed

    private void txt_CorreoCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CorreoCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CorreoCVActionPerformed

    private void txt_TelefonoCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoCVActionPerformed

    private void txt_ApellidoCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApellidoCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApellidoCVActionPerformed

    private void txt_NombreCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreCVActionPerformed

    private void txt_DPICVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DPICVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DPICVActionPerformed

    private void tbl_CVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CVMouseClicked
        // TODO add your handling code here:

        int Seleccion = tbl_CV.rowAtPoint(evt.getPoint());

        txt_DPICV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 0)));
        txt_NombreCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 1)));
        txt_ApellidoCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 2)));
        txt_TelefonoCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 3)));
        txt_CorreoCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 4)));
        txt_DireccionCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 5)));
        txt_GeneroCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 6)));
        txt_EdadCV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 7)));
        jLabel_NivelA_CV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 8)));
        jLabel_RP_CV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 9)));
        jLabel_RL_CV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 10)));
        jLabel_EL_CV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 11)));
        jLabel_Medio_CV.setText(String.valueOf(tbl_CV.getValueAt(Seleccion, 12)));

        Curriculum CV = new Finanzas_Clases.Curriculum(txt_DPICV, txt_NombreCV, txt_ApellidoCV, txt_TelefonoCV, txt_CorreoCV, txt_DireccionCV, txt_GeneroCV, txt_EdadCV, jLabel_NivelA_CV, jLabel_RP_CV, jLabel_RL_CV, jLabel_EL_CV, jLabel_Medio_CV, txt_Buscar_CV, tbl_CV);
        CV.BuscarFila_CV("nombre_nivel", "nivel_academico", "id_nivel_academico", jComboBox_NivelACV, jLabel_NivelA_CV);
        CV.BuscarFila_CV("nombre_personaP", "referenciasP", "id_referenciaP", jComboBox_RPCV, jLabel_RP_CV);
        CV.BuscarFila_CV("nombre_personaL", "referenciasL", "id_referenciaL", jComboBox_RLCV, jLabel_RL_CV);
        CV.BuscarFila_CV("id_tipoexp", "experiencia_laboral", "id_tipoexp", jComboBox_ELCV, jLabel_EL_CV);
        CV.BuscarFila_CV("nombre_medio", "medio", "id_medio", jComboBox_MedioCV, jLabel_Medio_CV);
        //id_experiencia
    }//GEN-LAST:event_tbl_CVMouseClicked

    private void jComboBox_TablasB_CV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_TablasB_CV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_TablasB_CV1ActionPerformed

    private void jLabel_Buscar_Tablas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Buscar_Tablas1MouseClicked
        // TODO add your handling code here:

        Item_NA = jComboBox_TablasB_CV1.getSelectedItem().toString();

        if (Item_NA == S_NA) {
            Nivel_Academico_Ve NA = new Nivel_Academico_Ve();
            NA.setVisible(true);
        }

        Item_EL = jComboBox_TablasB_CV1.getSelectedItem().toString();

        if (Item_EL == S_EL) {
            Experiencia_Laboral_Ve EL = new Experiencia_Laboral_Ve();
            EL.setVisible(true);
        }

        Item_RP = jComboBox_TablasB_CV1.getSelectedItem().toString();
        if (Item_RP == S_RP)
        {
            Referencias_Personales_V RP = new Referencias_Personales_V();
            RP.setVisible(true);
        }

        Item_RL = jComboBox_TablasB_CV1.getSelectedItem().toString();
        if (Item_RL == S_RL)
        {
            Referencias_Laborales_V RL = new Referencias_Laborales_V();
            RL.setVisible(true);

        }

        Item_Med = jComboBox_TablasB_CV1.getSelectedItem().toString();
        if (Item_Med == S_Med)
        {
            Medio_Ve Med = new Medio_Ve();
            Med.setVisible(true);

        }
    }//GEN-LAST:event_jLabel_Buscar_Tablas1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Curriculum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Curriculum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Curriculum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Curriculum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Curriculum_V().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExpLD;
    private javax.swing.JPanel Movimiento;
    private javax.swing.JLabel icono_Buscar;
    private javax.swing.JComboBox<String> jComboBox_ELCV;
    private javax.swing.JComboBox<String> jComboBox_MedioCV;
    private javax.swing.JComboBox<String> jComboBox_NivelACV;
    private javax.swing.JComboBox<String> jComboBox_RLCV;
    private javax.swing.JComboBox<String> jComboBox_RPCV;
    private javax.swing.JComboBox<String> jComboBox_TablasB_CV1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Buscar;
    private javax.swing.JLabel jLabel_Buscar_Tablas1;
    private javax.swing.JLabel jLabel_EL_CV;
    private javax.swing.JLabel jLabel_Medio_CV;
    private javax.swing.JLabel jLabel_NivelA_CV;
    private javax.swing.JLabel jLabel_RL_CV;
    private javax.swing.JLabel jLabel_RP_CV;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JTable tbl_CV;
    private javax.swing.JTextField txt_ApellidoCV;
    private javax.swing.JTextField txt_Buscar_CV;
    private javax.swing.JTextField txt_CorreoCV;
    private javax.swing.JTextField txt_DPICV;
    private javax.swing.JTextField txt_DireccionCV;
    private javax.swing.JTextField txt_EdadCV;
    private javax.swing.JTextField txt_GeneroCV;
    private javax.swing.JTextField txt_NombreCV;
    private javax.swing.JTextField txt_TelefonoCV;
    // End of variables declaration//GEN-END:variables
}
