public class Staff1841720007Bintang extends Karyawan1841720007Bintang {
    public int lembur, potongan;
    
    public Staff1841720007Bintang(){
        
    }
    
    public Staff1841720007Bintang(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan){
        super(nama,alamat,jk,umur,gaji);
        this.lembur=lembur;
        this.potongan=potongan;   
    }
    
    public void tampilDataStaffBintang(){
        super.tampilDataKaryawanBintang();
        System.out.println("Lembur      ="+lembur);
        System.out.println("Potongan    ="+potongan);
        System.out.println("Total Gaji  ="+(gaji+lembur-potongan));
    }
    
}
