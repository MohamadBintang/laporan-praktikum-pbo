package backend;

import java.util.ArrayList;
import java.sql.*;

public class Kategori1841720007Bintang {

    private int mIdkategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720007Bintang() {
    }

    public Kategori1841720007Bintang(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public int getIdkategoriBintang() {
        return mIdkategori;
    }

    public void setIdkategoriBintang(int mIdkategori) {
        this.mIdkategori = mIdkategori;
    }

    public String getNamaBintang() {
        return mNama;
    }

    public void setNamaBintang(String mNama) {
        this.mNama = mNama;
    }

    public String getKeteranganBintang() {
        return mKeterangan;
    }

    public void setKeteranganBintang(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720007Bintang getByIdBintang(int id) {
        Kategori1841720007Bintang kat = new Kategori1841720007Bintang();
        ResultSet rs = DBHelper1841720007Bintang.selectQueryBintang("SELECT * FROM kategori " + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1841720007Bintang();
                kat.setIdkategoriBintang(rs.getInt("idkategori"));
                kat.setNamaBintang(rs.getString("nama"));
                kat.setKeteranganBintang(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720007Bintang> getAllBintang() {
        ArrayList<Kategori1841720007Bintang> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1841720007Bintang.selectQueryBintang("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720007Bintang kat = new Kategori1841720007Bintang();
                kat.setIdkategoriBintang(rs.getInt("idkategori"));
                kat.setNamaBintang(rs.getString("nama"));
                kat.setKeteranganBintang(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720007Bintang> searchBintang(String keyword) {
        ArrayList<Kategori1841720007Bintang> ListKategori = new ArrayList();

        String sql = "SELECT * FROM kategori WHERE " + " nama LIKE '%" + keyword + "%' " + " OR keterangan LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720007Bintang.selectQueryBintang(sql);

        try {
            while (rs.next()) {
                Kategori1841720007Bintang kat = new Kategori1841720007Bintang();
                kat.setIdkategoriBintang(rs.getInt("idkategori"));
                kat.setNamaBintang(rs.getString("nama"));
                kat.setKeteranganBintang(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveBintang() {
        if (getByIdBintang(mIdkategori).getIdkategoriBintang() == 0) {
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES(" + " '" + this.mNama + "', " + " '" + this.mKeterangan + "' " + " )";
            this.mIdkategori = DBHelper1841720007Bintang.insertQueryGetIdBintang(SQL);
        } else {
            String SQL = "UPDATE kategori SET " + " nama = '" + this.mNama + "', " + " keterangan = '" + this.mKeterangan + "' " + " WHERE idkategori = '" + this.mIdkategori + "'";
            DBHelper1841720007Bintang.executeQueryBintang(SQL);
        }
    }
    
    public void deleteBintang()
    {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.mIdkategori + "'";
        DBHelper1841720007Bintang.executeQueryBintang(SQL);
    }
    
    public String toString()
    {
        return mNama;
    }
}
