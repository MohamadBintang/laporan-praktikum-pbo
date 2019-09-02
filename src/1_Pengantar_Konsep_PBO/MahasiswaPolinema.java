package com.mycompany.mahasiswa;

public class MahasiswaPolinema {

    public static void main(String[] args) {
           Mahasiswa mhs1 = new Mahasiswa();
           JenisMahasiswa mhs2 = new JenisMahasiswa();
           
           mhs1.setNama("Mohamad Bintang Satriavi");
           mhs1.setKelas("TI-2D");
           mhs1.setAlpha(3);
           mhs1.TambahKompen(1);
           mhs1.cetakStatus();
           
           System.out.println("");
           System.out.print("========================");
           System.out.println("");
          
           
           mhs2.setNama("Bogel Polinema");
           mhs2.setKelas("TI-2A");
           mhs2.setAlpha(2);
           mhs2.TambahKompen(0);
           mhs2.statusMahasiswa("Aktif");
           mhs2.cetakStatus();
    }

}
