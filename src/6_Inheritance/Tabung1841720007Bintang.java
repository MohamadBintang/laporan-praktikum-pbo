
public class Tabung1841720007Bintang extends Bangun1841720007Bintang {

    protected int t;

    public void setSuperPhiBintang(double phi) {
        super.phi = phi;
    }

    public void setSuperRBintang(int r) {
        super.r = r;
    }

    public void setTBintang(int t) {
        this.t = t;
    }
    
    public void volume(){
        System.out.println("Volume Tabung adalah: " +(super.phi*super.r*super.r*this.t));
    }
}
