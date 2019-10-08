
public class Manager1841720007Bintang extends Karyawan1841720007Bintang {
    public int tunjangan;
    
    public Manager1841720007Bintang(){
        
    }
    
    public void tampilDataManager(){
        super.tampilDataKaryawanBintang();
        System.out.println("Tunjangan       ="+tunjangan);
        System.out.println("Total Gaji      ="+(super.gaji+tunjangan));
    }
}
