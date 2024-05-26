
package Arayüz;

import GirisEkrani.GirisEkrani;
import IconClass.Icons;
import Kullanıcılar.Müşteriler;
import MüşteriBilgi.MüşteriBilgi;
import SQLIslemleri.SQLBağlantıları;
import SQLIslemleri.TimeConverter;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Halit Eren Deniz
 */
public class Arayüz extends javax.swing.JFrame {
    private Icons ikonlar = new Icons();
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    final String[] date = {""};
    private Timer timer;
    private SQLBağlantıları control = new SQLBağlantıları();
    private ArrayList<Müşteriler> liste;
    private TimeConverter converter = new TimeConverter();
    private Integer posX = getY();
    private Integer posY = getX();
    
    public Arayüz() {
        initComponents();
        initComponents_2();
    }

    public void changeButtons(){
        table1Button.setBackground(new Color(10, 187, 4));
        table2Button.setBackground(new Color(10, 187, 4));
        table3Button.setBackground(new Color(10, 187, 4));
        table4Button.setBackground(new Color(10, 187, 4));
        table5Button.setBackground(new Color(10, 187, 4));
        table6Button.setBackground(new Color(10, 187, 4));
        table7Button.setBackground(new Color(10, 187, 4));
        table8Button.setBackground(new Color(10, 187, 4));
        table9Button.setBackground(new Color(10, 187, 4));
        table10Button.setBackground(new Color(10, 187, 4));
        table11Button.setBackground(new Color(10, 187, 4));
        table12Button.setBackground(new Color(10, 187, 4));

        for(Müşteriler rzv : liste) {
            switch (rzv.getMasano()) {
                case "1":
                    if ((date[0].contains("Tüm") && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate()) ||
                            (rzv.getTarih().equals(converter.CurrentDate()) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))))||
                            ((rzv.getTarih()).equals(date[0]) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))) {
                        table1Button.setBackground(new Color(157, 0, 0));
                    }
                    break;
                case "2":
                    if ((date[0].contains("Tüm") && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate()) || (rzv.getTarih().equals(converter.CurrentDate()) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))))||
                            ((rzv.getTarih()).equals(date[0]) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))) {
                        table2Button.setBackground(new Color(157, 0, 0));
                    }
                    break;
                case "3":
                    if ((date[0].contains("Tüm") && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate()) || (rzv.getTarih().equals(converter.CurrentDate()) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))))||
                            ((rzv.getTarih()).equals(date[0]) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))) {
                        table3Button.setBackground(new Color(157, 0, 0));
                    }
                    break;
                case "4":
                    if ((date[0].contains("Tüm") && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate()) || (rzv.getTarih().equals(converter.CurrentDate()) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))))||
                            ((rzv.getTarih()).equals(date[0]) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))) {
                        table4Button.setBackground(new Color(157, 0, 0));
                    }
                    break;
                case "5":
                    if ((date[0].contains("Tüm") && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate()) || (rzv.getTarih().equals(converter.CurrentDate()) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))))||
                            ((rzv.getTarih()).equals(date[0]) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))) {
                        table5Button.setBackground(new Color(157, 0, 0));
                    }
                    break;
                case "6":
                    if ((date[0].contains("Tüm") && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate()) || (rzv.getTarih().equals(converter.CurrentDate()) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))))||
                            ((rzv.getTarih()).equals(date[0]) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))){
                        table6Button.setBackground(new Color(157, 0, 0));
                    }
                    break;
                case "7":
                    if ((date[0].contains("Tüm") && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate()) || (rzv.getTarih().equals(converter.CurrentDate()) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))))||
                            ((rzv.getTarih()).equals(date[0]) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))) {
                        table7Button.setBackground(new Color(157, 0, 0));
                    }
                    break;
                case "8":
                    if ((date[0].contains("Tüm") && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate()) || (rzv.getTarih().equals(converter.CurrentDate()) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))))||
                            ((rzv.getTarih()).equals(date[0]) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))) {
                        table8Button.setBackground(new Color(157, 0, 0));
                    }
                    break;
                case "9":
                    if ((date[0].contains("Tüm") && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate()) || (rzv.getTarih().equals(converter.CurrentDate()) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))))||
                            ((rzv.getTarih()).equals(date[0]) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))) {
                        table9Button.setBackground(new Color(157, 0, 0));
                    }
                    break;
                case "10":
                    if ((date[0].contains("Tüm") && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate()) || (rzv.getTarih().equals(converter.CurrentDate()) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))))||
                            ((rzv.getTarih()).equals(date[0]) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))) {
                        table10Button.setBackground(new Color(157, 0, 0));
                    }
                    break;
                case "11":
                    if ((date[0].contains("Tüm") && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate()) || (rzv.getTarih().equals(converter.CurrentDate()) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))))||
                            ((rzv.getTarih()).equals(date[0]) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))) {
                        table11Button.setBackground(new Color(157, 0, 0));
                    }
                    break;
                case "12":
                    if ((date[0].contains("Tüm") && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate()) || (rzv.getTarih().equals(converter.CurrentDate()) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))))||
                            ((rzv.getTarih()).equals(date[0]) && converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))){
                        table12Button.setBackground(new Color(157, 0, 0));
                    }
                    break;
            }
        }
    }
    
    
    public void initComponents_2(){
        this.setLocation(dim.width/2 -this.getSize().width/2,dim.height/2-this.getSize().height/2);
        liste = control.getRezervations();
  
       date[0] = converter.CurrentDate();
       
       tarihsecim.addItem("---Tüm tarihler---");
        for(int i = 0;i<30;i++){
            tarihsecim.addItem(date[0]);
            date[0] = converter.IncrementDate(date[0]);
        }
       date[0] = "---Seciniz---";
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        Move = new javax.swing.JLabel();
        minus = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        table2Button = new javax.swing.JButton();
        table12Button = new javax.swing.JButton();
        table1Button = new javax.swing.JButton();
        table9Button = new javax.swing.JButton();
        table10Button = new javax.swing.JButton();
        table4Button = new javax.swing.JButton();
        table6Button = new javax.swing.JButton();
        table5Button = new javax.swing.JButton();
        table3Button = new javax.swing.JButton();
        table11Button = new javax.swing.JButton();
        table8Button = new javax.swing.JButton();
        table7Button = new javax.swing.JButton();
        tarihsecim = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        EskiRezervasyonlar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened();
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paintsol.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paintsag.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-button2.png"))); // NOI18N
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked();
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited();
            }
        });

        Move.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Move.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/all-directions.png"))); // NOI18N
        Move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveMouseDragged(evt);
            }
        });
        Move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MoveMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MoveMouseExited();
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoveMousePressed(evt);
            }
        });

        minus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minus.png"))); // NOI18N
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusMouseClicked();
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusMouseExited();
            }
        });

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked();
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited();
            }
        });

        table2Button.setBackground(new java.awt.Color(10, 187, 4));
        table2Button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meeting-room (1).png"))); // NOI18N
        table2Button.setText("Masa 2");
        table2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table2ButtonActionPerformed();
            }
        });

        table12Button.setBackground(new java.awt.Color(10, 187, 4));
        table12Button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table12Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meeting-room (1).png"))); // NOI18N
        table12Button.setText("Masa 12");
        table12Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table12ButtonActionPerformed();
            }
        });

        table1Button.setBackground(new java.awt.Color(10, 187, 4));
        table1Button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meeting-room (1).png"))); // NOI18N
        table1Button.setText("Masa 1");
        table1Button.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        table1Button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        table1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table1ButtonActionPerformed();
            }
        });

        table9Button.setBackground(new java.awt.Color(10, 187, 4));
        table9Button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table9Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meeting-room (1).png"))); // NOI18N
        table9Button.setText("Masa 9");
        table9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table9ButtonActionPerformed();
            }
        });

        table10Button.setBackground(new java.awt.Color(10, 187, 4));
        table10Button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table10Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meeting-room (1).png"))); // NOI18N
        table10Button.setText("Masa 10");
        table10Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table10ButtonActionPerformed();
            }
        });

        table4Button.setBackground(new java.awt.Color(10, 187, 4));
        table4Button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table4Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meeting-room (1).png"))); // NOI18N
        table4Button.setText("Masa 4");
        table4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table4ButtonActionPerformed();
            }
        });

        table6Button.setBackground(new java.awt.Color(10, 187, 4));
        table6Button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table6Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meeting-room (1).png"))); // NOI18N
        table6Button.setText("Masa 6");
        table6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table6ButtonActionPerformed();
            }
        });

        table5Button.setBackground(new java.awt.Color(10, 187, 4));
        table5Button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table5Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meeting-room (1).png"))); // NOI18N
        table5Button.setText("Masa 5");
        table5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table5ButtonActionPerformed();
            }
        });

        table3Button.setBackground(new java.awt.Color(10, 187, 4));
        table3Button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meeting-room (1).png"))); // NOI18N
        table3Button.setText("Masa 3");
        table3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table3ButtonActionPerformed();
            }
        });

        table11Button.setBackground(new java.awt.Color(10, 187, 4));
        table11Button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table11Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meeting-room (1).png"))); // NOI18N
        table11Button.setText("Masa 11");
        table11Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table11ButtonActionPerformed();
            }
        });

        table8Button.setBackground(new java.awt.Color(10, 187, 4));
        table8Button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table8Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meeting-room (1).png"))); // NOI18N
        table8Button.setText("Masa 8");
        table8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table8ButtonActionPerformed();
            }
        });

        table7Button.setBackground(new java.awt.Color(10, 187, 4));
        table7Button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        table7Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meeting-room (1).png"))); // NOI18N
        table7Button.setText("Masa 7");
        table7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table7ButtonActionPerformed();
            }
        });

        tarihsecim.setBackground(new java.awt.Color(204, 255, 255));
        tarihsecim.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tarihsecim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seciniz---" }));
        tarihsecim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarihsecimActionPerformed();
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setText("Tüm Rezervasyonlar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed();
            }
        });

        EskiRezervasyonlar.setBackground(new java.awt.Color(204, 0, 0));
        EskiRezervasyonlar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        EskiRezervasyonlar.setText("Eski Rezervasyonlar");
        EskiRezervasyonlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EskiRezervasyonlarActionPerformed();
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(table6Button)
                            .addComponent(table5Button)
                            .addComponent(table8Button)
                            .addComponent(table7Button))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(table12Button)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(table9Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(table10Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(table11Button)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(EskiRezervasyonlar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(table2Button)
                                        .addComponent(table4Button)
                                        .addComponent(table3Button)
                                        .addComponent(table1Button))
                                    .addGap(117, 117, 117))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)))
                            .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(241, 241, 241)
                            .addComponent(tarihsecim, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tarihsecim)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EskiRezervasyonlar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(table5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(table6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table10Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(table11Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(table8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table12Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseDragged
       this.setLocation(evt.getXOnScreen() - posX - 440 , evt.getYOnScreen()-posY);
       Move.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MoveMouseDragged

    private void MoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMousePressed
        posX= evt.getX();
        posY= evt.getY();
        Move.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MoveMousePressed

    private void closeMouseClicked() {//GEN-FIRST:event_closeMouseClicked
         dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered() {//GEN-FIRST:event_closeMouseEntered
        close.setIcon(ikonlar.getCancel2());
        close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited() {//GEN-FIRST:event_closeMouseExited
        close.setIcon(ikonlar.getCancel());
    }//GEN-LAST:event_closeMouseExited

    private void minusMouseClicked() {//GEN-FIRST:event_minusMouseClicked
        minus.setIcon(ikonlar.getMinus2());
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minusMouseClicked

    private void minusMouseEntered() {//GEN-FIRST:event_minusMouseEntered
       minus.setIcon(ikonlar.getMinus2());
       minus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_minusMouseEntered

    private void minusMouseExited() {//GEN-FIRST:event_minusMouseExited
       minus.setIcon(ikonlar.getMinus());
    }//GEN-LAST:event_minusMouseExited

    private void cancelMouseClicked() {//GEN-FIRST:event_cancelMouseClicked
                if(timer.isRunning())timer.stop();
                GirisEkrani giris = new GirisEkrani();
                giris.setVisible(true);
                dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseEntered() {//GEN-FIRST:event_cancelMouseEntered
         cancel.setIcon(ikonlar.getLeftarrow2());
         cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited() {//GEN-FIRST:event_cancelMouseExited
        cancel.setIcon(ikonlar.getLeftarrow());
    }//GEN-LAST:event_cancelMouseExited

    private void MoveMouseEntered() {//GEN-FIRST:event_MoveMouseEntered
        Move.setIcon(ikonlar.getAlldirections2());
        Move.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MoveMouseEntered

    private void MoveMouseExited() {//GEN-FIRST:event_MoveMouseExited
       Move.setIcon(ikonlar.getAlldirections());
    }//GEN-LAST:event_MoveMouseExited

    private void tarihsecimActionPerformed() {//GEN-FIRST:event_tarihsecimActionPerformed
        date[0] = (String)tarihsecim.getSelectedItem();
        changeButtons();
    }//GEN-LAST:event_tarihsecimActionPerformed

    private void table1ButtonActionPerformed() {//GEN-FIRST:event_table1ButtonActionPerformed
       if(date[0].equals("---Seciniz---")){
               JOptionPane.showMessageDialog(Arayüz.this,"Bir Tarih Secmelisiniz.",
                       "Hata",JOptionPane.ERROR_MESSAGE);
               return;
           }
       if(table1Button.getBackground().equals(new Color(10, 187, 4))){
           JOptionPane.showMessageDialog(Arayüz.this,"Bu masa boş",
                        "Boş",JOptionPane.WARNING_MESSAGE);
           return;
       }
           timer.stop();
           dispose();
           new MüşteriBilgi(liste,date[0],"1");
       

    }//GEN-LAST:event_table1ButtonActionPerformed

    private void table2ButtonActionPerformed() {//GEN-FIRST:event_table2ButtonActionPerformed
         if(date[0].equals("---Seciniz---")){
                JOptionPane.showMessageDialog(Arayüz.this,"Bir Tarih Secmelisiniz.",
                        "Hata",JOptionPane.ERROR_MESSAGE);
                return;
            }
         if(table2Button.getBackground().equals(new Color(10, 187, 4))){
           JOptionPane.showMessageDialog(Arayüz.this,"Bu masa boş",
                        "Boş",JOptionPane.WARNING_MESSAGE);
           return;
       }
        timer.stop();
            dispose();
            new MüşteriBilgi(liste,date[0],"2");

    }//GEN-LAST:event_table2ButtonActionPerformed

    private void table3ButtonActionPerformed() {//GEN-FIRST:event_table3ButtonActionPerformed
       if(date[0].equals("---Seciniz---")){
                JOptionPane.showMessageDialog(Arayüz.this,"Bir Tarih Secmelisiniz.",
                        "Hata",JOptionPane.ERROR_MESSAGE);
                return;
            }
       if(table3Button.getBackground().equals(new Color(10, 187, 4))){
           JOptionPane.showMessageDialog(Arayüz.this,"Bu masa boş",
                        "Boş",JOptionPane.WARNING_MESSAGE);
           return;
       }
        timer.stop();
            dispose();
            new MüşteriBilgi(liste,date[0],"3");

    }//GEN-LAST:event_table3ButtonActionPerformed

    private void table4ButtonActionPerformed() {//GEN-FIRST:event_table4ButtonActionPerformed
         if(date[0].equals("---Seciniz---")){
                JOptionPane.showMessageDialog(Arayüz.this,"Bir Tarih Secmelisiniz.",
                        "Hata",JOptionPane.ERROR_MESSAGE);
                return;
            }
         if(table4Button.getBackground().equals(new Color(10, 187, 4))){
           JOptionPane.showMessageDialog(Arayüz.this,"Bu masa boş",
                        "Boş",JOptionPane.WARNING_MESSAGE);
           return;
       }
        timer.stop();
           dispose();
            new MüşteriBilgi(liste,date[0],"4");

    }//GEN-LAST:event_table4ButtonActionPerformed

    private void table5ButtonActionPerformed() {//GEN-FIRST:event_table5ButtonActionPerformed
         if(date[0].equals("---Seciniz---")){
                JOptionPane.showMessageDialog(Arayüz.this,"Bir Tarih Secmelisiniz.",
                        "Hata",JOptionPane.ERROR_MESSAGE);
                return;
            }
         if(table5Button.getBackground().equals(new Color(10, 187, 4))){
           JOptionPane.showMessageDialog(Arayüz.this,"Bu masa boş",
                        "Boş",JOptionPane.WARNING_MESSAGE);
           return;
       }
        timer.stop();
            dispose();
            new MüşteriBilgi(liste,date[0],"5");

    }//GEN-LAST:event_table5ButtonActionPerformed

    private void table6ButtonActionPerformed() {//GEN-FIRST:event_table6ButtonActionPerformed
        if(date[0].equals("---Seciniz---")){
                JOptionPane.showMessageDialog(Arayüz.this,"Bir Tarih Secmelisiniz.",
                        "Hata",JOptionPane.ERROR_MESSAGE);
                return;
            }
        if(table6Button.getBackground().equals(new Color(10, 187, 4))){
           JOptionPane.showMessageDialog(Arayüz.this,"Bu masa boş",
                        "Boş",JOptionPane.WARNING_MESSAGE);
           return;
       }
        timer.stop();
            dispose();
            new MüşteriBilgi(liste,date[0],"6");

    }//GEN-LAST:event_table6ButtonActionPerformed

    private void table7ButtonActionPerformed() {//GEN-FIRST:event_table7ButtonActionPerformed
         if(date[0].equals("---Seciniz---")){
                JOptionPane.showMessageDialog(Arayüz.this,"Bir Tarih Secmelisiniz.",
                        "Hata",JOptionPane.ERROR_MESSAGE);
                return;
            }
         if(table7Button.getBackground().equals(new Color(10, 187, 4))){
           JOptionPane.showMessageDialog(Arayüz.this,"Bu masa boş",
                        "Boş",JOptionPane.WARNING_MESSAGE);
           return;
       }
        timer.stop();
            dispose();
            new MüşteriBilgi(liste,date[0],"7");

    }//GEN-LAST:event_table7ButtonActionPerformed

    private void table8ButtonActionPerformed() {//GEN-FIRST:event_table8ButtonActionPerformed
       if(date[0].equals("---Seciniz---")){
                JOptionPane.showMessageDialog(Arayüz.this,"Bir Tarih Secmelisiniz.",
                        "Hata",JOptionPane.ERROR_MESSAGE);
                return;
            }
       if(table8Button.getBackground().equals(new Color(10, 187, 4))){
           JOptionPane.showMessageDialog(Arayüz.this,"Bu masa boş",
                        "Boş",JOptionPane.WARNING_MESSAGE);
           return;
       }
        timer.stop();
          dispose();
            new MüşteriBilgi(liste,date[0],"8");

    }//GEN-LAST:event_table8ButtonActionPerformed

    private void table9ButtonActionPerformed() {//GEN-FIRST:event_table9ButtonActionPerformed
         if(date[0].equals("---Seciniz---")){
                JOptionPane.showMessageDialog(Arayüz.this,"Bir Tarih Secmelisiniz.",
                        "Hata",JOptionPane.ERROR_MESSAGE);
                return;
            }
         if(table9Button.getBackground().equals(new Color(10, 187, 4))){
           JOptionPane.showMessageDialog(Arayüz.this,"Bu masa boş",
                        "Boş",JOptionPane.WARNING_MESSAGE);
           return;
       }
        timer.stop();
            dispose();
            new MüşteriBilgi(liste,date[0],"9");

    }//GEN-LAST:event_table9ButtonActionPerformed

    private void table10ButtonActionPerformed() {//GEN-FIRST:event_table10ButtonActionPerformed
         if(date[0].equals("---Seciniz---")){
                JOptionPane.showMessageDialog(Arayüz.this,"Bir Tarih Secmelisiniz.",
                        "Hata",JOptionPane.ERROR_MESSAGE);
                return;
            }
         if(table10Button.getBackground().equals(new Color(10, 187, 4))){
           JOptionPane.showMessageDialog(Arayüz.this,"Bu masa boş",
                        "Boş",JOptionPane.WARNING_MESSAGE);
           return;
       }
        timer.stop();
           dispose();
            new MüşteriBilgi(liste,date[0],"10");

    }//GEN-LAST:event_table10ButtonActionPerformed

    private void table12ButtonActionPerformed() {//GEN-FIRST:event_table12ButtonActionPerformed
         if(date[0].equals("---Seciniz---")){
                JOptionPane.showMessageDialog(Arayüz.this,"Bir Tarih Secmelisiniz.",
                        "Hata",JOptionPane.ERROR_MESSAGE);
                return;
            }
         if(table12Button.getBackground().equals(new Color(10, 187, 4))){
           JOptionPane.showMessageDialog(Arayüz.this,"Bu masa boş",
                        "Boş",JOptionPane.WARNING_MESSAGE);
           return;
       }
        timer.stop();
           dispose();
            new MüşteriBilgi(liste,date[0],"11");

    }//GEN-LAST:event_table12ButtonActionPerformed

    private void table11ButtonActionPerformed() {//GEN-FIRST:event_table11ButtonActionPerformed
         if(date[0].equals("---Seciniz---")){
                JOptionPane.showMessageDialog(Arayüz.this,"Bir Tarih Secmelisiniz.",
                        "Hata",JOptionPane.ERROR_MESSAGE);
                return;
            }
         if(table11Button.getBackground().equals(new Color(10, 187, 4))){
           JOptionPane.showMessageDialog(Arayüz.this,"Bu masa boş",
                        "Boş",JOptionPane.WARNING_MESSAGE);
           return;
       }
        timer.stop();
            dispose();
            new MüşteriBilgi(liste,date[0],"12");

    }//GEN-LAST:event_table11ButtonActionPerformed

    private void jButton1ActionPerformed() {//GEN-FIRST:event_jButton1ActionPerformed
        if(date[0].equals("---Seciniz---")){
                JOptionPane.showMessageDialog(Arayüz.this,"Bir Tarih Secmelisiniz.",
                        "Hata",JOptionPane.ERROR_MESSAGE);
                return;
            }
        else {
            timer.stop();
            dispose();
            new MüşteriBilgi(liste, date[0], "");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void EskiRezervasyonlarActionPerformed() {//GEN-FIRST:event_jButton14ActionPerformed
        timer.stop();
        dispose();
        new MüşteriBilgi(liste,"Old","");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void formWindowOpened() {//GEN-FIRST:event_formWindowOpened
        timer = new Timer(15000, e -> {
            if(!date[0].contains("Seciniz")) {
                if (control.rowSize() != liste.size()) {
                    liste = control.getRezervations();
                    changeButtons();
                }
            }
        });
        timer.start();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EskiRezervasyonlar;
    private javax.swing.JLabel Move;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel close;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel minus;
    private javax.swing.JButton table10Button;
    private javax.swing.JButton table11Button;
    private javax.swing.JButton table12Button;
    private javax.swing.JButton table1Button;
    private javax.swing.JButton table2Button;
    private javax.swing.JButton table3Button;
    private javax.swing.JButton table4Button;
    private javax.swing.JButton table5Button;
    private javax.swing.JButton table6Button;
    private javax.swing.JButton table7Button;
    private javax.swing.JButton table8Button;
    private javax.swing.JButton table9Button;
    private javax.swing.JComboBox<String> tarihsecim;
    // End of variables declaration//GEN-END:variables
}
