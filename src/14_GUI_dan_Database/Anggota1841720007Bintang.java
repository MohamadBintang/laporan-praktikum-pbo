package backend;

import java.util.ArrayList;
import java.sql.*;

public class Anggota1841720007Bintang {
    
    private int mIdanggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720007Bintang() {
    }

    public Anggota1841720007Bintang(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getIdanggotaBintang() {
        return mIdanggota;
    }

    public void setIdanggotaBintang(int mIdanggota) {
        this.mIdanggota = mIdanggota;
    }

    public String getNamaBintang() {
        return mNama;
    }

    public void setNamaBintang(String mNama) {
        this.mNama = mNama;
    }

    public String getAlamatBintang() {
        return mAlamat;
    }

    public void setAlamatBintang(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getTeleponBintang() {
        return mTelepon;
    }

    public void setTeleponBintang(String mTelepon) {
        this.mTelepon = mTelepon;
    }
    
    public Anggota1841720007Bintang getByIdBintang(int id)
    {
        Anggota1841720007Bintang agt = new Anggota1841720007Bintang();
        ResultSet rs = DBHelper1841720007Bintang.selectQueryBintang("SELECT * FROM anggota " + " WHERE idanggota = '" + id + "'");
        
        try {
            while (rs.next()) {
                agt = new Anggota1841720007Bintang();
                agt.setIdanggotaBintang(rs.getInt("idanggota"));
                agt.setNamaBintang(rs.getString("nama"));
                agt.setAlamatBintang(rs.getString("alamat"));
                agt.setTeleponBintang(rs.getString("telepon"));
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }
    
    public ArrayList<Anggota1841720007Bintang> getAllBintang() {
        ArrayList<Anggota1841720007Bintang> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720007Bintang.selectQueryBintang("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720007Bintang agt = new Anggota1841720007Bintang();
                agt.setIdanggotaBintang(rs.getInt("idanggota"));
                agt.setNamaBintang(rs.getString("nama"));
                agt.setAlamatBintang(rs.getString("alamat"));
                agt.setTeleponBintang(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public ArrayList<Anggota1841720007Bintang> searchBintang(String keyword) {
        ArrayList<Anggota1841720007Bintang> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE " + " nama LIKE '%" + keyword + "%' " + " OR alamat LIKE '%" + keyword + "%' " + " OR telepon LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720007Bintang.selectQueryBintang(sql);

        try {
            while (rs.next()) {
                Anggota1841720007Bintang agt = new Anggota1841720007Bintang();
                agt.setIdanggotaBintang(rs.getInt("idanggota"));
                agt.setNamaBintang(rs.getString("nama"));
                agt.setAlamatBintang(rs.getString("alamat"));
                agt.setTeleponBintang(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public void saveBintang() {
        if (getByIdBintang(mIdanggota).getIdanggotaBintnag()== 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES(" + " '" + this.mNama + "', " + " '" + this.mAlamat + "', " + " '" + this.mTelepon + "' " + " )";
            this.mIdanggota = DBHelper1841720007Bintang.insertQueryGetIdBintang(SQL);
        } else {
            String SQL = "UPDATE anggota SET " + " nama = '" + this.mNama + "', " + " alamat = '" + this.mAlamat + "', " + " telepon = '" + this.mTelepon + "' " + " WHERE idanggota = '" + this.mIdanggota + "'";
            DBHelper1841720007Bintang.executeQueryBintang(SQL);
        }
    }
    
    public void deleteBintang()
    {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.mIdanggota + "'";
        DBHelper1841720007Bintang.executeQueryBintang(SQL);
    }
}
