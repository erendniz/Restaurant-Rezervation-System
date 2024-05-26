
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
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;


public class Randevuİptal extends javax.swing.JFrame {
     private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
     private Icons ikonlar = new Icons();
     
    private SwingWorker<Boolean,Integer> worker;
    private  Integer posX = getY();
    private Integer posY = getX();
    public void mesajYazdır(String mesaj){
        try {
            Thread.sleep(25);
        } catch (InterruptedException ex) {
            Logger.getLogger(Randevuİptal.class.getName()).log(Level.SEVERE, null, ex);
        }
        TextArea.setText("");
        TextArea.setForeground(Color.blue);
        if(worker != null){
            worker.cancel(true);
            TextArea.setText("");
        }
        TextArea.setText("");
        worker= new SwingWorker<Boolean, Integer>(){
            @Override
            protected Boolean doInBackground() throws Exception {
                for(int i=0;i<mesaj.length();i++){
                    TextArea.append(String.valueOf(mesaj.charAt(i)));
                    Thread.sleep(30);
                }
                return true;
            }

        };
        worker.execute();
    }
   
    public Randevuİptal() {
        initComponents();
        initComponents_2();
    }
    public void initComponents_2(){
    this.setLocation(dim.width/2 -this.getSize().width/2,dim.height/2-this.getSize().height/2);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        codeField = new javax.swing.JTextField();
        Buton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        minus = new javax.swing.JLabel();
        Move = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened();
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setDoubleBuffered(false);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited();
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chat (7).png"))); // NOI18N

        TextArea.setEditable(false);
        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextArea.setForeground(new java.awt.Color(0, 153, 255));
        TextArea.setLineWrap(true);
        TextArea.setRows(5);
        TextArea.setWrapStyleWord(true);
        TextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));
        TextArea.setCaretColor(new java.awt.Color(51, 102, 255));
        TextArea.setFocusable(false);
        TextArea.setRequestFocusEnabled(false);
        TextArea.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(TextArea);

        codeField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        codeField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Kod", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        codeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeFieldKeyTyped(evt);
            }
        });

        Buton.setBackground(new java.awt.Color(255, 51, 51));
        Buton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Buton.setText("İptal Et");
        Buton.addActionListener(evt -> ButonActionPerformed());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        Move.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Move.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/all-directions.png"))); // NOI18N
        Move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveMouseDragged(evt);
            }
        });
        Move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoveMouseClicked();
            }
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(443, Short.MAX_VALUE)
                .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Buton)
                        .addGap(78, 78, 78))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened() {//GEN-FIRST:event_formWindowOpened
       mesajYazdır("Randevunuzun iptali için randevu kodunuzu girmeniz gerekmektedir. ");
    }//GEN-LAST:event_formWindowOpened

    private void cancelMouseClicked() {//GEN-FIRST:event_cancelMouseClicked
        worker.cancel(true);
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

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseDragged
       this.setLocation(evt.getXOnScreen() - posX - 444 , evt.getYOnScreen()-posY- 7);
       Move.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MoveMouseDragged

    private void MoveMouseClicked() {//GEN-FIRST:event_MoveMouseClicked
      
    }//GEN-LAST:event_MoveMouseClicked

    private void MoveMouseEntered() {//GEN-FIRST:event_MoveMouseEntered
        Move.setIcon(ikonlar.getAlldirections2());
        Move.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MoveMouseEntered

    private void jPanel2MouseExited() {//GEN-FIRST:event_jPanel2MouseExited
      
    }//GEN-LAST:event_jPanel2MouseExited

    private void MoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMousePressed
       posX= evt.getX();
        posY= evt.getY();
        Move.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MoveMousePressed

    private void MoveMouseExited() {//GEN-FIRST:event_MoveMouseExited
         Move.setIcon(ikonlar.getAlldirections());
    }//GEN-LAST:event_MoveMouseExited

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

    private void codeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeFieldKeyTyped
        if(codeField.getText().length() > 20) evt.consume();

    }//GEN-LAST:event_codeFieldKeyTyped

    private void ButonActionPerformed() {//GEN-FIRST:event_jButton1ActionPerformed
                String kod = codeField.getText();
                SQLBağlantıları control = new SQLBağlantıları();
                Müşteriler rndv = control.rezervationControl(kod);
                
                if(rndv != null ) {
                    int result = JOptionPane.showConfirmDialog(Randevuİptal.this, "Rezervasyonunuzu iptal etmek istediğinizden emin misiniz?", "Onayla",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE);

                    if (result == JOptionPane.YES_OPTION) {
                        control.deleteRezervation(kod);
                        mesajYazdır("Sayın " +rndv.getIsim()+" " +rndv.getSoyisim()+", Rezervasyonunuz başarıyla iptal edilmiştir. İyi günler dileriz.");
                    }
                }
                else{
                    mesajYazdır("Geçersiz rezervasyon kodu girdiniz. "
                     + " Rezervasyon kodunuzu hatırlamıyorsanız randevu kodumu unuttum seçeneğine tıklayabilirsiniz.");

                }

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Move;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel close;
    private javax.swing.JTextField codeField;
    private javax.swing.JButton Buton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel minus;
    // End of variables declaration//GEN-END:variables
}
