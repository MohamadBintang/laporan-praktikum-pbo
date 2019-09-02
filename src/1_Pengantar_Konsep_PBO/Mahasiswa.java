
package com.mycompany.mahasiswa;
public class Mahasiswa {
    private String nama;
    private String kelas;
    private int alpha;
    private int kompen;
    
    public void setNama(String newValue){
        nama = newValue;
    }
    public void setKelas(String newValue){
        kelas = newValue;
    }
    
    public void setAlpha(int newValue){
        alpha = newValue;
    }
    
    public void TambahKompen(int increment){
        increment = 1 + 1;
        kompen = alpha * increment;
        System.out.println("Jumlah Kompen: " + kompen);
    }
    public void KurangKompen(int decrement){
        kompen = alpha - decrement;
    }
    public void cetakStatus(){
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Jumlah Alpha: " + alpha);
        System.out.println("Jumlah Kompen: " + kompen);
    }
}
