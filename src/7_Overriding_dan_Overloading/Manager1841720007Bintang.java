
public class Manager1841720007Bintang extends Karyawan1841720007Bintang {
    private double tunjangan;
    private String bagian;
    private Staff1841720007Bintang st[];

    public double getTunjanganBintang() {
        return tunjangan;
    }

    public void setTunjanganBintang(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getBagianBintang() {
        return bagian;
    }

    public void setBagianBintang(String bagian) {
        this.bagian = bagian;
    }

    public void setStBintang(Staff1841720007Bintang[] st) {
        this.st = st;
    }
    
    public void viewStaffBintang(){
        int i;
        System.out.println("------------------");
        for (i=0; i<st.length;i++) {
            st[i].lihatInfoBintang();
        }
        System.out.println("------------------");
    }
    
    public void lihatInfoBintang(){
        System.out.println("Manager :"+this.getBagianBintang());
        System.out.println("NIP     :"+this.getNipBintang());
        System.out.println("Nama    :"+this.getNamaBintang());
        System.out.println("Golongan:"+this.getGolonganBintang());
        System.out.printf("Tunjangan:%.0f\n",this.getTunjanganBintang());
        System.out.printf("Gaji     :%.0f\n",this.getGajiBintang());
        System.out.println("Bagian  :"+this.getBagianBintang());
        this.viewStaffBintang();
    }
    
    public double getGaji(){
        return super.getGajiBintang()+tunjangan;
    }
}
