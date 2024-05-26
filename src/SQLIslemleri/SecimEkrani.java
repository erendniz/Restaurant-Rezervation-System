/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SQLIslemleri;

import GirisEkrani.GirisEkrani;
import IconClass.Icons;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.SwingWorker;


public class SecimEkrani extends javax.swing.JFrame {
    
    private Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
    private Icons ikonlar = new Icons();
    private SwingWorker<Boolean,Integer> worker;
    
    private Integer posX = getY();
    private Integer posY = getX();
    
    public SecimEkrani() {
        initComponents();
        initComponents_2();
    }
    public void initComponents_2(){
        String mesaj="Hoşgeldiniz. Size nasıl yardımcı olabilirim?";
          if(worker != null){
            worker.cancel(!worker.isDone());
        }
        worker= new SwingWorker<Boolean, Integer>(){
            @Override
            protected Boolean doInBackground() throws Exception {
               for(int i=0;i<mesaj.length();i++){
                   chat.append(String.valueOf(mesaj.charAt(i)));
                   Thread.sleep(30);
               }
                return true;
            }
        
    };
      worker.execute(); 
    this.setLocation(dim.width/2 -this.getSize().width/2,dim.height/2-this.getSize().height/2);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chatt = new javax.swing.JScrollPane();
        chat = new javax.swing.JTextArea();
        RandevuAl = new javax.swing.JButton();
        RandevuKontrol = new javax.swing.JButton();
        Randevuİptal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cancel = new javax.swing.JLabel();
        Move = new javax.swing.JLabel();
        minus = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chat (7).png"))); // NOI18N

        chat.setEditable(false);
        chat.setColumns(20);
        chat.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        chat.setForeground(new java.awt.Color(0, 102, 255));
        chat.setLineWrap(true);
        chat.setRows(5);
        chat.setWrapStyleWord(true);
        chat.setAutoscrolls(false);
        chat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chat.setCaretColor(new java.awt.Color(255, 255, 255));
        chat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chat.setHighlighter(null);
        chatt.setViewportView(chat);

        RandevuAl.setBackground(new java.awt.Color(153, 204, 255));
        RandevuAl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        RandevuAl.setText("Randevu Al");
        RandevuAl.addActionListener(evt -> RandevuAlActionPerformed());

        RandevuKontrol.setBackground(new java.awt.Color(51, 204, 0));
        RandevuKontrol.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        RandevuKontrol.setText("Randevu Kontrol");
        RandevuKontrol.addActionListener(evt -> RandevuKontrolActionPerformed());

        Randevuİptal.setBackground(new java.awt.Color(255, 51, 51));
        Randevuİptal.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Randevuİptal.setText("Randevu İptal");
        Randevuİptal.addActionListener(evt -> RandevuİptalActionPerformed());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
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
        Move.setToolTipText("");
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paintalt2_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chatt, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Randevuİptal, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(RandevuAl, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(RandevuKontrol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(RandevuAl)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chatt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RandevuKontrol)
                        .addGap(35, 35, 35)
                        .addComponent(Randevuİptal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
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

    private void RandevuAlActionPerformed() {//GEN-FIRST:event_RandevuAlActionPerformed
        worker.cancel(true);
        RezervasyonAlma rzv = new RezervasyonAlma();
        rzv.setVisible(true);
        dispose();
    }//GEN-LAST:event_RandevuAlActionPerformed

    private void RandevuKontrolActionPerformed() {//GEN-FIRST:event_RandevuKontrolActionPerformed
        worker.cancel(true);
        RezervasyonKontrol rndv = new RezervasyonKontrol();
        rndv.setVisible(true);
        dispose();
    }//GEN-LAST:event_RandevuKontrolActionPerformed

    private void cancelMouseClicked() {//GEN-FIRST:event_cancelMouseClicked
        worker.cancel(true);
        GirisEkrani giris = new GirisEkrani();
        giris.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void RandevuİptalActionPerformed() {//GEN-FIRST:event_RandevuİptalActionPerformed
        worker.cancel(true);
        Randevuİptal rndv = new Randevuİptal();
        rndv.setVisible(true);
        dispose();
    }//GEN-LAST:event_RandevuİptalActionPerformed

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

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseDragged
       this.setLocation(evt.getXOnScreen() - posX - 532 , evt.getYOnScreen()-posY-9);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Move;
    private javax.swing.JButton RandevuAl;
    private javax.swing.JButton RandevuKontrol;
    private javax.swing.JButton Randevuİptal;
    private javax.swing.JLabel cancel;
    private javax.swing.JTextArea chat;
    private javax.swing.JScrollPane chatt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minus;
    // End of variables declaration//GEN-END:variables
}
