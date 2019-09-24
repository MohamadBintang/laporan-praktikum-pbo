
public class Processor1841720007Bintang {

    private String merk;
    private double cache;

    public Processor1841720007Bintang() {
        this.merk = merk;
        this.cache = cache;
    }

    public Processor1841720007Bintang(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }
    
    

    public void setMerkBintang(String merk) {
        this.merk = merk;
    }

    public void setCacheBintang(double cache) {
        this.cache = cache;
    }

    public String getMerkBintang() {
        return merk;
    }

    public double getCacheBintang() {
        return cache;
    }
  
    
    public void infoBintang(){
    System.out.printf("Merk Processor = %s\n", merk);
    System.out.printf("Cache Memory = %.2f\n", cache); } 
    
    
}
