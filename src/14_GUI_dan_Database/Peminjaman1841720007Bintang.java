package backend;

import java.util.ArrayList;
import java.sql.*;


public class Peminjaman1841720007Bintang {

    private int mIdpeminjaman;
    private Anggota1841720007Bintang mAnggota = new Anggota1841720007Bintang();
    private Buku1841720007Bintang mBuku = new Buku1841720007Bintang();
    private String mTanggalpinjam;
    private String mTanggalkembali;

    public Peminjaman1841720007Bintang() {
    }

    public Peminjaman1841720007Bintang(Anggota1841720007Bintang mAnggota, Buku1841720007Bintang mBuku, String mTanggalpinjam, String mTanggalkembali) {
        this.mAnggota = mAnggota;
        this.mBuku = mBuku;
        this.mTanggalpinjam = mTanggalpinjam;
        this.mTanggalkembali = mTanggalkembali;
    }

    public int getIdpeminjamanBintang() {
        return mIdpeminjaman;
    }

    public void setIdpeminjamanBintang(int mIdpeminjaman) {
        this.mIdpeminjaman = mIdpeminjaman;
    }

    public Anggota1841720007Bintang getAnggotaBintang() {
        return mAnggota;
    }

    public void setAnggotaBintang(Anggota1841720007Bintang mAnggota) {
        this.mAnggota = mAnggota;
    }

    public Buku1841720007Bintang getBukuBintang() {
        return mBuku;
    }

    public void setBukuBintang(Buku1841720007Bintang mBuku) {
        this.mBuku = mBuku;
    }

    public String getTanggalpinjamBintang() {
        return mTanggalpinjam;
    }

    public void setTanggalpinjamBintang(String mTanggalpinjam) {
        this.mTanggalpinjam = mTanggalpinjam;
    }

    public String getTanggalkembaliBintang() {
        return mTanggalkembali;
    }

    public void setTanggalkembaliBintang(String mTanggalkembali) {
        this.mTanggalkembali = mTanggalkembali;
    }

    public Peminjaman1841720007Bintang getByIdBintang(int id) {
        Peminjaman1841720007Bintang pinjam = new Peminjaman1841720007Bintang();
        ResultSet rs = DBHelper1841720007Bintang.selectQueryBintang("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali, "
                + " a.idanggota AS idanggota, "
                + " b.idbuku AS idbuku "
                + " FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + " LEFT JOIN buku b ON p.idbuku = b.idbuku WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {
                pinjam = new Peminjaman1841720007Bintang();
                pinjam.setIdpeminjamanBintang(rs.getInt("idpeminjaman"));
                pinjam.getAnggotaBintang().setIdanggotaBintang(rs.getInt("idanggota"));
                pinjam.getBukuBintang().setIdbukuBintang(rs.getInt("idbuku"));
                pinjam.setTanggalpinjamBintang(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembaliBintang(rs.getString("tanggalkembali"));
                pinjam.setAnggotaBintang(new Anggota1841720007Bintang().getByIdBintang(pinjam.getAnggotaBintang().getIdanggotaBintang()));
                pinjam.setBukuBintang(new Buku1841720007Bintang().getByIdBintang(pinjam.getBukuBintang().getIdbukuBintang()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pinjam;
    }

    public ArrayList<Peminjaman1841720007Bintang> getAllBintang() {
        ArrayList<Peminjaman1841720007Bintang> ListPinjam = new ArrayList();
        ResultSet rs = DBHelper1841720007Bintang.selectQueryBintang("SELECT "
                + "p.idpeminjaman AS idpeminjaman, "
                + "p.tanggalpinjam AS tanggalpinjam, "
                + "p.tanggalkembali AS tanggalkembali, "
                + "a.idanggota AS idanggota, "
                + "b.idbuku AS idbuku "
                + "FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON p.idbuku = b.idbuku");
        try {
            while (rs.next()) {
                Peminjaman1841720007Bintang pinjam = new Peminjaman1841720007Bintang();
                pinjam.setIdpeminjamanBintang(rs.getInt("idpeminjaman"));
                pinjam.getAnggotaBintang().setIdanggotaBintang(rs.getInt("idanggota"));
                pinjam.getBukuBintang().setIdbukuBintang(rs.getInt("idbuku"));
                pinjam.setTanggalpinjamBintang(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembaliBintang(rs.getString("tanggalkembali"));
                pinjam.setAnggotaBintang(new Anggota1841720007Bintang().getByIdBintang(pinjam.getAnggotaBintang().getIdanggotaBintang()));
                pinjam.setBukuBintang(new Buku1841720007Bintang().getByIdBintang(pinjam.getBukuBintang().getIdbukuBintang()));

                ListPinjam.add(pinjam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPinjam;
    }

    public void saveBintang() {
        if (getByIdBintang(mIdpeminjaman).getIdpeminjamanBintang() == 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "values ("
                    + "'" + this.getAnggotaBintang().getIdanggotaBintang() + "', "
                    + "'" + this.getBukuBintang().getIdbukuBintang() + "',"
                    + "'" + this.mTanggalpinjam + "', "
                    + "'" + this.mTanggalkembali + "' "
                    + ")";
            this.mIdpeminjaman = DBHelper1841720007Bintang.insertQueryGetIdBintang(sql);
        } else {
            String sql = "UPDATE buku SET "
                    + "idanggota = '" + this.getAnggotaBintang().getIdanggotaBintang() + "', "
                    + "idbuku = '" + this.getBukuBintang().getIdbukuBintang() + "', "
                    + "tanggalpinjam = '" + this.mTanggalpinjam + "', "
                    + "tanggalkembali = '" + this.mTanggalkembali + "'";
            DBHelper1841720007Bintang.executeQueryBintang(sql);
        }
    }

    public void cariAnggotaBintang(int id) {
        ResultSet rs = DBHelper1841720007Bintang.selectQueryBintang("SELECT * FROM anggota WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                getAnggotaBintang().setIdanggotaBintang(rs.getInt("idanggota"));
                getAnggotaBintang().setNamaBintang(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cariBukuBintang(int id) {
        ResultSet rs = DBHelper1841720007Bintang.selectQueryBintang("SELECT * FROM buku WHERE idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                getBukuBintang().setIdbukuBintang(rs.getInt("idbuku"));
                getBukuBintang().setJudulBintang(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteBintang() {
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.mIdpeminjaman + "'";
        DBHelper1841720007Bintang.executeQueryBintang(sql);
    }
}
