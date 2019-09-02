package com.mycompany.mahasiswa;

public class JenisMahasiswa extends Mahasiswa {

    private String status;
    
    public void statusMahasiswa(String newValue){
        status = newValue;
    }
    
    @Override
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Status Mahasiswa: " + status);
    }
}
