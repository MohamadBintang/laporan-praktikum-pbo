
public class Staff1841720007Bintang extends Karyawan1841720007Bintang {
    private int lembur;
    private double gajiLembur;

    public int getLemburBintang() {
        return lembur;
    }

    public void setLemburBintang(int lembur) {
        this.lembur = lembur;
    }

    public double getGajiLemburBintang() {
        return gajiLembur;
    }

    public void setGajiLemburBintang(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiBintang(int lembur, double gajiLembur){
        return super.getGajiBintang()+lembur*gajiLembur;
    }
    
    public double getGajiBintang(){
        return super.getGajiBintang()+lembur*gajiLembur;
    }
    
    public void lihatInfoBintang(){
        System.out.println("NIP     :"+this.getNipBintang());
        System.out.println("Nama    :"+this.getNamaBintang());
        System.out.println("Golongan:"+this.getGolonganBintang());
        System.out.println("Lembur  :"+this.getLemburBintang());
        System.out.printf("Gaji Lembur:%.0f\n", this.getGajiLemburBintang());
        System.out.printf("Gaji     :%.0f\n", this.getGajiBintang());
    }
    
    
}
