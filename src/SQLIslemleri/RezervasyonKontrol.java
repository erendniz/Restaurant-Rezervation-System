
package SQLIslemleri;

import IconClass.Icons;
import Kullanıcılar.Müşteriler;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;

public class RezervasyonKontrol extends javax.swing.JFrame {
    
    private SwingWorker<Boolean,Integer> worker;
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private Icons ikonlar = new Icons();
     
    private Integer posX = getY();
    private Integer posY = getX();

    public void mesajYazdır(String mesaj){
        try {
            Thread.sleep(25);
        } catch (InterruptedException ex) {
            Logger.getLogger(RezervasyonKontrol.class.getName()).log(Level.SEVERE, null, ex);
        }
        TextArea.setForeground(Color.BLUE);
        TextArea.setText("");
        if(worker != null){
            worker.cancel(true);
            TextArea.setText("");
        }
        TextArea.setText("");
        worker= new SwingWorker<>() {
            @Override
            protected Boolean doInBackground() throws Exception {
                for (int i = 0; i < mesaj.length(); i++) {
                    TextArea.append(String.valueOf(mesaj.charAt(i)));
                    Thread.sleep(15);
                }
                return true;
            }

        };
        worker.execute();
    }
   
    public RezervasyonKontrol() {
        initComponents();
        initComponents2();
    }
    public void initComponents2(){
        mesajYazdır("Randevu Bilgilerinizi Öğrenebilmek İçin Lütfen Randevu Kodunuzu Giriniz. ");
        this.setLocation(dim.width/2 -this.getSize().width/2,dim.height/2-this.getSize().height/2);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        CodeField = new javax.swing.JTextField();
        ŞifremiUnuttum = new javax.swing.JLabel();
        Buton = new javax.swing.JButton();
        Move = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        minus = new javax.swing.JLabel();
        close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chat (7).png"))); // NOI18N

        TextArea.setEditable(false);
        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TextArea.setForeground(new java.awt.Color(255, 51, 51));
        TextArea.setLineWrap(true);
        TextArea.setRows(5);
        TextArea.setWrapStyleWord(true);
        TextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));
        TextArea.setFocusable(false);
        TextArea.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(TextArea);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paintalt2_1.png"))); // NOI18N
        jLabel2.setToolTipText("");

        CodeField.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        CodeField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2), "Kod", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        ŞifremiUnuttum.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        ŞifremiUnuttum.setForeground(new java.awt.Color(255, 51, 51));
        ŞifremiUnuttum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ŞifremiUnuttum.setText("Randevu Kodumu Unuttum");
        ŞifremiUnuttum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ŞifremiUnuttumMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ŞifremiUnuttumMouseExited();
            }
        });

        Buton.setBackground(new java.awt.Color(153, 204, 255));
        Buton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/enter.png"))); // NOI18N

        Buton.addActionListener(evt -> ButonActionPerformed());

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(ŞifremiUnuttum, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancel)
                                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Move))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ŞifremiUnuttum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buton)
                        .addGap(126, 126, 126))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)))
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ŞifremiUnuttumMouseEntered() {//GEN-FIRST:event_ŞifremiUnuttumMouseEntered
        ŞifremiUnuttum.setForeground(Color.BLUE);
    }//GEN-LAST:event_ŞifremiUnuttumMouseEntered

    private void ŞifremiUnuttumMouseExited() {//GEN-FIRST:event_ŞifremiUnuttumMouseExited
        ŞifremiUnuttum.setForeground(Color.red);
    }//GEN-LAST:event_ŞifremiUnuttumMouseExited

    private void ButonActionPerformed() {//GEN-FIRST:event_ButonActionPerformed
        String kod = CodeField.getText();

                SQLBağlantıları control = new SQLBağlantıları();
                TimeConverter converter = new TimeConverter();
                Müşteriler rzv = control.rezervationControl(kod);

                if(rzv != null){
                    if((converter.convertDate(rzv.getTarih()) < converter.convertDate(converter.CurrentDate())) ||
                            ((converter.convertDate(rzv.getTarih()) == converter.convertDate(converter.CurrentDate())) &&
                                    converter.convertTime(rzv.getCikiszamani()) <converter.convertTime(converter.CurrentTime()))){
                        mesajYazdır("Rezervasyonunuzun tarihi geçmiştir.Yeni bir randevu almak için bir önceki menüye dönebilirsiniz.");
                    }
                    else {
                        mesajYazdır("---Rezervasyon Bilgileriniz---\n\nİsim: "+(rzv.getIsim())+"\nSoyisim: "+(rzv.getSoyisim())
                        +"\nTarih: "+(rzv.getTarih())+"\nGiriş Zamanı: "+(rzv.getGiriszamani())+"\nÇıkış Zamanı: "+(rzv.getCikiszamani())
                        +"\nMasa No: "+(rzv.getMasano())+"\nKişi sayısı: "+(rzv.getKisisayisi())+"\nNot: "+(rzv.getMusterinot()));
                    }
                }
                else{
                    mesajYazdır(" Geçersiz rezervasyon kodu girdiniz. "
                            + " Rezervasyon kodunuzu hatırlamıyorsanız randevu kodumu unuttum seçeneğine tıklayabilirsiniz.");
                }


    }//GEN-LAST:event_ButonActionPerformed

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseDragged
       this.setLocation(evt.getXOnScreen() - posX - 511 , evt.getYOnScreen()-posY- 15);
       Move.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MoveMouseDragged

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buton;
    private javax.swing.JTextField CodeField;
    private javax.swing.JLabel Move;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minus;
    private javax.swing.JLabel ŞifremiUnuttum;
    // End of variables declaration//GEN-END:variables
}
