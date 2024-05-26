
package GirisEkrani;

import Arayüz.Arayüz;
import IconClass.Icons;
import Kullanıcılar.Admin;
import SQLIslemleri.SecimEkrani;
import SQLIslemleri.SQLBağlantıları;
import com.formdev.flatlaf.FlatIntelliJLaf;

import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class GirisEkrani extends javax.swing.JFrame {
    private Icons ikonlar = new Icons();
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    
    private Integer posX = getY();
    private Integer posY = getX();
    
    
    public GirisEkrani() {
        initComponents();
        initComponents_2();
    }
    public void initComponents_2(){
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setLocation(dim.width/2 -this.getSize().width/2,dim.height/2-this.getSize().height/2);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        paint = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Userpng = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        KullanıcıAdı = new javax.swing.JTextField();
        Sifre = new javax.swing.JPasswordField();
        GirişYap = new javax.swing.JButton();
        MisafirGirişi = new javax.swing.JButton();
        SifreBox = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        Move = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        paint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paintfinall.png"))); // NOI18N
        paint.setFocusable(false);
        paint.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(paint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        Userpng.setBackground(new java.awt.Color(255, 255, 255));
        Userpng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        Userpng.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(Userpng)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(Userpng, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        KullanıcıAdı.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        KullanıcıAdı.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Kullanıcı Adı", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        KullanıcıAdı.setForeground(Color.BLACK);

        Sifre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Sifre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Şifre", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        Sifre.setForeground(Color.BLACK);
        Sifre.setEchoChar('*');

        GirişYap.setBackground(new java.awt.Color(153, 204, 255));
        GirişYap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/enter.png"))); // NOI18N

        GirişYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirişYapActionPerformed();
            }
        });

        MisafirGirişi.setBackground(new java.awt.Color(153, 204, 255));
        MisafirGirişi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MisafirGirişi.setText("Misafir Girişi");
        MisafirGirişi.setForeground(Color.BLACK);
        MisafirGirişi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MisafirGirişiActionPerformed();
            }
        });

        SifreBox.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        SifreBox.setText("Şifre Göster");
        SifreBox.setForeground(Color.BLACK);
        SifreBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SifreBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KullanıcıAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SifreBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(MisafirGirişi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(GirişYap, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(KullanıcıAdı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SifreBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MisafirGirişi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GirişYap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

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

        Minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minus.png"))); // NOI18N
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked();
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeMouseExited();
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GirişYapActionPerformed() {
                String username = KullanıcıAdı.getText();
                String password = String.valueOf(Sifre.getPassword());

                SQLBağlantıları control = new SQLBağlantıları();
                Admin adm = control.adminControl(username,password);

                if (adm != null){
                    JOptionPane.showMessageDialog(GirisEkrani.this,"Hoşgeldiniz %s".formatted(adm.getUsername()),
                            "Giriş Başarılı",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new Arayüz().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(GirisEkrani.this,"Geçersiz Kullanıcı Adı veya Şifre",
                            "Tekrar Deneyin",JOptionPane.ERROR_MESSAGE);
                }
    }

    private void MinimizeMouseClicked() {
        Minimize.setIcon(ikonlar.getMinus2());
        this.setState(Frame.ICONIFIED);
    }

    private void MinimizeMouseEntered() {
       Minimize.setIcon(ikonlar.getMinus2());
       Minimize.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    private void MinimizeMouseExited() {
       Minimize.setIcon(ikonlar.getMinus());
    }

    private void CloseMouseEntered() {
        Close.setIcon(ikonlar.getCancel2());
        Close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    private void CloseMouseExited() {
        Close.setIcon(ikonlar.getCancel());
    }

    private void CloseMouseClicked() {
        dispose();
    }

    private void MoveMousePressed(java.awt.event.MouseEvent evt) {
        posX= evt.getX();
        posY= evt.getY();
        Move.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {
       try{
       this.setLocation(evt.getXOnScreen() - posX - 597 , evt.getYOnScreen()-posY-12);
       Move.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       }catch(Exception e){
           e.printStackTrace();
       }
    }

    private void MisafirGirişiActionPerformed() {
        SecimEkrani rezervasyon= new SecimEkrani();
        rezervasyon.setVisible(true);
        dispose();
    }

    private void MoveMouseEntered() {//GEN-FIRST:event_MoveMouseEntered
        Move.setIcon(ikonlar.getAlldirections2());
        Move.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MoveMouseEntered

    private void MoveMouseExited() {//GEN-FIRST:event_MoveMouseExited
        Move.setIcon(ikonlar.getAlldirections());
    }//GEN-LAST:event_MoveMouseExited

    private void SifreBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SifreBoxActionPerformed
        if(SifreBox.isSelected())Sifre.setEchoChar((char)0);
        else Sifre.setEchoChar('*');
    }//GEN-LAST:event_SifreBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JButton GirişYap;
    private javax.swing.JTextField KullanıcıAdı;
    private javax.swing.JLabel Minimize;
    private javax.swing.JButton MisafirGirişi;
    private javax.swing.JLabel Move;
    private javax.swing.JPasswordField Sifre;
    private javax.swing.JCheckBox SifreBox;
    private javax.swing.JLabel Userpng;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel paint;
    // End of variables declaration//GEN-END:variables
}
