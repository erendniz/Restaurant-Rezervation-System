
package SQLIslemleri;

import IconClass.Icons;
import Kullanıcılar.Müşteriler;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Halit Eren Deniz
 */
public class RezervasyonAlma extends javax.swing.JFrame {
        
        private Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
        private Icons ikonlar = new Icons();
        private TimeConverter converter = new TimeConverter();
        
        private SwingWorker<Boolean,Integer> worker;
        private Integer posX = getY();
        private Integer posY = getX();
        final String[] numberofpeople = {""};
        final String[] tablenumber = {""};
        final String[] giriszamani = {"11:00"};
        final String[] cikiszamani = {"11:30"};
        final String[] tarih = {converter.CurrentDate()};
        private int month = 30;
        private SQLBağlantıları control = new SQLBağlantıları();
        private ArrayList<Müşteriler> liste = control.getRezervations();
        private ArrayList<String> hours = new ArrayList<>();
        private ArrayList<String> firsthours = new ArrayList<>();

        private boolean setText = false;
        
    
    public void mesajYazdır(String mesaj){
        chat.setText("");
        try {
            Thread.sleep(25);
        } catch (InterruptedException ex) {
            Logger.getLogger(RezervasyonAlma.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(worker != null){
            worker.cancel(true);
            chat.setText("");
        }
        chat.setText("");
          worker= new SwingWorker<>() {
              @Override
              protected Boolean doInBackground() throws Exception {
                  for (int i = 0; i < mesaj.length(); i++) {
                      chat.append(String.valueOf(mesaj.charAt(i)));
                      Thread.sleep(30);
                  }
                  return true;
              }

          };
      worker.execute();
    }

    public RezervasyonAlma() {
        initComponents();
        initComponents_2();
        setText = true;
    }
    public void initComponents_2(){
        mesajYazdır("Rezervasyon Yapabilmek İçin Lütfen Bütün Bilgileri Eksiksiz Doldurunuz.");
        peoplebox.addItem("---Seciniz---");
        datebox.addItem("---Seciniz---");
        checkinbox.addItem("---Seciniz---");
        checkoutbox.addItem("---Seciniz---");
        Tablebox.addItem("---Seciniz---");
        TimeConverter date2= new TimeConverter();
         for(int i =1;i<=12;i++){
            String temp = Integer.toString(i);
            peoplebox.addItem(temp);
        }
        tarih[0]=date2.CurrentDate();
        for(int i=0;i<month;i++){
            if (tarih[0].equals(converter.CurrentDate()) && converter.convertTime(converter.CurrentTime()) > 1290) {
                tarih[0] = converter.IncrementDate(tarih[0]);
                month++;
                continue;
            }
            datebox.addItem(tarih[0]);
            tarih[0] = converter.IncrementDate(tarih[0]);
        }
        tarih[0]="";
      this.setLocation(dim.width/2 -this.getSize().width/2,dim.height/2-this.getSize().height/2);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        peoplebox = new javax.swing.JComboBox<>();
        chatbot = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chat = new javax.swing.JTextArea();
        datebox = new javax.swing.JComboBox<>();
        checkoutbox = new javax.swing.JComboBox<>();
        checkinbox = new javax.swing.JComboBox<>();
        Tablebox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RandevuAl = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        MusteriNot = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Move = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        minus = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        peoplebox.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        peoplebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        peoplebox.setFocusable(false);
        peoplebox.setLightWeightPopupEnabled(false);
        peoplebox.setPreferredSize(new java.awt.Dimension(72, 70));
        peoplebox.setRequestFocusEnabled(false);
        peoplebox.setVerifyInputWhenFocusTarget(false);
        peoplebox.addActionListener(evt -> peopleboxActionPerformed(evt));

        chatbot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chatbot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chat (7).png"))); // NOI18N

        jScrollPane1.setEnabled(false);

        chat.setEditable(false);
        chat.setColumns(20);
        chat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chat.setForeground(new java.awt.Color(51, 102, 255));
        chat.setLineWrap(true);
        chat.setRows(5);
        chat.setWrapStyleWord(true);
        chat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(chat);

        datebox.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        datebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        datebox.setPreferredSize(new java.awt.Dimension(72, 70));
        datebox.addActionListener(evt -> dateboxActionPerformed(evt));

        checkoutbox.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        checkoutbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        checkoutbox.setPreferredSize(new java.awt.Dimension(72, 70));
        checkoutbox.addActionListener(evt -> checkoutboxActionPerformed(evt));

        checkinbox.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        checkinbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        checkinbox.setPreferredSize(new java.awt.Dimension(72, 70));
        checkinbox.addActionListener(evt -> checkinboxActionPerformed(evt));

        Tablebox.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Tablebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tablebox.setPreferredSize(new java.awt.Dimension(72, 70));
        Tablebox.addActionListener(evt -> TableboxActionPerformed(evt));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Kişi Sayısı");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Soyisim");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("İsim");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Tarih");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Giriş Saati");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Çıkış Saati");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Masa No");

