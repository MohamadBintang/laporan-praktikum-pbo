
public class Laptop1841720007Bintang {

    private String merk;
    private Processor1841720007Bintang proc;

    public Laptop1841720007Bintang() {
        this.merk = merk;
        this.proc = proc;
    }

    public Laptop1841720007Bintang(String merk, Processor1841720007Bintang proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public String getMerkBintang() {
        return merk;
    }

    public void setMerkBintang(String merk) {
        this.merk = merk;
    }

    public Processor1841720007Bintang getProc() {
        return proc;
    }

    public void setProcBintang(Processor1841720007Bintang proc) {
        this.proc = proc;
    }
    
    
    
    public void infoBintang(){
        System.out.println("Merk Laptop = " + merk);
        proc.infoBintang();
    }
}
