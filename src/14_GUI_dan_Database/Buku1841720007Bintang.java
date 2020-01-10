package backend;

import java.util.ArrayList;
import java.sql.*;

public class Buku1841720007Bintang {

    private int mIdbuku;
    private Kategori1841720007Bintang mKategori = new Kategori1841720007Bintang();
    private String mJudul;
    private String mPenerbit;
    private String mPenulis;

    public Buku1841720007Bintang() {
    }

    public Buku1841720007Bintang(Kategori1841720007Bintang mKategori, String mJudul, String mPenerbit, String mPenulis) {
        this.mKategori = mKategori;
        this.mJudul = mJudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }

    public int getIdbukuBintang() {
        return mIdbuku;
    }

    public void setIdbukuBintang(int mIdbuku) {
        this.mIdbuku = mIdbuku;
    }

    public Kategori1841720007Bintang getKategoriBintang() {
        return mKategori;
    }

    public void setKategoriBintang(Kategori1841720007Bintang mKategori) {
        this.mKategori = mKategori;
    }

    public String getJudulBintang() {
        return mJudul;
    }

    public void setJudulBintang(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getPenerbitBintang() {
        return mPenerbit;
    }

    public void setPenerbitBintang(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getPenulisBintang() {
        return mPenulis;
    }

    public void setPenulisBintang(String mPenulis) {
        this.mPenulis = mPenulis;
    }

    public Buku1841720007Bintang getByIdBintang(int id) {
        Buku1841720007Bintang buku = new Buku1841720007Bintang();
        ResultSet rs = DBHelper1841720007Bintang.selectQueryBintang("SELECT " + " b.idbuku AS idbuku, " + " b.judul AS judul, " + " b.penerbit AS penerbit, " + " b.penulis AS penulis, " + " k.idkategori AS idkategori, " + " k.nama AS nama, " + " k.keterangan AS keterangan " + " FROM buku b " + " LEFT JOIN kategori k ON b.idkategori = k.idkategori " + " WHERE b.idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                buku = new Buku1841720007Bintang();
                buku.setIdbukuBintang(rs.getInt("idbuku"));
                buku.getKategoriBintang().setIdkategoriBintang(rs.getInt("idkategori"));
                buku.getKategoriBintang().setNamaBintang(rs.getString("nama"));
                buku.getKategoriBintang().setKeteranganBintang(rs.getString("keterangan"));
                buku.setJudulBintang(rs.getString("judul"));
                buku.setPenerbitBintang(rs.getString("penerbit"));
                buku.setPenulisBintang(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1841720007Bintang> getAllBintang() {
        ArrayList<Buku1841720007Bintang> ListBuku = new ArrayList();

        ResultSet rs = DBHelper1841720007Bintang.selectQueryBintang("SELECT " + " b.idbuku AS idbuku, " + " b.judul AS judul, " + " b.penerbit AS penerbit, " + " b.penulis AS penulis, " + " k.idkategori AS idkategori, " + " k.nama AS nama, " + " k.keterangan AS keterangan " + " FROM buku b " + " LEFT JOIN kategori k ON b.idkategori = k.idkategori ");

        try {
            while (rs.next()) {
                Buku1841720007Bintang buku = new Buku1841720007Bintang();
                buku.setIdbukuBintang(rs.getInt("idbuku"));
                buku.getKategoriBintang().setIdkategoriBintang(rs.getInt("idkategori"));
                buku.getKategoriBintang().setNamaBintang(rs.getString("nama"));
                buku.getKategoriBintang().setKeteranganBintang(rs.getString("keterangan"));
                buku.setJudulBintang(rs.getString("judul"));
                buku.setPenerbitBintang(rs.getString("penerbit"));
                buku.setPenulisBintang(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public ArrayList<Buku1841720007Bintang> searchBintang(String keyword) {
        ArrayList<Buku1841720007Bintang> ListBuku = new ArrayList();

        ResultSet rs = DBHelper1841720007Bintang.selectQueryBintang("SELECT " + " b.idbuku AS idbuku, " + " b.judul AS judul, " + " b.penerbit AS penerbit, " + " b.penulis AS penulis, " + " k.idkategori AS idkategori, " + " k.nama AS nama, " + " k.keterangan AS keterangan " + " FROM buku b " + " LEFT JOIN kategori k ON b.idkategori = k.idkategori " + " WHERE b.judul LIKE '%" + keyword + "%' " + " OR b.penerbit LIKE '%" + keyword + "%' " + " OR b.penulis LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                Buku1841720007Bintang buku = new Buku1841720007Bintang();
                buku.setIdbukuBintang(rs.getInt("idbuku"));
                buku.getKategoriBintang().setIdkategoriBintang(rs.getInt("idkategori"));
                buku.getKategoriBintang().setNamaBintang(rs.getString("nama"));
                buku.getKategoriBintang().setKeteranganBintang(rs.getString("keterangan"));
                buku.setJudulBintang(rs.getString("judul"));
                buku.setPenerbitBintang(rs.getString("penerbit"));
                buku.setPenulisBintang(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void saveBintang() {
        if (getByIdBintang(mIdbuku).getIdbukuBintang() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES(" + " '" + this.mJudul + "', " + " '" + this.getKategoriBintang().getIdkategoriBintang() + "', " + " '" + this.mPenulis + "', " + " '" + this.mPenerbit + "' " + " )";
            this.mIdbuku = DBHelper1841720007Bintang.insertQueryGetIdBintang(SQL);
        } else {
            String SQL = "UPDATE buku SET " + " judul = '" + this.mJudul + "', " + " idkategori = '" + this.getKategoriBintang().getIdkategoriBintang() + "', " + " penulis = '" + this.mPenulis + "', " + " penerbit = '" + this.mPenerbit + "' " + " WHERE idbuku = '" + this.mIdbuku + "'";
            DBHelper1841720007Bintang.executeQueryBintang(SQL);
        }
    }

    public void deleteBintang() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.mIdbuku + "'";
        DBHelper1841720007Bintang.executeQueryBintang(SQL);
    }
}
