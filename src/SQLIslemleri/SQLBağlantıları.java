package SQLIslemleri;
import Kullanıcılar.Admin;
import Kullanıcılar.Müşteriler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SQLBağlantıları {

   public Admin adminControl(String username, String password){
        Admin admin = null;

        final String DB_URL = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7708218";
        final String USERNAME = "sql7708218";
        final String PASSWORD = "4qc5kdsH12";

        try{
            Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM admins WHERE username=? and password =?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                admin = new Admin();
                admin.setUsername(resultSet.getString("username"));
                admin.setPassword(resultSet.getString("password"));
            }

            stmt.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return admin;
    }
    public Müşteriler addRezervation(String isim,String soyisim, String kisisayisi,String masano,String giriszamani,String cikiszamani,
                                  String musterinot,String tarih,String kod){
        Müşteriler rzv = null;
        final String DB_URL = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7708218";
        final String USERNAME = "sql7708218";
        final String PASSWORD = "4qc5kdsH12";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO rezervation (ad, soyad, kisisayisi, masano, giriszamani, cikiszamani, nt, tarih, kod)" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, isim);
            preparedStatement.setString(2, soyisim);
            preparedStatement.setString(3, kisisayisi);
            preparedStatement.setString(4, masano);
            preparedStatement.setString(5, giriszamani);
            preparedStatement.setString(6, cikiszamani);
            preparedStatement.setString(7, musterinot);
            preparedStatement.setString(8, tarih);
            preparedStatement.setString(9,kod);

            int addedRows = preparedStatement.executeUpdate();
            if(addedRows > 0){
                rzv = new Müşteriler();
                rzv.setIsim(isim);rzv.setSoyisim(soyisim);rzv.setKisisayisi(kisisayisi);rzv.setMasano(masano);rzv.setGiriszamani(giriszamani);rzv.setCikiszamani(cikiszamani);
                rzv.setMusterinot(musterinot);rzv.setTarih(tarih);rzv.setKod(kod);
            }

            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rzv;
    }
    public Müşteriler rezervationControl(String kod){
        Müşteriler rzv = null;

        final String DB_URL = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7708218";
        final String USERNAME = "sql7708218";
        final String PASSWORD = "4qc5kdsH12";

        try{
            Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM rezervation WHERE kod=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,kod);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                rzv = new Müşteriler();
                rzv.setIsim(resultSet.getString("ad"));
                rzv.setSoyisim(resultSet.getString("soyad"));
                rzv.setMusterinot(resultSet.getString("nt"));
                rzv.setGiriszamani(resultSet.getString("giriszamani"));
                rzv.setCikiszamani(resultSet.getString("cikiszamani"));
                rzv.setTarih(resultSet.getString("tarih"));
                rzv.setMasano(resultSet.getString("masano"));
                rzv.setKisisayisi(resultSet.getString("kisisayisi"));
            }

            stmt.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return rzv;
    }

    public void deleteRezervation(String kod){

        final String DB_URL = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7708218";
        final String USERNAME = "sql7708218";
        final String PASSWORD = "4qc5kdsH12";

        try{
            Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM rezervation WHERE kod='"+kod+"'";
            stmt.executeUpdate(sql);

            stmt.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public  ArrayList<Müşteriler> getRezervations(){
            ArrayList<Müşteriler> liste = new ArrayList<>();
            Müşteriler rzv;

        final String DB_URL = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7708218";
        final String USERNAME = "sql7708218";
        final String PASSWORD = "4qc5kdsH12";

            try {
                    Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                    Statement stmt = conn.createStatement();
                    String sql = "SELECT * FROM rezervation";
                    PreparedStatement preparedStatement = conn.prepareStatement(sql);

                    ResultSet resultSet = preparedStatement.executeQuery();

                    while (resultSet.next()) {
                        rzv = new Müşteriler();
                        rzv.setIsim(resultSet.getString("ad"));
                        rzv.setSoyisim(resultSet.getString("soyad"));
                        rzv.setMusterinot(resultSet.getString("nt"));
                        rzv.setGiriszamani(resultSet.getString("giriszamani"));
                        rzv.setCikiszamani(resultSet.getString("cikiszamani"));
                        rzv.setTarih(resultSet.getString("tarih"));
                        rzv.setMasano(resultSet.getString("masano"));
                        rzv.setKisisayisi(resultSet.getString("kisisayisi"));
                        rzv.setKod(resultSet.getString("kod"));
                        liste.add(rzv);
                    }

                    stmt.close();
                    conn.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            return liste;
        }
    public void deleteAllRezervations(String tarih,ArrayList<Müşteriler> liste,String masano) {

        final String DB_URL = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7708218";
        final String USERNAME = "sql7708218";
        final String PASSWORD = "4qc5kdsH12";

        boolean checkdate;
        boolean checktable;
        String kod;
        TimeConverter converter = new TimeConverter();

        for (Müşteriler rzv : liste) {
            kod = rzv.getKod();

            if (tarih.equals("---Tüm tarihler---")) checkdate = true;
            else if (tarih.equals("Old") && converter.convertDate(converter.CurrentDate()) > converter.convertDate(rzv.getTarih()))checkdate = true;
            else if (tarih.equals(rzv.getTarih())) checkdate = true;
            else checkdate = false;

            if(masano.isEmpty()) checktable = true;
            else if(rzv.getMasano().equals(masano)) checktable = true;
            else checktable = false;

            if (checkdate && checktable) {
                try {
                    Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                    Statement stmt = conn.createStatement();
                    String sql = "DELETE FROM rezervation WHERE kod='" + kod + "'";
                    stmt.executeUpdate(sql);

                    stmt.close();
                    conn.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public int rowSize(){

        final String DB_URL = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7708218";
        final String USERNAME = "sql7708218";
        final String PASSWORD = "4qc5kdsH12";
        int size = 0;

        try{
            Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            Statement stmt = conn.createStatement();
            String sql = "SELECT count(*) FROM rezervation";
            ResultSet resultSet = stmt.executeQuery(sql);

            while (resultSet.next()) {
                size = resultSet.getInt("count(*)");
            }

            stmt.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return size;
    }
    }

