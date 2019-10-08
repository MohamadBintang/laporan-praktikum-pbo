
public class StaffHarian1841720007Bintang extends Staff1841720007Bintang {
        public int jmlJamKerja;
    
    public StaffHarian1841720007Bintang(){
    
    }
    public StaffHarian1841720007Bintang(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jlmJamKerja){
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja=jmlJamKerja;
    }
    
    public void tampilStaffHarianBintang(){
        System.out.println("===============Data Staff Harian===============");
        super.tampilDataStaffBintang();
        System.out.println("Jumlah Jam Kerja : "+jmlJamKerja);
        System.out.println("Gaji Bersih      : "+(gaji*jmlJamKerja+lembur-potongan));
    }
}
