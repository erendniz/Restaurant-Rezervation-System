
package MüşteriBilgi;

import Arayüz.Arayüz;
import Kullanıcılar.Müşteriler;
import SQLIslemleri.SQLBağlantıları;
import SQLIslemleri.TimeConverter;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public final class MüşteriBilgi extends javax.swing.JFrame {
    private String[] selectedCellValue = {""};
    private SQLBağlantıları control = new SQLBağlantıları();
    private String mustarih;
    private String musmasano;
    private int boyut;
    private int sayac;
    private ArrayList<Müşteriler> list;
   
   public void setmustarih(String tarih){
       this.mustarih = tarih;
   }
   
   public void setmusmasano(String masano){
       this.musmasano = masano;
   }
   
   public void setboyut(int boyut){
       this.boyut = boyut;
   }
   
   public void setlist(ArrayList<Müşteriler> list){
       this.list = list;
   }
   public void setselectedCellValue(String mouse){
       this.selectedCellValue[0] = mouse;
   }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

    public int getSayac() {
        return sayac;
    }

    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    
    public MüşteriBilgi(ArrayList<Müşteriler> liste, String tarih, String MasaNo) {
        setmustarih(tarih);
        setmusmasano(MasaNo);
        setboyut(liste.size());
        setlist(liste);
        initComponents();
        initComponents_2(liste, tarih,MasaNo);
    }
    
    public void initComponents_2(ArrayList<Müşteriler> liste, String tarih, String MasaNo){

        TimeConverter converter = new TimeConverter();
        Object[][]data = new Object[liste.size()][7];
        
        int i = 0;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            for (Müşteriler rzv : liste) {
                if (MasaNo.isEmpty()) {
                    if (tarih.equals("---Tüm tarihler---")) {
                        if (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate())
                        || (rzv.getTarih().equals(converter.CurrentDate()) &&(converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani())))) {
                            data[i] = new Object[]{rzv.getIsim() + " " + rzv.getSoyisim(), Integer.parseInt(rzv.getMasano()), Integer.parseInt(rzv.getKisisayisi()),LocalDate.parse(rzv.getTarih(),format),
                                    rzv.getGiriszamani() + " - " + rzv.getCikiszamani(), rzv.getKod(), rzv.getMusterinot()};
                            i++;
                        }
                    } else if (tarih.equals("Old")) {
                        if (converter.convertDate(rzv.getTarih()) < converter.convertDate(converter.CurrentDate()) ||
                                (rzv.getTarih().equals(converter.CurrentDate()) &&(converter.convertTime(converter.CurrentTime()) > converter.convertTime(rzv.getCikiszamani())))) {
                            data[i] = new Object[]{rzv.getIsim() + " " + rzv.getSoyisim(), Integer.parseInt(rzv.getMasano()), Integer.parseInt(rzv.getKisisayisi()), LocalDate.parse(rzv.getTarih(),format),
                                    rzv.getGiriszamani() + " - " + rzv.getCikiszamani(), rzv.getKod(), rzv.getMusterinot()};
                            i++;
                        }
                    }
                    else{
                        if (tarih.equals(rzv.getTarih()) && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate())) ||
                                ((tarih.equals(rzv.getTarih()) && rzv.getTarih().equals(converter.CurrentDate())) &&(converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani())))) {
                            data[i] = new Object[]{rzv.getIsim() + " " + rzv.getSoyisim(), Integer.parseInt(rzv.getMasano()), Integer.parseInt(rzv.getKisisayisi()), LocalDate.parse(rzv.getTarih(),format),
                                    rzv.getGiriszamani() + " - " + rzv.getCikiszamani(), rzv.getKod(), rzv.getMusterinot()};
                            i++;
                        }
                    }
                } else {
                    if (MasaNo.equals(rzv.getMasano())) {
                        if (tarih.equals("---Tüm tarihler---") && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate())) ||
                                (rzv.getTarih().equals(converter.CurrentDate()) &&(converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani())))) {
                            data[i] = new Object[]{rzv.getIsim() + " " + rzv.getSoyisim(), Integer.parseInt(rzv.getMasano()), Integer.parseInt(rzv.getKisisayisi()), LocalDate.parse(rzv.getTarih(),format),
                                    rzv.getGiriszamani() + " - " + rzv.getCikiszamani(), rzv.getKod(), rzv.getMusterinot()};
                            i++;
                        }
                        else if (tarih.equals(rzv.getTarih()) && (converter.convertDate(rzv.getTarih()) > converter.convertDate(converter.CurrentDate())) ||
                                (rzv.getTarih().equals(converter.CurrentDate()) && tarih.equals(converter.CurrentDate())) &&(converter.convertTime(converter.CurrentTime()) <= converter.convertTime(rzv.getCikiszamani()))) {
                            data[i] = new Object[]{rzv.getIsim() + " " + rzv.getSoyisim(), Integer.parseInt(rzv.getMasano()), Integer.parseInt(rzv.getKisisayisi()),LocalDate.parse(rzv.getTarih(),format),
                                    rzv.getGiriszamani() + " - " + rzv.getCikiszamani(), rzv.getKod(), rzv.getMusterinot()};
                            i++;
                        }
                    }
                }
            }
            setSayac(i);
                DefaultTableModel model = new DefaultTableModel(data, new String[]{"Ad Soyad", "Masa", "Kişi S.", "Tarih"
                        , "Giriş-Çıkış", "Randevu Kodu", "Not"}){

                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                    public Class getColumnClass(int column) {
                        return switch (column) {
                            case 1,2 -> Integer.class;
                            case 3 -> LocalDate.class;
                            default -> String.class;
                        };
                    }
                };

                for (int j = model.getRowCount() - 1; j >= 0; j--) {
                    if (model.getValueAt(j,0) == null) model.removeRow(j);
                }


                DataPanel.setBackground(Color.WHITE);
                dataTable.setModel(model);
                dataTable.setFocusable(false);
                dataTable.setAutoCreateRowSorter(true);
                dataTable.setRowSelectionAllowed(true);
                dataTable.getTableHeader().setReorderingAllowed(false);
                dataTable.getTableHeader().setBackground(Color.GRAY);
                dataTable.getTableHeader().setForeground(Color.BLUE);
                dataTable.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,20));
                dataTable.setRowHeight(50);
                dataTable.setShowGrid(true);
                dataTable.setGridColor(Color.BLACK);
                dataTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

                TableColumnModel colums = dataTable.getColumnModel();
                colums.getColumn(0).setMinWidth(200);
                colums.getColumn(1).setMinWidth(75);
                colums.getColumn(2).setMinWidth(75);
                colums.getColumn(3).setMinWidth(125);
                colums.getColumn(4).setMinWidth(125);
                colums.getColumn(5).setMinWidth(200);

                DefaultTableCellRenderer r = new DefaultTableCellRenderer();
                r.setHorizontalAlignment(JLabel.CENTER);

                for(i=0;i<7;i++){
                    colums.getColumn(i).setCellRenderer(r);
                }

                dataTable.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }
                    @Override
                    public void mousePressed(MouseEvent e) {
                        try{
                            setselectedCellValue((String)dataTable.getValueAt(dataTable.getSelectedRow(),5));
                        }catch(Exception ignored){
                            setselectedCellValue("");
                        }
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                    }
                    @Override
                    public void mouseClicked(MouseEvent e) {

                    }
                });
            this.setVisible(true);
        this.setLocation(dim.width/2 -this.getSize().width/2,dim.height/2-this.getSize().height/2);
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        DataPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        showNoteButton = new javax.swing.JButton();
        deleteALLReservationsButton = new javax.swing.JButton();
        deleteReservationButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel9.setText("jLabel5");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        DataPanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));

        dataTable.setBackground(new java.awt.Color(0, 204, 204));
        dataTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dataTable.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));

        jScrollPane2.setViewportView(dataTable);

        showNoteButton.setBackground(new java.awt.Color(0, 153, 51));
        showNoteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showNoteButton.setText("Notu Göster");
        showNoteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showNoteButton.addActionListener(evt -> showNoteButtonActionPerformed());

        deleteALLReservationsButton.setBackground(new java.awt.Color(204, 0, 51));
        deleteALLReservationsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteALLReservationsButton.setText("Bütün Rezervasyonları Sil");
        deleteALLReservationsButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteALLReservationsButton.addActionListener(evt -> deleteALLReservationsButtonActionPerformed());

        deleteReservationButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteReservationButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteReservationButton.setText("Rezervasyonu Sil");
        deleteReservationButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteReservationButton.addActionListener(evt -> deleteReservationButtonActionPerformed());

        goBackButton.setBackground(new java.awt.Color(102, 153, 255));
        goBackButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        goBackButton.setText("Geri Dön");
        goBackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        goBackButton.addActionListener(evt -> goBackButtonActionPerformed());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paintalt2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DataPanelLayout = new javax.swing.GroupLayout(DataPanel);
        DataPanel.setLayout(DataPanelLayout);
        DataPanelLayout.setHorizontalGroup(
                DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPanelLayout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(showNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(goBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                        .addComponent(deleteALLReservationsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DataPanelLayout.setVerticalGroup(
                DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DataPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(deleteALLReservationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(showNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(deleteReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showNoteButtonActionPerformed() {//GEN-FIRST:event_showNoteButtonActionPerformed
                    try{
                    selectedCellValue[0].isEmpty();
                    }catch(Exception ignored){
                        selectedCellValue[0] = "";
                    }
                    if(selectedCellValue[0].isEmpty()){
                        JOptionPane.showMessageDialog(MüşteriBilgi.this,"Notu Görmek Için Bir Rezervasyon Seçmelisiniz.",
                                "Hata",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        Müşteriler rzv = control.rezervationControl(selectedCellValue[0]);
                        if(rzv.getMusterinot().isEmpty()){
                            JOptionPane.showMessageDialog(MüşteriBilgi.this,"Bu Rezervasyonda Not Yok.",
                                    "Bilgi",JOptionPane.WARNING_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(MüşteriBilgi.this, ("Note: %s").formatted(rzv.getMusterinot()),
                                    "Not", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
    }//GEN-LAST:event_showNoteButtonActionPerformed

    private void deleteReservationButtonActionPerformed() {//GEN-FIRST:event_deleteReservationButtonActionPerformed
                    try{
                    selectedCellValue[0].isEmpty();
                    }catch(Exception ignored){
                        selectedCellValue[0] = "";
                    }
                    if(selectedCellValue[0].isEmpty()){
                        JOptionPane.showMessageDialog(MüşteriBilgi.this,"Silmek İçin Bir Rezervasyon Seçmelisiniz.",
                                "Hata",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        int result = JOptionPane.showConfirmDialog(MüşteriBilgi.this, "Aşağıdaki Koda Sahib Olan Seçilmiş Rezervasyonu Silmek İstediğinize Emin Misiniz:\n%s?".formatted(selectedCellValue[0]),
                                "Onayla",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE);
                        if (result == JOptionPane.YES_OPTION) {
                            control.deleteRezervation(selectedCellValue[0]);
                            JOptionPane.showMessageDialog(MüşteriBilgi.this,"%s Kodlu Rezervasyon Sistemden Silindi.".formatted(selectedCellValue[0]),
                                    "Silindi",JOptionPane.WARNING_MESSAGE);
                            dispose();
                            if(boyut -1 == 0){
                                Arayüz arayüz =new Arayüz();
                                arayüz.setVisible(true);
                            }
                            else {
                                new MüşteriBilgi( control.getRezervations(), mustarih, musmasano);
                            }
                        }
                    }
    }//GEN-LAST:event_deleteReservationButtonActionPerformed

    private void deleteALLReservationsButtonActionPerformed() {//GEN-FIRST:event_deleteALLReservationsButtonActionPerformed
       if(getSayac() != 0) {
                        int result = JOptionPane.showConfirmDialog(MüşteriBilgi.this, "Tablodaki BÜTÜN Rezervasyonları Silmek İstediğine Emin Misin?", "Onayla",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE);
                        if (result == JOptionPane.YES_OPTION) {
                            control.deleteAllRezervations(mustarih, control.getRezervations(),musmasano);
                            JOptionPane.showMessageDialog(MüşteriBilgi.this, "Listedeki Bütün Rezervasyonlar Silindi.",
                                    "Silindi", JOptionPane.WARNING_MESSAGE);
                            dispose();
                            Arayüz arayüz =new Arayüz();
                            arayüz.setVisible(true);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(MüşteriBilgi.this,"Liste Boş.",
                                "Hata",JOptionPane.ERROR_MESSAGE);
                    }
    }//GEN-LAST:event_deleteALLReservationsButtonActionPerformed

    private void goBackButtonActionPerformed() {//GEN-FIRST:event_goBackButtonActionPerformed
       dispose();
                   Arayüz arayüz =new Arayüz();
                arayüz.setVisible(true);
    }//GEN-LAST:event_goBackButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DataPanel;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton deleteALLReservationsButton;
    private javax.swing.JButton deleteReservationButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton showNoteButton;
    // End of variables declaration//GEN-END:variables
}