        RandevuAl.setBackground(new java.awt.Color(0, 204, 102));
        RandevuAl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        RandevuAl.setText("Randevu Al");
        RandevuAl.addActionListener(evt -> RandevuAlActionPerformed());

        MusteriNot.setColumns(20);
        MusteriNot.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        MusteriNot.setRows(5);
        MusteriNot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(MusteriNot);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Not (Opsiyonel)");

        nameField.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        nameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });

        surnameField.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        surnameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        surnameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surnameFieldKeyTyped(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

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

        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked();
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseMouseExited();
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(chatbot, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                        .addComponent(surnameField)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(peoplebox, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datebox, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checkoutbox, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(checkinbox, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Tablebox, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(RandevuAl, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, 0)
                                .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addGap(0, 0, 0)
                                .addComponent(peoplebox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(0, 0, 0)
                                .addComponent(datebox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel7)
                                .addGap(0, 0, 0)
                                .addComponent(Tablebox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(174, 174, 174))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chatbot, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, 0)
                                .addComponent(checkinbox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel6)
                                .addGap(0, 0, 0)
                                .addComponent(checkoutbox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(minus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RandevuAl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addGap(52, 52, 52)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void RandevuAlActionPerformed() {//GEN-FIRST:event_RandevuAlActionPerformed
        String isim = nameField.getText();
        String soyisim = surnameField.getText();
        String musterinot = MusteriNot.getText();

        if(isim.isEmpty() || soyisim.isEmpty() || numberofpeople[0].isEmpty() || tablenumber[0].isEmpty() || giriszamani[0].isEmpty()
            || cikiszamani[0].isEmpty() || tarih[0].isEmpty() || numberofpeople[0].equals("---Seciniz---") || tablenumber[0].equals("---Seciniz---") ||
            giriszamani[0].equals("---Seciniz---") || cikiszamani[0].equals("---Seciniz---") || tarih[0].equals("---Seciniz---")){
            JOptionPane.showMessageDialog(RezervasyonAlma.this, "Lütfen boş alanları doldurunuz.",
                "Tekrar Deneyiniz.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String kod = isim.substring(0,1) + soyisim.substring(0,1) + Integer.toString(isim.length()) + Integer.toString(soyisim.length())+
        tablenumber[0] +tarih[0].substring(3,5) + giriszamani[0].substring(0,2) + tarih[0].substring(8) + cikiszamani[0].substring(0,2) +
        tarih[0].substring(0,2) + giriszamani[0].substring(3,4) + cikiszamani[0].substring(3,4);

        SQLBağlantıları control = new SQLBağlantıları();
        Müşteriler rzv = control.addRezervation(isim,soyisim,numberofpeople[0],tablenumber[0],giriszamani[0],
            cikiszamani[0],musterinot,tarih[0],kod);

        if (rzv != null){
            Object[] Choice = {"Kodu Kopyala", "Tamam"};
                int n = JOptionPane.showOptionDialog(null,
                        "Rezervasyonunuz Oluşturuldu! Kodunuz:\n" + kod,
                        "Success",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        Choice,
                        Choice[0]);
                if (n == 0) {
                    Clipboard clip = Toolkit.getDefaultToolkit()
                            .getSystemClipboard();
                    StringSelection strse1 = new StringSelection(kod);
                    clip.setContents(strse1, strse1);
                    JOptionPane.showMessageDialog(null,
                            "Kod Kopyalandı!");
                    dispose();
                    new SecimEkrani().setVisible(true);
                } else {
                    dispose();
                    new SecimEkrani().setVisible(true);
                }

        }
    }//GEN-LAST:event_RandevuAlActionPerformed

    private void checkinboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinboxActionPerformed
        
        if(evt.getSource() == checkinbox) {
            giriszamani[0] = (String) checkinbox.getSelectedItem();
            for (int i = checkoutbox.getItemCount()-1; i > 0; i--) {
                checkoutbox.removeItemAt(i);
            }
                if ((giriszamani[0].contains("-"))) {
                    giriszamani[0] = "";
                    cikiszamani[0] = "";
                    if(setText) {
                        if (tarih[0].isEmpty()) {
                            mesajYazdır("Müsait Masaları Görebilmek İçin Lütfen Tarih Seçiniz.");
                        } else if (tablenumber[0].isEmpty()) {
                            mesajYazdır("Müsait Saatleri Görebilmek İçin Lütfen Masa Seçiniz.");
                        } else mesajYazdır("Lütfen Giriş Zamanınızı Seçiniz.");
                    }
                } else {
                    cikiszamani[0] = giriszamani[0];
                    while (converter.convertTime(cikiszamani[0]) - converter.convertTime(giriszamani[0]) < 180 && !cikiszamani[0].equals("23:00")) {
                        cikiszamani[0] = converter.IncrementTime(cikiszamani[0], 30);
                        if (!hours.contains(cikiszamani[0])) checkoutbox.addItem(cikiszamani[0]);
                    }
                    cikiszamani[0] = "";
                    mesajYazdır("Lütfen Çıkış Zamanınızı Seçiniz.");
                }
        }
    }//GEN-LAST:event_checkinboxActionPerformed

    private void checkoutboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutboxActionPerformed

        if(evt.getSource() == checkoutbox){
            cikiszamani[0] = (String)checkoutbox.getSelectedItem();
        }
        if (!(cikiszamani[0].contains("-")) && !(giriszamani[0].contains("-")) && !giriszamani[0].isEmpty() && !cikiszamani[0].isEmpty() && !tarih[0].isEmpty() && !tablenumber[0].isEmpty()) {
            mesajYazdır("Bu Masa Seçilen Tarih ve Zamanda Müsaittir. Rezervasyon Yapabilirsiniz :)");
        }
        else{
            cikiszamani[0] = "";
            if(setText) {
                if (tarih[0].isEmpty()) {
                    mesajYazdır("Müsait Masaları Görebilmek İçin Lütfen Tarih Seçiniz.");
                } else if (tablenumber[0].isEmpty()) {
                    mesajYazdır("Müsait Saatleri Görebilmek İçin Lütfen Masa Seçiniz.");
                } else if (giriszamani[0].isEmpty()) {
                    mesajYazdır("Lütfen Giriş Zamanı Seçiniz");
                } else mesajYazdır("Lütfen Çıkış Zamanı Seçiniz");
            }
        }
        
    }//GEN-LAST:event_checkoutboxActionPerformed

    private void dateboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateboxActionPerformed
       
        if(evt.getSource() == datebox) {
            tarih[0] = (String) datebox.getSelectedItem();
            for (int i = Tablebox.getItemCount() - 1; i > 0; i--) {
                    Tablebox.removeItemAt(i);
                }
            for (int i = checkinbox.getItemCount()-1; i > 0; i--) {
                checkinbox.removeItemAt(i);
            }
            for (int i = checkoutbox.getItemCount()-1; i > 0; i--) {
                checkoutbox.removeItemAt(i);
            }
            if((tarih[0].equals("---Seciniz---")) || tarih[0].isEmpty()) {
                tarih[0] = "";
                giriszamani[0] = "";
                cikiszamani[0] = "";
                tablenumber[0] = "";
                if (setText) {
                    mesajYazdır("Müsait Masaları Görebilmek İçin Lütfen Tarih Seçiniz.");
                }
            }
            else {
                for (int a = 1; a <= 12; a++) {
                        int workingtime = 720;
                        int temptime;
                        int tempminute;
                        int opening = 660;
                        if (converter.convertDate(tarih[0]) == converter.convertDate(converter.CurrentDate())
                                && converter.convertTime(converter.CurrentTime()) > 600) {
                            temptime = converter.convertTime(converter.CurrentTime());
                            tempminute = (60 - (temptime % 60));
                            if (tempminute < 30) {
                                opening = (temptime + 60 + tempminute);
                            } else {
                                opening = (temptime + 30 + tempminute);
                            }
                            workingtime = 1380 - opening;
                        }
                        for (Müşteriler rzv : liste) {
                            if (rzv.getMasano().equals(Integer.toString(a)) && rzv.getTarih().equals(tarih[0])) {
                                if (converter.convertTime(rzv.getGiriszamani()) >= opening) {
                                    workingtime -= converter.convertTime(rzv.getCikiszamani()) - converter.convertTime(rzv.getGiriszamani());
                                } else if (converter.convertTime(rzv.getGiriszamani()) < opening && converter.convertTime(rzv.getCikiszamani()) > opening) {
                                    workingtime -= converter.convertTime(rzv.getCikiszamani()) - opening;
                                }
                            }
                        }
                        if (workingtime > 0) {
                            String temp = Integer.toString(a);
                            Tablebox.addItem(temp);
                        }
                    }
                if(setText) {
                    if (Tablebox.getItemCount() == 1) {
                        mesajYazdır("Secilen Tarihte Müsait Masamız Bulunmamaktadır. Lütfen Başka Bir Tarih Seçiniz.");
                    } else {
                        mesajYazdır("Müsait Saatleri Görebilmek İçin Lütfen Masa Seçiniz.");
                    }
                }

            }

        }

    }//GEN-LAST:event_dateboxActionPerformed

    private void peopleboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peopleboxActionPerformed
        if(evt.getSource() == peoplebox){
            numberofpeople[0] = (String)peoplebox.getSelectedItem();
        }
        if (numberofpeople[0].contains("-")) {
                numberofpeople[0] = "";
            }
    }//GEN-LAST:event_peopleboxActionPerformed

    private void TableboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableboxActionPerformed
        
        if(evt.getSource() == Tablebox){
                    tablenumber[0] = (String)Tablebox.getSelectedItem();
                    for (int i = checkinbox.getItemCount() - 1; i > 0; i--) {
                    checkinbox.removeItemAt(i);
                }
                for (int i = checkoutbox.getItemCount() - 1; i > 0; i--) {
                    checkoutbox.removeItemAt(i);
                }
                if ((tablenumber[0].contains("-"))) {
                    giriszamani[0] = "";
                    cikiszamani[0] = "";
                    tablenumber[0] = "";
                    if(setText) {
                        if (tarih[0].isEmpty()) {
                            mesajYazdır("Müsait Masaları Görebilmek İçin Lütfen Tarih Seçiniz.");
                        } else mesajYazdır("Lütfen Masa Seçiniz.");
                    }
                }
                    
                    if (!tarih[0].isEmpty() && !(tarih[0].contains("---")) && !tablenumber[0].isEmpty()) {
                        hours.clear();
                        firsthours.clear();
                        if (converter.convertDate(tarih[0]) == converter.convertDate(converter.CurrentDate())
                                && converter.convertTime(converter.CurrentTime()) > 600) {
                            int temptime = converter.convertTime(converter.CurrentTime());
                            int tempminute = (60 - (temptime % 60));
                            if (tempminute < 30)
                                giriszamani[0] = converter.IncrementTime(converter.CurrentTime(), tempminute + 60);
                            else giriszamani[0] = converter.IncrementTime(converter.CurrentTime(), tempminute + 30);
                        } else giriszamani[0] = "11:00";
                        for (Müşteriler rzv : liste) {
                            if (tablenumber[0].equals(rzv.getMasano()) && tarih[0].equals(rzv.getTarih())) {
                                String temp = rzv.getGiriszamani();
                                ArrayList<String> temphours = new ArrayList<>();
                                while (!temp.equals(rzv.getCikiszamani())) {
                                    temphours.add(temp);
                                    temp = converter.IncrementTime(temp, 30);
                                }
                                if (!temphours.isEmpty()) {
                                    firsthours.add(temphours.getFirst());
                                    for (int i = 1; i < temphours.size(); i++) hours.add(temphours.get(i));
                                }
                            }
                        }
                        while (!giriszamani[0].equals("23:00")) {
                            if (!hours.contains(giriszamani[0]) && !firsthours.contains(giriszamani[0])) checkinbox.addItem(giriszamani[0]);
                            giriszamani[0] = converter.IncrementTime(giriszamani[0], 30);
                        }
                        giriszamani[0] = "";
                        mesajYazdır("Lütfen Giriş Zamanınızı Seçiniz.");

                }
        }
    }//GEN-LAST:event_TableboxActionPerformed

    private void MoveMouseEntered() {//GEN-FIRST:event_MoveMouseEntered
        Move.setIcon(ikonlar.getAlldirections2());
        Move.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MoveMouseEntered

    private void MoveMouseExited() {//GEN-FIRST:event_MoveMouseExited
         Move.setIcon(ikonlar.getAlldirections());
    }//GEN-LAST:event_MoveMouseExited

    private void MoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMousePressed
        posX= evt.getX();
        posY= evt.getY();
        Move.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MoveMousePressed

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseDragged
       this.setLocation(evt.getXOnScreen() - posX - 709 , evt.getYOnScreen()-posY-8);
       Move.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MoveMouseDragged

    private void cancelMouseClicked() {//GEN-FIRST:event_cancelMouseClicked
        SecimEkrani secim = new SecimEkrani();
        secim.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseEntered() {//GEN-FIRST:event_cancelMouseEntered
        cancel.setIcon(ikonlar.getLeftarrow2());
       cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited() {//GEN-FIRST:event_cancelMouseExited
      cancel.setIcon(ikonlar.getLeftarrow());
    }//GEN-LAST:event_cancelMouseExited

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

    private void CloseMouseClicked() {//GEN-FIRST:event_CloseMouseClicked
       dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered() {//GEN-FIRST:event_CloseMouseEntered
        Close.setIcon(ikonlar.getCancel2());
        Close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseExited() {//GEN-FIRST:event_CloseMouseExited
        Close.setIcon(ikonlar.getCancel());
    }//GEN-LAST:event_CloseMouseExited

    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped
        if(nameField.getText().length() > 50) evt.consume();

    }//GEN-LAST:event_nameFieldKeyTyped

    private void surnameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_surnameFieldKeyTyped
       if(surnameField.getText().length() > 50) evt.consume();

    }//GEN-LAST:event_surnameFieldKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Move;
    private javax.swing.JTextArea MusteriNot;
    private javax.swing.JButton RandevuAl;
    private javax.swing.JComboBox<String> Tablebox;
    private javax.swing.JLabel cancel;
    private javax.swing.JTextArea chat;
    private javax.swing.JLabel chatbot;
    private javax.swing.JComboBox<String> checkinbox;
    private javax.swing.JComboBox<String> checkoutbox;
    private javax.swing.JComboBox<String> datebox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel minus;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> peoplebox;
    private javax.swing.JTextField surnameField;
    // End of variables declaration//GEN-END:variables
}
