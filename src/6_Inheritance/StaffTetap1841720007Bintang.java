
public class StaffTetap1841720007Bintang extends Staff1841720007Bintang {

    public String golongan;
    public int asuransi;
    
    public StaffTetap1841720007Bintang(){
    
    }
    
    public StaffTetap1841720007Bintang(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(nama,alamat,jk,umur,gaji,potongan,lembur);
        this.golongan=golongan;
        this.asuransi=asuransi;
    }
    
    public void tampilDataStaffTetapBintang(){
        System.out.println("===============Data Staff Tetap===============");
        super.tampilDataStaffBintang();
        System.out.println("Golongan        : "+golongan);
        System.out.println("Jumlah Asuransi : "+asuransi);
        System.out.println("Gaji Bersih     : "+(gaji+lembur-potongan-asuransi));
    }
}
